# 학습 내용 이해도 자가 진단표

## 프로그래밍 개론

#### 컴퓨터와 소프트웨어

- [o] 컴퓨터와 소프트웨어의 관계를 이해한다.
- [o] 시스템 소프트웨어와 응용 소프트웨어를 구분할 수 있다.
>★ 시스템 소프트웨어는 컴퓨터를 작동시키고, 효율적으로 사용하기 위한 프로그램으로서, 사용자들이 컴퓨터를 보다 편리하게 이용할 수 있도록 도와준다. 즉, 컴퓨터 사용자는 하드웨어의 구조나 특성을 몰라도 시스템 소프트웨어의 사용 방법만 알면 컴퓨터를 이용할 수 있다.
시스템 소프트웨어에는 운영 체제, 언어 프로그램, 유틸리티 프로그램 등이 있다.
응용 소프트웨어는 어떤 목적을 달성하기 위해서 만들어진 프로그램이다. 그 대부분을 소프트웨어 업체에서 여러 가지 일을 효율적으로 처리할 수 있는 프로그램들을 미리 만들어 제공하며, 사용자는 목적에 맞는 것을 골라 사용한다. 응용 소프트웨어는 사용 목적에 따라 일반 업무용, 교육용, 가사용, 오락용, 특수 업무용으로 구분할 수 있다.

#### 프로그램의 구동 원리

- [o] 컴퓨터에서 프로그램이 실행되는 원리를 이해한다. 
- [o] CPU(ARM CPU 기준) 인스트럭션이 무엇인지 이해한다.
>★진짜 기계어이다.
  `http://vision.gel.ulaval.ca/~jflalonde/cours/1001/h17/docs/arm-instructionset.pdf`
- [o] CPU 인스트럭션과 실행 파일, OS의 관계를 이해한다.
- [o] 같은 CPU에 맞춰 작성된 실행 파일이더라도 OS가 다르면 실행되지 않는 이유를 설명할 수 있다.  
>★실행파일의 구조가 다르기 때문. 윈도우와 리눅스, 맥의 실행 파일의 구조가 다르기 때문에 서로 다른 운영체제의 프로그램 파일을 해석해서 메모리에 올릴 수 없다.

#### 중간 언어와 가상 머신

- [o] 중간 언어와 가상 머신이 등장한 이유와 이점을 설명할 수 있다. 
>★중간 언어는 컴퓨터 프로그램의 분석을 돕기위해 설계된 추상적 기계 언어이다. 최적화하기 용이하고 기계어 생성시 빠르게 처리할 수 있기 때문에 이용한다. (ex. *.class)

>★가상머신이란 프로그램을 실행하기 위해 물리적 머신과 유사한 머신을 소프트웨어로 구현한 것이다. JVM의 역할은 자바 애플리케이션을 클래스 로더를 통해 읽어들여 자바 API와 함께 실행하는 것이다. 그리고 JVM은 Java와 OS 사이에서 중개자 역할을 수행하여 Java가 OS에 구애받지 않고 재사용을 가능하게 해 준다. 그리고 가장 중요한 메모리관리, Garbage Collection을 수행한다. 
- [o] VM과 인터프리터, 런타임, 플레이어, 엔진의 역할을 이해한다. 
>★중간언어나 소스를 실행해 주는 역할 	
- [o]]] JIT(Just-in-time)과 AOT(ahead-of-time)이 무엇이고 등장한 이유를 이해한다.
>★컴파일러의 종류. 실행하는 순간 즉각적으로 기계어로 바꿔서(컴파일) 넘기는 JIT 타입은 설치는 빠르나 중간 중간 딜레이가 생기는 단점이 있음. 실행하는 시점이 아닌 앱을 다운로드 받아 설치하는 그 시점에 컴파일을 하는 것. 설치 시 미리 기계어로 바꾸기 때문에 설치에 시간이 걸리나 비교적 안정적이라는 장점이 있음. 단, JIT이든 AOT이든 기계어로 직접 하는 것보다는 빠르고 다만 둘이 돌아가는 방식이 다른 것!

#### 자바 바이트코드와 자바 가상 머신

