package map;

import java.util.Comparator;
import java.util.TreeMap;

class MyClass{
    int data1;
    int data2;

    public MyClass(int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    @Override
    public String toString() {
        return "data1=" + data1 + "을 갖고 있는 클래스";
    }
}

class MyComparableClass implements Comparable<MyComparableClass> {
    int data1;
    int data2;

    public MyComparableClass(int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    @Override
    public int compareTo(MyComparableClass o) {
        if (this.data1<o.data1){
            return -1;
        } else if (this.data1 == o.data1) {
            return 0;
        } else {
            return 1;
        }

    }

    @Override
    public String toString() {
        return "data1=" + data1 + "을 갖고있는 클래스";
    }
}
public class TreeMapMethod_2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        Integer intValue1 = new Integer(20);
        Integer intValue2 = new Integer(10);
        treeMap.put(intValue1, "가나다");
        treeMap.put(intValue2, "나라다");
        System.out.println(treeMap.toString());

        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        String str1 = "가나";
        String str2 = "다라";
        treeMap1.put(str1, 10);
        treeMap1.put(str2, 20);
        System.out.println(treeMap.toString());

        /*TreeMap<MyClass, String> treeMap2 = new TreeMap<>();
        MyClass myClass = new MyClass(2, 5);
        MyClass myClass1 = new MyClass(3, 3);
        treeMap2.put(myClass, "가나다");
        treeMap2.put(myClass1, "나라다");
        System.out.println(treeMap2.toString());
        */

        TreeMap<MyComparableClass, String> treeMap3 = new TreeMap<>();
        MyComparableClass myComparableClass = new MyComparableClass(2, 5);
        MyComparableClass myComparableClass1 = new MyComparableClass(3, 3);
        treeMap3.put(myComparableClass, "가나다");
        treeMap3.put(myComparableClass1, "나라다");
        System.out.println(treeMap3);

        TreeMap<MyClass, String> treeMap4 = new TreeMap<>(new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                if(o1.data1<o2.data1){
                    return -1;
                } else if (o1.data1 == o2.data1) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        MyClass myClass1 = new MyClass(2, 5);
        MyClass myClass2 = new MyClass(3, 3);
        treeMap4.put(myClass1, "가나다");
        treeMap4.put(myClass2, "나라다");
        System.out.println(treeMap4);
    }
}
