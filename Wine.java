import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Wine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] what = line.split(" ");
        int require = Integer.parseInt(what[1]);
        int result = 0;
        String line2 = scan.nextLine();
        String[] wtf = line2.split(" ");
        int[] hey = new int[wtf.length];
        for (int i = 0; i < wtf.length; i++) {
            hey[i] = Integer.parseInt(wtf[i]);
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int k: hey) {
            al.add(k);
        }
        int qualityNow = 0;
        while (qualityNow < require) {
            Collections.sort(al);
            qualityNow = al.get(0) + 2* (al.get(1));
            al.remove(al.get(0));
            al.remove(al.get(1));
            al.add(qualityNow);
            result++;
        }
        System.out.println(result);


    }
}
