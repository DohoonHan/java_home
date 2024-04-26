package chapter02;

public class ByteExample {

	public static void main(String[] args) {
//		int var1= -129;
//		ERROR byte는 2비트로 -128~127까지의 범위이기 때문이다.
//		byte var2= -129;
		byte var1= -128;
		byte var2= -30;
		byte var3= 0;
		byte var4= 30;
//		ERROR byte는 2비트로 -128~127까지의 범위이기 때문이다.
//		byte var5= 128;
		byte var5= 127;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	}
}
