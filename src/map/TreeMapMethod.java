package map;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for (int i = 20; i > 0; i-=2) {
            treeMap.put(i, i + "번째 데이터");
        }
        System.out.println(treeMap.toString());

        System.out.println(treeMap.firstKey());

        System.out.println(treeMap.firstEntry());

        System.out.println(treeMap.lastKey());

        System.out.println(treeMap.lastEntry());

        System.out.println(treeMap.lowerKey(11));
        System.out.println(treeMap.lowerEntry(10));

        System.out.println(treeMap.higherKey(11));
        System.out.println(treeMap.higherEntry(10));

        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap.toString());

        System.out.println(treeMap.pollLastEntry());
        System.out.println(treeMap.toString());

        SortedMap<Integer, String> sortedMap = treeMap.headMap(8);
        System.out.println(sortedMap.toString());
        NavigableMap<Integer, String> navigableMap = treeMap.headMap(8, true);
        System.out.println(navigableMap);

        sortedMap = treeMap.tailMap(14);
        System.out.println(sortedMap.toString());
        navigableMap = treeMap.tailMap(14, false);
        System.out.println(navigableMap);

        sortedMap = treeMap.subMap(6, 10);
        System.out.println(sortedMap);
        navigableMap = treeMap.subMap(6, false, 10, true);
        System.out.println(navigableMap);

        NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();
        System.out.println(navigableSet);
        System.out.println(navigableSet.descendingSet());

        navigableMap = treeMap.descendingMap();
        System.out.println(navigableMap);
        System.out.println(navigableMap.descendingMap());


    }
}
