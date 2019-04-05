package pl.mwiski.skirmishes;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SkirmishOne {

    private static List<Integer> removeDuplicates(List<Integer> ints) {

        Set<Integer> set = new HashSet<>();
        set.addAll(ints);
        ints.clear();
        ints.addAll(set);
        return ints;
    }

    private static List<Integer> init() {
        List<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(0);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(0);
        ints.add(1);
        ints.add(3);
        ints.add(4);
        ints.add(3);
        ints.add(2);
        ints.add(1);
        ints.add(0);
        ints.add(2);
        ints.add(5);
        ints.add(5);

        return ints;
    }

    public static void main (String[]args){

        System.out.println(removeDuplicates(init()));
    }

}
