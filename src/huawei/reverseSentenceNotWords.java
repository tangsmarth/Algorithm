package huawei;

import java.util.Scanner;

public class reverseSentenceNotWords {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	String s = sc.nextLine();
        	String ss[] = s.split(" ");
        	for(int i=ss.length-1;i>=0;i--){
        		System.out.print(ss[i]+" ");
        	}
        }
    }
}
