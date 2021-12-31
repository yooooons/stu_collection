package vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod {
    public static void main(String[] args) {
//        vector는 arraylist와 사용법은 같으나 차이점은 vector는 동기화를 지원해준다.
        List<Integer> aList1 =new Vector<>();

        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        System.out.println(aList1.toString());

        aList1.add(1,6);
        System.out.println(aList1.toString());

        List<Integer> aList2=new Vector<>();
        aList2.add(1);
        aList2.add(2);
        aList2.addAll(aList1);
        System.out.println(aList2);

        List<Integer> aList3=new Vector<>();
        aList3.add(1);
        aList3.add(2);
        aList3.addAll(1,aList3);
        System.out.println(aList3);
        aList3.set(1,5);
        aList3.set(3,6);
//        aList3.set(4,8);
        System.out.println(aList3);

        aList3.remove(1);
        System.out.println(aList3);
        aList3.remove(new Integer(2));
        System.out.println(aList3);

        aList3.clear();
        System.out.println(aList3);

        System.out.println(aList3.isEmpty());
        System.out.println(aList3.size());
        aList3.add(1);
        aList3.add(2);
        aList3.add(3);
        System.out.println(aList3);
        System.out.println(aList3.size());

        System.out.println("0번째:"+aList3.get(0));
        System.out.println("1번째:"+aList3.get(1));
        System.out.println("2번째:"+aList3.get(2));

        for (int i = 0; i < aList3.size(); i++) {
            System.out.println(i+"번째:"+aList3.get(i));
        }

        Object[] objects = aList3.toArray();
        System.out.println(Arrays.toString(objects));

        Integer[] integer1 = aList3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integer1));

        Integer[] integer2=aList3.toArray(new Integer[5]);
        System.out.println(Arrays.toString(integer2));
        int[] a = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(a));
    }
}
