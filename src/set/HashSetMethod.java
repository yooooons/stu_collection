package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class HashSetMethod {

    public static void main(String[] args) {


        Set<String> hSet = new HashSet<>();

        hSet.add("가");
        hSet.add("나");
        hSet.add("가");
        System.out.println(hSet.toString());

        Set<String> hSet2 = new HashSet<>();
        hSet2.add("나");
        hSet2.add("다");
        hSet2.addAll(hSet);
        System.out.println(hSet2.toString());

        hSet2.remove("나");
        System.out.println(hSet2.toString());

        hSet2.clear();
        System.out.println(hSet2.toString());

        System.out.println(hSet2.isEmpty());

        Set<String> hSet3 =new HashSet<>();
        hSet3.add("가");
        hSet3.add("나");
        hSet3.add("다");
        System.out.println(hSet.contains("나"));
        System.out.println("라");

        System.out.println(hSet3.size());

        Iterator<String> iterator = hSet3.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Object[] objArray =hSet3.toArray();
        System.out.println(Arrays.toString(objArray));

        String[] strArray1 =hSet3.toArray(new String[0]);
        System.out.println(Arrays.toString(strArray1));

        String[] strArray2 = hSet3.toArray(new String[5]);
        System.out.println(Arrays.toString(strArray2));




    }
}
