package chapter02;

public class CircleArea {
	public static void main(String[] args) {
		double pi=3.14;
		int radius=10;
		
//		원의 공식 반지름 x 반지름 x pi
//		숫자 연산자 결과는 큰 타입을 따라감
		double circlearea = pi*radius*radius;
		System.out.println(circlearea);
	}
}
