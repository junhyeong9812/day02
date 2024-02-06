package day02;

public class Ex02 {
	public static void main(String[] args) {
		int number = 123;
		//초기에만 변수 선언 시 자료형을 넣어주면 된다.
		System.out.println("변경 전 num :"+number);
		number =100;
		
		System.out.println("변경 후 num :"+number);
		number = number + 200;
//		오른쪽의 값을 연산 후 왼쪽에 대입
		System.out.println("변경 후 num :"+number);
		//코드는 순차적으로 실행된다.
//		변수는 값을 지정하고 언제든지 변경이 가능하다.
		
	}
}
