package nthRandomNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NthRandomNumber {
	
	public static void main(String args[]) {
		
		List<Integer> randList = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i=0; i<500; i++) {
			int randn = rand.nextInt(10000);
			randList.add(randn);
			System.out.println(randn);
		}
		Collections.sort(randList);
		System.out.println(randList);
		Scanner ui = new Scanner(System.in);
		System.out.println("Enter Nth number ");
		int nthNum = ui.nextInt();
		
		System.out.println("The " + nthNum +" th smallest number is " + randList.get(nthNum-1));
		
		
	}

}
