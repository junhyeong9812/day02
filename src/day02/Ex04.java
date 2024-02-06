package day02;

public class Ex04 {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		int num = ch; //자동형변환
		System.out.println(num);
		//char의 값을 int형태로 변화해서 num에 들어가며
		//이러한 것을 형 변환이라 한다.
		
		
		//char ch02 =num;
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		Type mismatch: cannot convert from int to char
//		자료형에 문제가 생겼다는 것을 알 수 있다.
//		int형태는 char형으로 자동으로 변환이 안되는데
//		이유는 크기가 다르기 때문이다.
//		int는 4byte지만 char는 2byte이기 때문에 
//		2byte라는 공간에 4byte를 넣으려고 해서 안되는 것
		
		//위 예제로 알 수 있는 것은 작은 값을 큰 곳에 넣을 수 있지만
		//큰 값을 작은 곳에 넣을 수 없다.
		//int<<char는 가능하지만 char<<int는 불가능하다.
		//그렇기 떄문에 강제로 형태를 변환시켜줘야 되는데
		//이를 강제형변환이라 한다.
		//사용 방법은 변수 값에 (변환할 자료형)변수 이렇게 작성하면 된다.
		char ch02 =(char)num;
		System.out.println(ch02);
		double d = 1.111;
		//float f = 1.111;
//		일반적으로 우리가 사용하는 실수 값은 double로 인식을 하는데
//		일반적인 실수 값은 8byte이기 떄문에
//		float에 들어갈 수 없다는 것이다.
//		float는 4byte자료형이기 때문이다.
		float f1 =(float)1.111;
		float f2 =1.111f;
		이와 같이 float는 강제형변환을 이용하거나 넣으려는 숫자 뒤에
		f를 넣어줌으로 써 float이라 인식시키는 방법을 주로 사용한다.
		
	}
}
