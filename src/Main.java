import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
	
	public static void Get_arr(ArrayList<Integer>arr)
	{
		int sz;
		System.out.print("Enter the size of the array : ");
		Scanner sc=new Scanner(System.in);
		sz=sc.nextInt();
		System.out.print("Enter the array : ");
		for(int i=0;i<sz;i++)
		{
			int x;
			x=sc.nextInt();
			arr.add(x);
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

	public static int FindSmallestPrime()
	{
		ArrayList<Integer>arr=new ArrayList<Integer>();
		Get_arr(arr);
		Collections.sort(arr);
		for(int i=0; i<arr.size();i++)
		{
			int x=arr.get(i);
			if(isPrime(x))
				return x;
		}
		return -1;
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
