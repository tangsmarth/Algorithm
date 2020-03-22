package huawei;

import java.util.Scanner;

public class changeBottle {
	public static int change(int total){

		int sum = 0;
		int a = 0;
		int b = 0;
		
		while(true){
			a = total/3;
			b = total%3;
			sum += a;
			if((a+b)<2) break;
			if((a+b)==2){
				sum += 1;
				break;
			}
			if((a+b)>2) total=a+b;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int in = sc.nextInt();
		    System.out.println(change(in));
        }
		
	}
}
