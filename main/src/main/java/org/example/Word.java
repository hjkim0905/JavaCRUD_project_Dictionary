package org.example;
//Word class
public class Word {
    private int id;
    private int level;
    private String word;
    private String meaning;
    Word(){} //디폴트 생성자 생성
    Word(int id, int level, String word, String meaning){
        this.id=id;                 //id
        this.level=level;           //단어수준
        this.word=word;             //영단어
        this.meaning=meaning;       //뜻
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {                         //단어의 레벨을 string형태로 바꾼 후에 출력될 목록의 형태 정의
        String slevel = "";   //숫자로 되어있기 때문
        for(int i = 0 ; i < level ; i++) {
            slevel += "*";
        }
        String str = String.format("%-3s" , slevel)    //레벨을 최대 3칸 및 왼쪽 정렬(마이너스 붙임)
                + String.format("%15s",word) + " " + meaning;   //단어를 최대 15칸 및 오른쪽 정렬(플러스 붙임)
        return str;
    }
    public String toFileString() {
        return this.level + "|" + this.word + "|" + this.meaning;        //파일을 저장할 때 사용되는 메서드
    }
}
