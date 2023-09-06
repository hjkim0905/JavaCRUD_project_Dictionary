package org.example;
//CRUD interface(첫 ppt 에서 JAVA CRUD 단계 참조
public interface ICRUD {
    public Object add(); //데이터 추가
    public int update(Object obj); //데이터 수정
    public int delete(Object obj); //데이터 삭제
    public void selectOne(int id); //데이터 한개를 조회
}