- [O] 자바 바이트코드 실행 환경을 준비할 수 있다. OpenJDK 설치, JAVA_HOME 과 PATH 환경 변수 설정, Sublime 편집기 설치.
- [O] 자바 바이트코드를 이해한다. `https://docs.oracle.com/javase/specs/jvms/se13/jvms13.pdf`
- [o] 바이트코드와 클래스 파일(.class)의 관계를 이해한다. `/HelloWorld.class`, `https://medium.com/@davethomas_9528/writing-hello-world-in-java-byte-code-34f75428e0ad`
>★클래스파일이 바이트코드로 이루어져 있어~
- [o] 클래스 파일과 JVM의 관계를 이해한다. `$ javap HelloWorld.class`, `$ javap -verbose HelloWorld.class`
- [o] JVM을 이용하여 클래스 파일을 실행할 수 있다. $ java HelloWorld

#### 프로그래밍 언어와 컴파일

- [o] 컴파일 방식 프로그래밍이 등장한 이유를 이해한다.
- [o] 프로그래밍 언어와 컴파일, CPU 인스트럭션의 관계를 이해한다.
- [ ] 컴파일러를 이용하여 소스 코드(C 프로그래밍 언어 기준)를 목적 코드(CPU 인스트럭션)로 생성하는 과정을 이해한다. `/module.c`, `/main.c`, `$ gcc -c 소스파일`
- [ ] 링커(C 프로그래밍 언어 기준)를 이용하여 목적 코드가 들어 있는 파일을 하나로 묶어 실행 파일을 만드는 과정을 이해한다. `$ ld -o 실행파일 목적파일 목적파일 … -lSystem -macosx_version_min 10.13`
- [ ] C 프로그래밍 언어 기준, "소스 파일, 목적파일, 실행 파일"과 "컴파일러, 링커"의 관계를 이해한다. 

#### 컴파일러와 인터프리터

- [o] 인터프리트 방식 프로그래밍과 실행 과정을 이해한다.
- [o] Node.js 자바스크립트 인터프리터를 준비할 수 있다. `https://nodejs.org/en/`
- [o] 인터프리터(Node.js 기준)를 사용하여 소스 파일을 직접 실행하는 과정을 이해한다. `/hello.js`, `$ node hello.js` >>> 소스를 바로 실행함. 실행할 때마다 문법 오류 검사 수행 (느리다)
- [o] 컴파일 방식과 인터프리트 방식의 구동 원리를 이해한다.
- [o] 컴파일 방식과 인터프리트 방식의 장단점을 비교할 수 있다.

#### 자바 프로그래밍 절차

- [o] 자바의 프로그래밍 방식과 실행 원리를 이해한다.
- [o] 자바 코드와 바이트코드, 소스 파일과 클래스 파일의 관계를 이해한다. >★소스파일:컴파일 되기 전의 원래 상태 *.java /  클래스파일 : 바이트코드가 들어있는 클래스파일 *.class
- [o]] 자바 컴파일러와 JVM의 역할을 이해한다. >★자바 소스파일을 변환하여 바이트코드 만들고, 바이트코드는 jvm으로 인터프리팅됨.
- [o] CLI 환경에서 컴파일을 수행할 수 있다.  `/Hello.java`, `$ javac Hello.java` >★ Command Line Interface ex)터미널, 파워쉘 >★ javac -d bin/main -encoding utf8 src/main/java/com/ohoracs/basic/ex03/Exam1.java
- [o] CLI 환경에서 자바 클래스 파일을 실행할 수 있다. `/Hello.java`, `$ java Hello` >★ java -cp bin/main com.ohoracs.basic.ex03.Exam1

#### 소스 파일과 컴파일 결과 파일 분리

- [o] Maven 표준 디렉토리 구조를 만들 수 있다. Maven 표준 디렉토리 구조에 맞춰 폴더를 생성한다.
- [o] 각 디렉토리의 용도를 이해한다.
- [o] 프로젝트 디렉토리에서 소스 디렉토리에 있는 자바 소스 파일을 컴파일 할 수 있다. `src/main/java/Hello2.java`, `$ javac src/main/java/Hello2.java`
- [o] 컴파일 할 때 컴파일 결과로 생성된 클래스 파일을 별도 디렉토리에 분리할 수 있다. `src/main/java/Hello2.java`, `$ javac -d bin/main src/main/java/Hello2.java`
- [o] 다른 디렉토리에 있는 클래스 파일을 실행할 수 있다. `src/main/java/Hello2.java`, `$ java -classpath bin/main Hello2`

