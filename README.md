# Java CRUD를 이용하여 단어장 만들기
### 1. Project Description
------------
> 이 프로젝트는 CRUD(create, read, update, delete) 기능뿐만 아니라 여러가지 기능들을 구현해 총 9가지의 기능을 가진 단어장을 만들어 낸다.
> 이 프로젝트를 통해 영단어, 단어의 수준 (level), 단어의 id (번호), 단어의 뜻을 포함한 txt파일을 불러올 수 있으며 기능들을 사용하여 파일을 수정하여 다른 txt파일로 저장할 수 있다.

### 2. Project Information
------------
이 프로젝트는 IntelliJ IDEA 2023.2.1 (Ultimate Edition) 버전을 사용하여 만들어졌으며 JDK의 버전은 17.0.8이다.

**실행 파일 이름**: Main.java

### 3. Function Description
------------
단어장은 파일 읽기, 모든 단어 보기, 수준별 단어 보기, 단어 검색, 단어 추가, 단어 수정, 단어 삭제, 파일 저장, 그리고 나가기 순으로 **총 9가지의 기능**을 가지고 있다.

모든 단어 보기부터 1번 파일 저장까지 7번으로 정의되어 있으며 나가기 기능은 0번이다.

원하는 메뉴를 번호에 맞게 입력하면 메뉴에 표시된 기능이 실행된다.

* 단어 추가 및 목록 보기, 나가기

<p align="center"><img width="200" alt="단어추가,목록,나가기_1" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/1c7894e1-24a0-4c61-ae24-996a2f746a0a">
<img width="200" alt="단어추가,목록,나가기_2" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/6c27baf6-f6ac-41b3-8d0b-43f651770acc">
<img width="200" alt="단어추가,목록,나가기_3" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/6a7577cd-f2a3-4ad9-9ff2-f6087c86e7c3"></p>

    위 사진에서와 같이 단어 추가의 기능을 가지고 있는 4번을 입력하면 숫자로 표현된 난이도(1부터 3까지 쉬운것부터 어려운 순서)와 추가할 새 영단어를 입력한다.
    (이 때 주의 사항은 난이도를 입력 후 “스페이스”바를 눌러 한 칸 건너뛰고 영단어를 입력해야한다.)
    그 후에는 뜻을 입력 하여 새 단어를 성공적으로 추가한다.

    단어가 성공적으로 추가 되었는지 확인하려면 단어의 목록을 확인하면 된다.
    단어 목록을 볼 수 있는 기능을 가지고 있는 1번을 입력하게 되면 지금까지 추가된 모든 영단어들이 난이도와 뜻과 함께 등록한 순서대로 표시된다.
    등록한 순서는 맨 앞에 제일 처음 등록한 1부터 숫자로 표현되어 있고 그 뒤엔 차례대로 왼쪽정렬된 난이도, 오른쪽 정렬된 영단어, 그리고 단어의 뜻이 표시되어 단어 목록이 출력된다.
    (이 때 주의 사항은 영단어가 포함되어 있는 txt파일을 불러오게 된다면 txt파일 내부에 있는 단어들이 먼저 출력되고 프로그램에서 따로 추가한 단어들은 그 뒤에 하나씩 추가되게 된다.)

    프로그램의 사용을 완료하고 프로그램을 종료하여 나가고 싶다면 나가기 기능을 가지고 있는 0번을 입력하면 위 사진과 같이 프로그램을 종료한다는 문구와 함께 프로그램이 종료하게 된다.

* 단어 목록을 포함한 파일 읽기

<p align="center"><img width="500" alt="읽어질 단어 목록을 포함한 txt 파일" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/d4a3864e-1446-4734-b557-40d0a90767fb">
<img width="300" alt="파일읽기" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/58864dda-d34b-4229-b8cf-1d413009e51b"></p>

    위 사진에서와 같이 단어 목록을 포함하며 dictionary란 이름을 가진 txt파일을 열고 데이터를 한 줄씩 읽어서 워드 객체로 만든 후에 단어 목록에 추가되게 된다.
    이로서 컴파일할 때 dictionary.txt 파일에 있는 단어의 갯수에 맞춰 단어 몇 개가 로딩 완료되었다고 표시된다.

