import java.util.*;
class Fraction{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x1,x2,y1,y2,x3,y3,ans;
		System.out.println("Enter numbers:");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("first fraction: "+x1+"/"+y1);
		x2=sc.nextInt();
		y2=sc.nextInt();
		System.out.println("first fraction: "+x2+"/"+y2);
		x3 = (x1*y2) + (x2*y1);
		y3 = y1*y2;
		ans=x3/y3;
		System.out.println(x1+"/"+y1+" + "+x2+"/"+y2+" = "+ans);
	
	}
}

