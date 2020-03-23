package huawei;

import java.util.Scanner;

public class reverseSentence26Words {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	String s = sc.nextLine();
        	String ss[] = s.split("[^a-zA-Z]+");
        	StringBuffer sb = new StringBuffer();
        	for(int i=ss.length-1;i>=0;i--){
        		sb.append(ss[i]+" ");
        	}
            System.out.print(sb.toString().trim());
        }
    }
}
