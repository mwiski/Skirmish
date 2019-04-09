package pl.mwiski.skirmishes;

import java.util.*;
import java.lang.*;
import java.io.*;

class SkirmishApplication {

    public List<Integer> init() {
        List<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(0);
        ints.add(2);
        ints.add(3);
        ints.add(5);
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
        ints.add(6);
        ints.add(4);
        ints.add(6);
        ints.add(5);

        return ints;
    }
}

public class SkirmishOne {

    private static List<Integer> removeDuplicates(List<Integer> ints) {
        ints = new ArrayList<>(new LinkedHashSet<>(ints));

        return ints;
    }

    public static void main (String[]args){

    SkirmishApplication application = new SkirmishApplication();

    System.out.println(removeDuplicates(application.init()));
    }
}
