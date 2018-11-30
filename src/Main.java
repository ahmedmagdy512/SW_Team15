import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void Sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0 ; i < n-1 ; i++) 
            for (int j = 0 ; j < n-i-1 ; j++) 
                if (arr[j] > arr[j+1]) 
                {  
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n; ++i){
            int x = sc.nextInt();
            a.add(x);
        }
        



    }
    public static void shift(ArrayList <Character> arr)
	   {
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
}
