package day02;

public class Ex03 {
	public static void main(String[] args) {
		//char,string
		char ch = 'A';
		// ''는 단일 문자만 저장하지만 ""는 문자열을 저장하기 때문에
//		char에 대입을 할 때 ""로 대입을 하면 문자열로 판단하여 에러가 
//		발생한다.
		int num =5;
		int ret;
		//그냥 선언만 해주면 쓰래기값이 저장된다.(값이 존재하지 
//		않는다)
		//값을 표현할 때는 값이 저장되어 있어야만 출력이 가능하다.
		ret =ch +num;
		System.out.println("A+5 ="+ret);
//		컴퓨터는 모든 값을 0,1로 처리하기 떄문에 A라는 문자를 사용하면
//		A라는 문자에 해당되는 숫자값을 출력해주기도 하는데
//		우린 그걸 Ascii code라고 한다.
//		각 문자별로 숫자로 맞춰놨기 떄문에 문자를 써도 인식하고 숫자를
//		써도 인식한다.
		System.out.println();
		System.out.println("ch : "+ch);
		System.out.println("num :"+num);
		
//		String str ='';
//		위와 같이 문자열에 단일문자 기호를 넣으면 에러가 나오게 ㄷ
//		된다.
		String str = "hello";
		System.out.println("변경 전 str :"+str);
		str = "test";
//		문자열은 ""로 묶어주며 String이라 명시해줘야 된다.
//		반드시 S는 대문자.
		System.out.println("변경 후 str :"+str);

		
	}
}
