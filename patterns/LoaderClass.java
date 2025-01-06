package patterns;


import java.io.*;
import java.util.Arrays;
import java.util.List;

public class LoaderClass {



    private static void flatMapConcept(){


        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(1,22,31);
        List<Integer> l3 = Arrays.asList(12,25,3);

        List<List<Integer>> mergeList = Arrays.asList(l1,l2,l3) ;

        mergeList.stream().flatMap(val -> val.stream()).distinct().forEach(val -> System.out.println(val));

    }
    public static void main(String[] args) {
        flatMapConcept();
    }
}
