package SortedMapp;

import java.util.SortedMap;
import java.util.TreeMap;

public class sortedmap1 {

    public static void main(String[] args) {
        SortedMap<Integer, Character> s = new TreeMap<Integer, Character>();
        s.put(105, 'E');
        s.put(102, 'B');
        s.put(107, 'G');
        s.put(101, 'A');
        s.put(106, 'F');
        s.put(104, 'D');
        s.put(103, 'C');

        System.out.println(s.firstKey());
        System.out.println(s.lastKey());
        System.out.println(s.headMap(104));
        System.out.println(s.tailMap(105));
        System.out.println(s.subMap (102, 106));
    }

}