#### 패키지와 소스 파일

- [o] 패키지의 용도를 이해하고 패키지를 생성할 수 있다. `com.ohoracs.basic`, `src/main/java/com/ohoracs/basic 디렉토리 생성` >★패키지(Package)란 클래스들의 모음이다. 패키지를 통해 편리하게 프로젝트를 관리할 수 있고 내 코드들을 다른 라이브러리로부터, 또 다른 라이브러리들끼리 서로 구분가능하다. 패키지(Package)를 사용하는 가장 큰 이유는 클래스명의 고유성을 보장하기 위해서이다. 만약 다른 두 프로그래머가 서로 다른 목적을 가진 클래스를 생성했는데 이름 같다 가정할 때, 서로 다른 패키지를 사용함으로써 충돌을 피할수 있다. 그리고 패키지 이름의 고유성을 보장하기 위해 최상위 패키지명에 "com.muckycode"와 같은 방식으로 인터넷 도메인 주소를 꺼꾸로 사용하기도 한다. 인터넷 도메인은 이미 고유성을 가지고 있기때문에 다른 충돌을 걱정할 필요가 없기 때문이다.
- [ ] 소스 파일에 작성한 코드가 패키지에 소속되게 할 수 있다. `src/main/java/com/ohoracs/basic/Hello3.java`
- [ ] 패키지에 소속된 소스 파일의 적절한 디렉토리 경로와 왜 그 위치에 놓아야 하는지 이해한다. >>> 유지보수 편하게 하려고
- [ ] 컴파일 한 후 생성된 클래스 파일의 디렉토리 경로와 그 위치에 있어야 하는 이유를 안다. >>> 지정된 일반 폴더 밑에 컴 폴더를 놓고 그 아래 파일을 놓는 게 룰이다. 
- [ ] 패키지에 소속된 클래스 파일을 실행할 수 있다. `src/main/java/com/ohoracs/basic/Hello3.java`, `$ java -cp bin/main com.ohoracs.basic.Hello3` >>> 일반파일까지만 주소를 지정해줘야 한다. 
- [ ] 패키지를 적용하지 않은 채로 그 소스 파일을 그냥 패키지 폴더에 둔다면 컴파일 할 때 어떤 문제가 발생하는지 안다. `src/main/java/com/ohoracs/basic/Hello4.java` >★패키지 선언을 소스파일 안에 해 놔야 한다. 

#### Gradle 빌드 도구

- [ ] Gradle 빌드 도구를 이용하여 작업 폴더를 자바 프로젝트 폴더로 구성할 수 있다. `/프로젝트폴더`, `$ gradle init`
- [ ] Gradle로 생성된 src 디렉토리의 구조를 이해하고 설명할 수 있다. `/src`
- [ ] src 디렉토리 외에 다른 디렉토리나 파일의 용도를 이해한다.

## 자바 기초 문법 - com.ohoracs.basic

#### 클래스 블록과 컴파일, 실행

- [ ] 소스 파일(.java)과 클래스 블록(class 클래스명 {…}), 클래스 파일(.class) 관계를 이해한다. `ex01/Exam11.java`
- [ ] 한 소스 파일에 여러 개의 클래스 블록이 있을 때 컴파일하면 어떻게 되는지 안다. `ex01/Exam12.java` >★각각 클래스파일이 생성된다. 
- [ ] 클래스의 사용 범위(공개/비공개)에 따라 소스 파일과 클래스 블록의 이름이 어떤 관계가 있는지 안다. `ex01/Exam21.java, Exam22.java, Exam23.java` >★공개일 때는 클래스명과 소스파일의 이름이 같아야 한다. 
- [ ] 컴파일 할 때 소스 파일의 인코딩을 지정할 수 있다. `ex01/Exam3.java` >★컴파일러에게 소스파일을 뭘로 지정했는지 알려줄 수 있다. -encoding UTF8
- [ ] JVM이 클래스를 실행하는 과정을 이해하고 설명할 수 있다. >★클래스를 읽고 메인이란 메소드가 있는지 없는지 찾아본다. 
- [ ] main() 메서드의 용도를 알고 있으며 작성할 수 있다. `ex01/Exam4.java` >★메인메소드가 있어야 실행이 된다. 

#### 주석

