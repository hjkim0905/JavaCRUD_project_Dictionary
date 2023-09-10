package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//ICRUD interface의 구현체
//WordCRUD class
//각각의 함수가 어떤 것을 구현 할지 코딩함
public class WordCRUD implements ICRUD {
ArrayList<Word> list;
Scanner s;
final String fname = "Dictionary.txt";
WordCRUD(Scanner s){
    list = new ArrayList<>();
    this.s = s;
}
    @Override
    public Object add() {
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();
        System.out.print("뜻 입력 : ");
        String meaning = s.nextLine();
        return new Word(0, level, word, meaning);   //id가 없기 때문에 0
    }

    public void addItem(){
    Word one=(Word)add();
    list.add(one);
    System.out.println("새 단어가 단어장에 추가되었습니다.");
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }

    public void listAll() {
        System.out.println("---------------------------");
        for(int i = 0; i < list.size(); i++){
            System.out.print((i+1) + "");    //printline하면 줄바꿈이 생기기 때문에 옆으로 프린트하기 위하여 프린트 함수 사용
            System.out.println(list.get(i).toString());
        }
        System.out.println("---------------------------");
    }
    public ArrayList<Integer> listAll(String keyword) {
        ArrayList<Integer> idList = new ArrayList<>();
        int j = 0;
        System.out.println("---------------------------");
        for(int i = 0; i < list.size(); i++){
            String word = list.get(i).getWord();
            if(!word.contains(keyword)) continue;   //키워드를 가지고 있지 않는다면 continue를 사용하여 밑 구문 건너뛰기
            System.out.print((j+1) + "");    //printline하면 줄바꿈이 생기기 때문에 옆으로 프린트하기 위하여 프린트 함수 사용
            System.out.println(list.get(i).toString());
            idList.add(i);
            j++;
        }
        System.out.println("---------------------------");
        return idList;
    }

    public void updateItem() {
        System.out.print("=> 수정할 단어 검색 :");
        String keyword = s.next();   //공백을 허용하지 않기 위해 next()사용
        ArrayList<Integer> idList = this.listAll(keyword);
        System.out.print ("=> 수정할 번호 선택 :");
        int id = s.nextInt();
        s.nextLine();     //id뒤에있는 엔터를 없애기 위해
        System.out.print("=> 뜻 입력 : ");
        String meaning = s.nextLine(); //공백도 포함하여 입력받기
        Word word = list.get(idList.get(id-1));
        word.setMeaning(meaning);
        System.out.println("단어가 수정되었습니다.");

    }

    public void deleteItem() {
        System.out.print("=> 삭제할 단어 검색 : ");
        String keyword = s.next();   //공백을 허용하지 않기 위해 next()사용
        ArrayList<Integer> idList = this.listAll(keyword);
        System.out.print ("=> 삭제할 번호 선택 : ");
        int id = s.nextInt();
        s.nextLine();     //id뒤에있는 엔터를 없애기 위해
        System.out.print("=> 정말로 삭제하실래요? (Y/n) : ");
        String ans = s.nextLine(); //공백도 포함하여 입력받기
        if(ans.equalsIgnoreCase("y")){
            list.remove((int)idList.get(id - 1));     //remove 매서드는 정수로 몇번째 인덱스를 삭제할건지 나타낸다,따라서 정수형으로 바꾸어 줘야 한다.
            System.out.println("단어가 삭제되었습니다.");
        }
        else{
            System.out.println("취소되었습니다.");
        }
    }
    public void loadFile() {     //이 함수는 dictionary.txt파일을 열고 데이터를 한줄씩 읽어서 워드객체로 만들어서 리스트에 추가
        try {
            BufferedReader br = new BufferedReader(new FileReader(fname));
            String line; //(한 줄씩 읽기 위한 변수 선언)
            int count = 0;
            while(true) {
                line = br.readLine();
                if (line == null) break;
                String data[] = line.split("\\|"); //버티컬바는 백슬래쉬 두개를 넣어서 문자로 인식하게 해야함
                int level = Integer.parseInt(data[0]);
                String word = data[1];
                String meaning = data[2];
                list.add(new Word(0, level, word, meaning));
                count++;
            }
            br.close();
            System.out.println("==> " + count + "개 로딩 완료!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveFile() {                    //파일저장 메서드
        try {
            PrintWriter pr = new PrintWriter(new FileWriter("savedFile.txt")); //fname에 덮어씌우면 기존 데이터가 손상이감 따라서 임시 파일로
            for(Word one : list){
                pr.write(one.toFileString() + "\n");
            }
            pr.close();
            System.out.println("==> 데이터 저장 완료 !!!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void listAll(int level){     //목록 출력 메서드

        ArrayList<Integer> idList = new ArrayList<>();
        int j = 0;
        System.out.println("---------------------------");
        for(int i = 0; i < list.size(); i++){
            int ilevel = list.get(i).getLevel();
            if(ilevel != level) continue;
            System.out.print((j+1) + "");    //printline하면 줄바꿈이 생기기 때문에 옆으로 프린트하기 위하여 프린트 함수 사용
            System.out.println(list.get(i).toString());
            idList.add(i);
            j++;
        }
        System.out.println("---------------------------");
    }
    public void searchLevel() {
        System.out.print("=> 원하는 레벨 선택 (1:초급, 2:중급, 3:고급): ");
        int level = s.nextInt();
        listAll(level);
    }
    public void searchWord(){
        System.out.print("=> 원하는 단어는? ");
        String keyword = s.next();
        listAll(keyword);
    }
    public void quit(){              //프로그램 종료시 나오는 출력문
        System.out.println("프로그램을 종료합니다. 다음에 다시 만나요! :)");
    }
}
