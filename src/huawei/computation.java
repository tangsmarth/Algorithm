package huawei;

import java.text.DecimalFormat;

public class computation {
	public static void main(String ss[]) {
		String s = "1+1/3";
		if(s.length()<=1) {
			System.out.println(s);
		}else {
			DecimalFormat fmt = new DecimalFormat("##0.00"); 
			System.out.println(fmt.format(computate(s.toCharArray())));
		}
		
	}
	
	private static double compute(double a, double b, char op) {
		switch (op) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		}
		return -1;
	}
	
	private static double computate(char[] expr) {
		double c1 = Double.parseDouble(expr[0] + "");
		double c2 = Double.parseDouble(expr[2] + "");
		int index = 3;
		char op = expr[1];
		while (index < expr.length) {
			//先乘除后加减
			if (expr[index] == '*' || expr[index] == '/') {
				c2 = compute(c2, Double.parseDouble(expr[index + 1] + ""),
						expr[index]);
			} else {
				c1 = compute(c1, c2, op);
				op = expr[index];
				c2 = Double.parseDouble(expr[index + 1] + "");
			}
			index += 2;
		}
		return compute(c1, c2, op);
	}
 
	
}
