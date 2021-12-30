package list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateListObject
{
    public static void main(String[] args) {
        List<Integer> aList1 = new ArrayList<>();
        List<Integer> aList2 = new ArrayList<>(30);
        List<Integer> aList3 = new ArrayList<>();
        List<Integer> aList4 = new ArrayList<>(30);
        List<Integer> aList5 = new ArrayList<>();
//      List<Integer> aList6 = new ArrayList<>(30);

        List<Integer> aList7 = Arrays.asList(1,2,3,4);
        List<String> aList8 = Arrays.asList("안녕","방가");
        aList7.set(1,7);
        aList8.set(0,"감사");
//      aList7.add(5)
//      aList8.remove(0);
        System.out.println(aList7);
        System.out.println(aList8);
    }
}
