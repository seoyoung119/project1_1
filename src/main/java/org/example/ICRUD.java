package org.example;

public interface ICRUD {
    public Object add(); //추가 -> 추가된 객체를 return하기 위해서 object 타입
    public int update(Object obj); //수정 -> 어떤 데이터(object)를 수정해야할지 파라미터로 전해줌
    public int delete(Object obj); // 삭제
    public void selectOne(int id); // 데이터 한 개 조회 -> 해당하는 아이디에 대하여
}
