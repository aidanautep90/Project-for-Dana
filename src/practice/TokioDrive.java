package practice;

import java.util.Scanner;

public class TokioDrive {
	
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		 System.out.println("Please enter the number from 1 to 12");
//		 
//		int a = scan.nextInt();
		
	
		int [] months = {2011, 2013, 2014, 2014, 2015, 2016};
		int a = 2015;
		for (int i = 1; i <= months.length; i++) {
			
			if (months[i]==a) {
				System.out.println("exists" + months[i]);
			}else {
				System.out.println("does not exists" + months[i]);
			}
				
		
			
			}
			
		}
		
	}


