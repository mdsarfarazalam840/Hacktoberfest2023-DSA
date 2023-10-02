

import java.util.*;
import java.lang.*;
import java.io.*;

import java.math.BigInteger;


class MyCode
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            BigInteger bc = new BigInteger("1");
            for (int j = 2; j <= n; j++) {
                bc = bc.multiply(BigInteger.valueOf(j));
            }
            System.out.println(bc);
        }
		
		
	}
}
