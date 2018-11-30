import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = sc.nextInt();

        for(int i = 0 ; i < n; ++i){
            int x = sc.nextInt();
            a.add(x);
        }

        findMedian();
    }

    public static void max3(ArrayList<Integer> a){
        Collections.sort(a); // sorted in ascending order
        Collections.reverse(a); // now is sorted in descending order
        System.out.println("First Maximum Number : " + a.get(0));
        System.out.println("Second Maximum Number : " + a.get(1));
        System.out.println("Third Maximum Number : " + a.get(2));
    }
     public static void findMedian()
    {
        int numArray[] = { 1, 3, 4, 2, 7, 5, 8, 6 };

        Arrays.sort(numArray);
        double median;
        if (numArray.length % 2 == 0) {
            median = ((double) numArray[numArray.length / 2] + (double) numArray[numArray.length / 2 - 1]) / 2;
            System.out.println("the median is "+median);
        }
        else {
            median = (double) numArray[numArray.length / 2];
            System.out.println("the median is "+median);
        }




    }
}