* 수준별 단어 보기 및 단어 검색하기

<p align="center"><img width="331" alt="수준별 단어 보기" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/9523669e-11de-4f1b-8fa0-c7a7e5fe4691">
<img width="250" alt="단어 검색" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/8a1ef701-d9b6-4662-aa1e-1df6c7c71c09"></p>

    위 사진에서와 같이 수준별 단어 보기의 기능을 가지고 있는 2번을 입력하게 되면 1(초급), 2(중급), 그리고 3(고급) 중에 원하는 레벨을 숫자로 입력하게 된다.
    입력 후에는 레벨에 맞는 단어의 목록이 나타난다.

    위 사진에서와 같이 단어 검색의 기능을 가지고 있는 3번을 입력하게 되면 단어를 검색하게 된다.
    이 때 단어나 단어가 가지고 있는 부분적인 철자들을 입력하게 되면 그 철자들을 포함한 단어들의 목록이 나타난다.

* 단어 수정하기

<p align="center"><img width="240" alt="단어수정_1" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/04ac0071-42f7-4e83-b718-30f40319835f">
<img width="200" alt="단어수정_2" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/3ff9ecbc-f53f-45c2-8a1e-67bf159187c6">
<img width="220" alt="단어수정_3" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/5e080bdc-d146-4d6b-93c2-d493720c02db"></p>

    위 사진에서와 같이 단어 수정의 기능을 가지고 있는 5번을 입력하게 되면 수정할 단어를 검색하게 된다.
    이 때 수정하고 싶은 단어나 단어가 가지고 있는 부분적인 철자들을 입력하게 되면 그 철자들을 포함한 단어들의 목록이 나타난다.
    그 후에 수정할 단어가 가지고 있는 숫자를 입력하고 뜻을 입력하면 마지막 사진에서와 같이 수정한 단어의 뜻이 수정되어 출력된다.

* 단어 삭제 및 파일 저장하기

<p align="center"><img width="200" alt="단어삭제,파일저장_1" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/adc86900-a87e-4d8d-bacb-76697b7d80c2">
<img width="200" alt="단어삭제,파일저장_2" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/df16a13c-ef9f-40cf-bf9b-143ca1c4aa41">
<img width="200" alt="단어삭제,파일저장_3" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/ffbd18f8-83b2-4b7c-8cfb-b12a8e2b8910">
<img width="200" alt="단어삭제,파일저장_4" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/f123d587-705b-4bf7-9791-ebb2e32256d1"></p>
<p align="center"><img width="500" alt="저장된 txt 파일 내용" src="https://github.com/hjkim0905/JavaCRUD_project_Dictionary/assets/143365392/90074f56-a21e-4d58-9b70-5a93f07f75cd"></p>

    위 사진에서와 같이 단어 삭제의 기능을 가지고 있는 6번을 입력하게 되면 삭제할 단어를 검색하게 된다.
    이 때 삭제하고 싶은 단어나 단어가 가지고 있는 부분적인 철자들을 입력하게 되면 그 철자들을 포함한 단어들의 목록이 나타난다.
    그 후에 삭제할 단어가 가지고 있는 숫자를 입력하고 삭제할 것이냐는 물음에 'n'을 입력하게 되면 삭제가 취소되고 'Y'나 'y'를 입력하게 되면 단어가 삭제됬다는 문구와 함께 성공적으로 삭제된다.

    위 사진에서와 같이 파일 저장의 기능을 가지고 있는 7번을 입력하게 되면 데이터 저장이 완료됬다는 문구와 함께 성공적으로 단어의 목록이 savedFile란 이름을 가진 txt파일에 저장이 된다.
    저장된 txt파일은 main 폴더에 저장이 되어진다.

