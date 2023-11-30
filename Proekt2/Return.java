package Proekt2;

public class Return {

	public static void main(String[] args) {
		int x=5;
		int y= myFunc(x);
System.out.println(y);
	}
	
	public static int myFunc(int x) {
		return x*5;
	}

}
