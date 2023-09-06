package org.example;
//Word class
public class Word {
    private int id;
    private int level;
    private String word;
    private String meaning;
    Word(){} //디폴트 생성자 생성
    Word(int id, int level, String word, String meaning){
        this.id=id;
        this.level=level;
        this.word=word;
        this.meaning=meaning;
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
    public String toString() {
        String slevel = "";   //숫자로 되어있기 때문
        for(int i = 0 ; i < level ; i++) {
            slevel += "*";
        }
        String str = String.format("%-3s" , slevel)    //레벨을 최대 3칸 및 왼쪽 정렬(마이너스 붙임)
                + String.format("%15s",word) + " " + meaning;   //단어를 최대 15칸 및 오른쪽 정렬(플러스 붙임)
        return str;
    }
    public String toFileString() {
        return this.level + "|" + this.word + "|" + this.meaning;
    }
}
