package huawei;

import java.util.Arrays;
import java.util.Scanner;

public class sortString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String ss[] = new String[len];
		for(int i=0;i<len;i++){
			ss[i]=sc.next();
		}
		Arrays.sort(ss);
		for(int j=0;j<ss.length;j++){
			System.out.println(ss[j]);
		}
	}
}