- [ ] 자바 소스 코드에 주석을 달 수 있다. `ex02/Exam1.java`
- [ ] 주석(`//, /* … */`)의 종류와 작성법을 안다. `ex02/Exam1.java`
- [ ] Javadoc 주석(`/** … */`)의 용도를 이해하고 이 주석을 이용하여 HTML 문서를 생성(`javadoc 사용`)할 수 있다. `ex02/Exam2.java`
- [ ] 애노테이션(`@Override`)의 용도와 문법을 이해한다. `ex02/Exam3.java` >★ vm과 컴파일러에게 지시할 때 사용하는 주석

#### 데이터 종류에 따른 리터럴 표기법

- [ ] `정수, 부동소수점, 논리, 문자, 문자열` 리터럴 문법의 용도를 이해한다. `ex03/Exam1.java`
- [ ] 정수 리터럴을 10진수, 8진수, 2진수, 16진수로 표현할 수 있다. `ex03/Exam21.java`
- [ ] 문자 '_' 를 사용하여 정수 리터럴의 자릿수를 표현할 수 있고, _ 문자의 적절한 위치를 안다. `ex03/Exam22.java`
- [ ] 메모리에 값을 저장하기 위해 데이터를 2진수로 변환해야 하는 이유를 설명할 수 있다.
- [ ] 메모리 크기에 따라 정수를 저장할 수 있는 범위가 다른 이유를 이해한다.
- [ ] 메모리 크기에 따라 정수 리터럴을 4바이트와 8바이트로 구분하여 표현할 수 있다. `ex03/Exam23.java`
- [ ] 정수 리터럴이 메모리 크기를 벗어날 때 어떤 문제가 발생하는지 안다. `ex03/Exam23.java`
- [ ] 정수 리터럴이 메모리에 어떻게 저장되는지 이해한다. `ex03/Exam24.java`
- [ ] 정수를 2진수로 표현하는 다양한 방법을 이해한다. (Sign-magnitude, 1의 보수, 2의 보수, Excess-K 방식)
- [ ] 부동소수점 리터럴을 다양한 방식으로 표기할 수 있다. `ex03/Exam31.java`
- [ ] 메모리 크기에 따라 부동소수점 리터럴을 4바이트와 8바이트로 구분하여 표현할 수 있다.`ex03/Exam32.java
- [ ] 메모리 크기에 따라 부동소수점의 최소/최대 크기를 알아낼 수 있다. `ex03/Exam33.java`
- [ ] 부동소수점이 메모리에 저장되는 원리를 이해한다. (IEEE 754 규칙에 따라 부동소수점이 2진수로 변환되는 것을 이해한다.) `ex03/Exam34.java`
- [ ] 부동소수점이 때론 완전하게 2진수로 변환되지 못하는 이유를 안다.
- [ ] 자바에서 부동소수점을 IEEE 754 규칙에 따라 2진수로 변환된 것을 확인해 볼 수 있다. `ex03/Exam35.java`
- [ ] 문자 리터럴을 다양한 방식으로 표기할 수 있다. `ex03/Exam41.java`
- [ ] 문자 집합(character set), 유니코드, UCS, UTF, UTF-8, UTF-16의 의미를 이해한다. `ex03/Exam42.java`
- [ ] ASCII, ISO-8859-1, EUC-KR, 조합형, MS949, Unicode의 의미를 이해한다.
- [ ] UCS(ISO 10646)를 UTF-8로 바꾸는 규칙을 이해한다.
- [ ] UCS 대신 UTF-8이 사용되는 이유를 안다.
- [ ] 문자를 다룰 때 작은 따옴표('')의 의미를 이해한다. `ex03/Exam43.java`
- [ ] 논리 리터럴을 표현할 수 있다. `ex03/Exam5.java`
- [ ] 문자열 리터럴을 표현할 수 있다. `ex03/Exam6.java`
- [ ] 문자열과 다른 유형의 데이터를 결합할 때 어떤 결과가 발생하는지 안다. `ex03/Exam6.java`
- [ ] 이스케이스 문자의 역할과 사용법을 안다. `ex03/Exam7.java`

#### 변수

- [ ] 변수를 선언할 수 있다. `ex04/Exam11.java`
- [ ] 변수 선언의 의미를 설명할 수 있다. `ex04/Exam11.java`
- [ ] 여러 개의 변수를 한 문장으로 선언할 수 있다. `ex04/Exam111.java`
- [ ] 변수가 가리키는 메모리에 값을 저장할 수 있다. `ex04/Exam12.java`
- [ ] 변수 선언할 때 값을 저장할 수 있다. `ex04/Exam121.java`
- [ ] 한 문장으로 여러 개의 변수를 선언할 때에도 값을 저장할 수 있다. `ex04/Exam122.java`
- [ ] 한 문장으로 여러 개의 변수를 선언할 때 일부 변수만 값을 저장할 수 있다. `ex04/Exam123.java`
- [ ] 변수가 가리키는 메모리의 값을 변경할 수 있다. `ex04/Exam13.java`
- [ ] 블록 안에서 변수를 선언할 수 있는 위치를 안다. `ex04/Exam14.java`
- [ ] 변수를 먼저 사용하고 그 다음에 변수를 선언할 때 발생하는 문제를 안다. `ex04/Exam141.java`
- [ ] 같은 이름의 변수를 중복해서 선언할 때 발생하는 문제를 안다. `ex04/Exam142.java`
- [ ] 변수의 값을 출력할 수 있다. `ex04/Exam15.java`
- [ ] 변수의 값을 다른 변수에 저장할 수 있다. `ex04/Exam151.java`
- [ ] 변수를 초기화시키지 않은 후 사용하면 어떻게 되는지 안다. `ex04/Exam152.java,Exam153.java`
- [ ] 값의 종류에 따라 변수를 선언할 수 있다. `ex04/Exam16.java`
- [ ] primitive data type을 데이터 유형에 따라 크기에 따라 구분할 수 있다. `ex04/Exam16.java`
- [ ] primitive data type 과 referece type을 구분할 수 있다. `ex04/Exam16.java`
- [ ] 정수 데이터 타입(byte, short, int, long)의 각 변수의 메모리 크기와 이 메모리에 저장할 수 있는 최대, 최소 값을 안다. `ex04/Exam21.java`
- [ ] 4바이트와 8바이트 크기의 정수 리터럴을 각 타입의 변수에 저장할 때 규칙을 이해한다. `ex04/Exam22.java`
- [ ] 작은 메모리에 큰 메모리의 값을 넣을 때 어떤 일이 일어나는지 안다. `ex04/Exam23.java`
- [ ] 4바이트 부동소수점 변수에 넣을 수 있는 값의 최대, 최소 크기를 말할 수 있다. `ex04/Exam31.java`
- [ ] 8바이트 부동소수점 변수에 넣을 수 있는 값의 최대, 최소 크기를 말할 수 있다. `ex04/Exam311.java`
- [ ] 단정도, 배정도의 용어를 이해한다. `ex04/Exam311.java`
- [ ] 부동소수점 리터럴의 크기에 따라 적절할 부동소수점 변수를 선언할 수 있다. `ex04/Exam32.java`
- [ ] 잘못된 부동소수점 리터럴을 변수에 저장할 때 어떤 문제가 발생하는지 이해한다. `ex04/Exam321.java`
- [ ] 부동소수점 변수끼리 연산할 때 결과가 부동소수점의 크기를 벗어날 경우 발생되는 문제를 안다. `ex04/Exam322.java`
- [ ] 작은 부동소수점 메모리에 큰 부동소수점 메모리의 값을 넣을 때 발생되는 문제는 안다. `ex04/Exam33.java`
- [ ] UCS-2에 정의된 문자 코드를 저장할 변수를 선언할 수 있다. `ex04/Exam41.java`
- [ ] char 변수에 저장할 수 있는 최대, 최소 값을 말 할 수 있다. `ex04/Exam41.java`
- [ ] char 변수에 문자의 UCS-2 코드 값을 저장하고 출력할 수 있다. `ex04/Exam42.java`
- [ ] char 변수에 저장된 문자 코드를 화면에 출력할 때 문자로 표현하는 과정을 설명할 수 있다. `ex04/Exam42.java`
- [ ] 따옴표를 활용하여 문자의 UCS-2 코드 값을 알아낼 수 있다. `ex04/Exam43.java`
- [ ] 정수를 UCS-2 문자 코드로 인식하게 하여 문자를 출력할 수 있다. `ex04/Exam44.java`