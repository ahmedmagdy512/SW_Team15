import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
	static ArrayList<Integer>arr;
	public static void main(String []args)
	{
		int x=FindSmallestPrime();
		if(x==-1)
		{
			System.out.println("No prime numbers found");
		}
		else
		{
			System.out.println(x);
		}
	}
	
	static void Get_arr()
	{
		arr=new ArrayList<Integer>();
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
	static boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 
       
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
       
        return true; 
    } 
	static int FindSmallestPrime()
	{
		Get_arr();
		Collections.sort(arr);
		for(int i=0; i<arr.size();i++)
		{
			int x=arr.get(i);
			if(isPrime(x))
				return x;
		}
		return -1;
	}
}
