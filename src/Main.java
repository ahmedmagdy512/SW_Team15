import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int answer;
        ArrayList<Integer> a, acopy;
        boolean in = true;

        while(in) {
            //Getting User Choice.
            System.out.println(
                    "1 - Find smallest prime\n" +
                            "2 - Reverse Array\n" +
                            "3 - Get the maximum 3 numbers\n" +
                            "4 - Most repeated value\n" +
                            "5 - Count primes\n" +
                            "6 - Get Average\n" +
                            "7 - Sort\n" +
                            "8 - Check palindrome\n" +
                            "9 - Get median\n" +
                            "10 - Check Sorted\n" +
                            "11 - Return only primes\n" +
                            "12 - Zero if less than zero\n" +
                            "13 - Find Largest Prime\n" +
                            "14 - Shuffle\n" +
                            "15 - Shift Array\n" +
                            "16 - Distnict Array\n" +
                            "17 - Get the minimum 3 numbers\n" +
                            "18 - All\n" +
                            "19 - Exit"
            );

            System.out.print("Please Enter The Number of Operation to start: ");
            try {
                answer = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Please Enter a Number.");
                continue;
            }

            //Getting User Input
            try {
                a = new ArrayList<>();
                System.out.print("Please Enter The Array Length: ");
                int n = sc.nextInt();

                for (int i = 0; i < n; ++i) {
                    int x = sc.nextInt();
                    a.add(x);
                }
            } catch (Exception e) {
                System.out.println("Please Enter Numbers Only.");
                continue;
            }

            //Calling The Functions
            switch (answer) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    max3(a);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    getaverage(a);
                    break;
                case 7:
                    Sort(a);
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    for (int i : onlyPrimes(a)) {
                        System.out.print(i + ", ");
                    }
                    System.out.println();
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    System.out.println("3 - the maximum 3 numbers:");
                    acopy = new ArrayList<>(a);
                    max3(acopy);
                    System.out.println("/***************************************************************************/");
                    System.out.print("6 - ");
                    getaverage(a);
                    System.out.println("/***************************************************************************/");
            }
        }
    }

    public static void shift(ArrayList <Character> arr) {
        char a1;
        char [] tat=new char[arr.size()] ;

        for(int i=0,j=arr.size()-1;j>0;j--)
        {
            a1=arr.get(i);

            tat[arr.size()-1]=a1;
            tat[j-1]=arr.get(j);

            tat[arr.size()-1]=a1;


        }
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(tat[i]);
        }
    }

    public static void max3(ArrayList<Integer> a){
        Collections.sort(a); // sorted in ascending order
        Collections.reverse(a); // now is sorted in descending order
        System.out.println("First Maximum Number : " + a.get(0));
        System.out.println("Second Maximum Number : " + a.get(1));
        System.out.println("Third Maximum Number : " + a.get(2));
    }

    public static ArrayList<Integer> zeroIfLessThanZero(ArrayList<Integer> a){
        for(int x=0; x<a.size(); x++) {
            if(a.get(x) < 0) {
                a.set(x, 0);
            }
        }
        return a;
    }

    public static int mostRepeatedValue(ArrayList<Integer> arr) {
        int menual = 0;
        int counter = 0;
        int tmpCount = 0;

        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            counter = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (temp == arr.get(j)) {
                    counter++;
                }
            }
            if (counter > tmpCount) {
                menual = temp;
                tmpCount = counter;
            }
        }

        return menual;
    }

    public static void getaverage(ArrayList<Integer> a){
        double average=0;
        for(int i=0;i<a.size();i++){
            average+=a.get(i);
        }
        average=average/a.size();
        System.out.println("the average of the array is:"+ average);
    }

    public static void findMedian(ArrayList<Integer> a)
    {
        System.out.println("to get median of elements ");

        Collections.sort(a);
        double median;
        int x = a.size() / 2;
        if (a.size() % 2 == 0) {
            median = ((double) a.get(x) + (double) a.get(x - 1)) / 2;
            System.out.println("the median is " + median);
        } else {
            median = (double) a.get(x);
            System.out.println("the median is " + median);
        }
    }

    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        if(n==2) return true;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static int FindSmallestPrime(ArrayList<Integer>arr)
    {
        Collections.sort(arr);
        for(int i=0; i<arr.size();i++)
        {
            int x=arr.get(i);
            if(isPrime(x))
                return x;
        }
        return -1;
    }

    private static void Sort(ArrayList<Integer> arr)
    {
        int n = arr.size();
        for (int i = 0 ; i < n-1 ; i++)
            for (int j = 0 ; j < n-i-1 ; j++)
                if (arr.get(j) > arr.get(j+1))
                {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
    }

    private static ArrayList<Integer> onlyPrimes(ArrayList<Integer> arr){
        boolean prime;
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i : arr) {
            prime = true;
            for (int j = 2; j <= i / 2; j++) {
                if(i % j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                primes.add(i);
            }
        }
        return primes;
    }
}
