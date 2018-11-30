import java.util.*;
public class test {
	public boolean Palindrome(int [] Array)
	{
	    for(int i=0;i<Array.length/2;i++)
	        {if( Array[i] != Array[Array.length-1-i] ) //added Palindrome Function
	            {return false; } }
	    return true;
	}
	public static boolean Palindrome(String s)
	{
	    for(int i=0;i<s.length()/2;i++)
	        {if( s.charAt(i) != s.charAt(s.length()-1-i) )
	            {return false;} }
	    return true;
	}
	public static void main(String[] args) {
		String shit;
		shit=new Scanner(System.in).nextLine();
	}

}
