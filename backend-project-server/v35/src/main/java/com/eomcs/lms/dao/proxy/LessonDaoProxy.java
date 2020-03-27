package com.eomcs.lms.dao.proxy;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;

//프록시 객체는 항상 작업 객체와 동일한 인터페이스를 구현해야 한다. (implements BoardDao)
// => 마치 자기가 작업 객체인 양 보이기 위함이다.
// => Lesson 작업 객체를 대행할 프록시를 정의한다.

public class LessonDaoProxy implements LessonDao {

  ObjectInputStream in;
  ObjectOutputStream out;

  public LessonDaoProxy (ObjectInputStream in, ObjectOutputStream out) {
    this.in = in;
    this.out = out;
  }


  @Override
  public int insert(Lesson lesson) throws Exception {
    out.writeUTF("/lesson/add");
    out.writeObject(lesson);
    out.flush();
    String response = in.readUTF();
    if (response.equals("FAIL")) {
      throw new Exception(in.readUTF());
    }
    return 1;
  }

  @Override
  public List<Lesson> findAll() throws Exception {
    String response = in.readUTF();
    if (response.equals("FAIL")) {
      throw new Exception(in.readUTF());
    }
    return null;
  }


  @Override
  public Lesson findByNo(int no) throws Exception {
    out.writeUTF("/lesson/detail");
    out.writeInt(no);
    out.flush();

    String response = in.readUTF();
    if (response.equals("FAIL")) {
      throw new Exception(in.readUTF());
    }
    return (Lesson) in.readObject();
  }


  @Override
  public int update(Lesson lesson) throws Exception {
    out.writeUTF("/lesson/update");
    out.writeObject(lesson);
    out.flush();

    String response = in.readUTF();
    if (response.equals("FAIL")) {
      throw new Exception(in.readUTF());
    }
    return 1;
  }

  @Override
  public int delete(int no) throws Exception {
    out.writeUTF("/lesson/delete");
    out.writeInt(no);
    out.flush();

    String response = in.readUTF();

    if (response.equals("FAIL")) {
      throw new Exception(in.readUTF());
    }
    return 1;
  }
}