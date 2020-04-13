package huawei;

public class findpath {
	public static int dp(int cost[][], int m,int n) {
		int i,j;
		int lowcost[][] = new int[m+1][n+1];
		lowcost[0][0]=cost[0][0];
		//第一行初始状态
		for(i=1;i<=m;i++) {
			lowcost[i][0] = lowcost[i-1][0]+cost[i][0];
		}
		//第一列的初始状态
		for(j=1;j<=n;j++) {
			lowcost[0][j] = lowcost[0][j-1]+cost[0][j];
		}
		//
		for(i=1;i<=m;i++) {
			for(j=1;j<=n;j++) {
				lowcost[i][j] = min(lowcost[i][j-1],lowcost[i-1][j])+cost[i][j];
			}
		}
		return lowcost[m][n];
		
	}
	public static int min(int x,int y) {
		if(x<y) 
			return x;
		else
			return y;
	
	}
	public static void main(String args[]) {
		int input[][]= {
				{1,3,1},
				{1,5,1},
				{4,2,1}
		};
		System.out.println(dp(input,2,2));
	}
}
