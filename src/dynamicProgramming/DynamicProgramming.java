package dynamicProgramming;

public class DynamicProgramming {
	public int cutRopes(int len){
		if(len<2) return 0;
		if(len==2) return 1;
		if(len==3) return 2;
		
		int products[] = new int[len+1];
		products[0]=0;
		products[1]=1;
		products[2]=2;
		products[3]=3;
		
		
		for(int i=4;i<=len;i++){
			int max = 0;
			int product = 0;
			for(int j=1;j<=i/2;j++){
				product = products[j]*products[i-j];
				if(max<product) products[i]=product;
				max = product;
			}
		}
		return products[len];
	}
	public static void main(String[] args) {
		DynamicProgramming dp = new DynamicProgramming();
		System.out.println(dp.cutRopes(7));
	}
}
