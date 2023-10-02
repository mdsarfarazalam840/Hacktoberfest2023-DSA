import java.util.*;
import java.lang.*;
import java.io.*;

class MyCode
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int b = sc.nextInt();
		    int n = (b/2) -1;
		    System.out.println((n * (n +1)/2));
		}
	}
}
