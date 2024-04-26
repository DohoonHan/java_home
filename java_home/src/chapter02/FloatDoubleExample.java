package chapter02;

public class FloatDoubleExample {
	public static void main(String[] args) {
//		float var1 = 3.14; ERROR 3.14 뒤에 F(f)가 없기 때문이다.
//		실수는 기본적으로 Double 취급이기 때문
//		float var1 = 3.14f;
//		float var2 = 3.14F;
		float var1 = 3.14F;
		double var2 = 3.14; 
		
//		값을 저장시 오류발생하지 않고, 출력시 짤림
		float var3=0.1234567890F;
		float var4=0.1234567891F;
		float var5=0.123456789123456789F;
		
//		소수점 자리수 제한없이 값을 가지나 출력시 짤림(소수점 자리수는 double > float)
		double var6=0.123456789123456789;
		double var7=0.123456789123456789123456789;
		
		double var8 = 3e6;
		float var9 = 3e6F;
		float var10 = 2e-3F;
		double var11 = 2e-3;
		
		System.out.println("var 1: "+var1);
		System.out.println("var 2: "+var2);
		System.out.println("var 3: "+var3);
		System.out.println("var 4: "+var4);
		System.out.println("var 5: "+var5);
		System.out.println("var 6: "+var6);
		System.out.println("var 7: "+var7);
		System.out.println("var 8: "+var8);
		System.out.println("var 9: "+var9);
		System.out.println("var 10: "+var10);
		System.out.println("var 11: "+var11);
	}
}
