package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        //        사양테스트



//
        List<Integer> aList =new ArrayList<>();
        List<Integer> linkedList =new LinkedList<>();
        long startTime =0,endTime =0;
//
        startTime=System.nanoTime();
        //현재시간 x 시간 측정 모듈에 사용
        for (int i = 0; i < 100000; i++) {
            aList.add(0,i);
        }
        endTime=System.nanoTime();
        System.out.println("ArrayList 데이터 추가 시간="+(endTime-startTime)+"ns");

//
        startTime=System.nanoTime();
        //현재시간 x
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0,i);
        }
        endTime=System.nanoTime();
        System.out.println("LinkedList 데이터 추가 시간="+(endTime-startTime)+"ns");

//
        startTime=System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            aList.get(i);
        }
        endTime=System.nanoTime();
        System.out.println("ArrayList 데이터 검색 시간="+(endTime-startTime)+"ns");

//
        startTime=System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        endTime=System.nanoTime();
        System.out.println("LinkedList 데이터 검색 시간="+(endTime-startTime)+"ns");
//
        startTime=System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            aList.remove(0);
        }
        endTime=System.nanoTime();
        System.out.println("ArrayList 데이터 제거 시간="+(endTime-startTime)+"ns");
//
        startTime=System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(0);
        }
        endTime=System.nanoTime();
        System.out.println("LinkedList 데이터 제거 시간="+(endTime-startTime)+"ns");
    }
}
