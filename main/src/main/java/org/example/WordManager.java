package org.example;

import java.util.Scanner;

//WordManager Class
//WordCRUD를 구현하는 전체적인 관리 역할
public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;

    public int selectMenu() {
        System.out.print("""
                *** 영단어 마스터 ***
                1. 모든 단어 보기
                2. 수준별 단어 보기
                3. 단어 검색
                4. 단어 추가
                5. 단어 수정
                6. 단어 삭제
                7. 파일 저장
                0. 나가기
                *************************
                => 원하는 메뉴는?\t""");  //물음표와 메뉴 입력값을 떨어뜨려 보기 좋게 하기 위해서 공백 삽입
        return s.nextInt();
    }

    WordManager() {
        wordCRUD = new WordCRUD(s);
    }
    public void start() {
        wordCRUD.loadFile();
        while (true) {
            int menu = selectMenu();
            if (menu == 0) {
                wordCRUD.quit();
                break;
            }
            if (menu == 4) {
                wordCRUD.addItem(); //wordCRUD 클래스에 있는 addWord()함수
            }
            if (menu == 1) {
                // list
                wordCRUD.listAll();
            }
            if (menu == 2) {
                wordCRUD.searchLevel();
            }
            if (menu == 3) {
                wordCRUD.searchWord();
            }
            if (menu == 5) {        //update
                wordCRUD.updateItem();
            }
            if (menu == 6) {        //delete
                wordCRUD.deleteItem();
            }
            if (menu == 7) {        //save file
                wordCRUD.saveFile();
            }
        }
    }
}