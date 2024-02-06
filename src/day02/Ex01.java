package day02;

public class Ex01 {
	public static void main(String[] args) {
		int age = 30;
		//등호는 대입연산자로 오른쪽의 값을 왼쪽에 저장
//		변수 앞에는 항상 자료형이 존재해서 그 변수가 어떤 형태로 자료를
//		저장하는 지 명시해줘야 된다.
		double weight =55.0;
//		문장 뒤에 ;는 마침표 역할로 한 명령어가 종료됬다는 것을
//		명시해주는 역할을 한다.(필수)
		double height = 170.3;
//		자료형이 같은 경우에는 ,를 이용하여 언결하여 작성 가능
		double a =30,b=40;
		
		System.out.println("나의 나이는 "+age+"살 입니다.");
		System.out.println("나의 몸무게는"+weight+"kg입니다.");
		System.out.println("나의 키"+height+"cm입니다.");
//		변수를 사용하는 이유는 변수를 사용하지 않으면 코드를 자주 바꿔야되고
//		하드코딩으로 직접 값을 넣어주면 수정할 때 문장에 바뀌는 부분은 전부 바꿔줘야한다.
//		값을 직접 대입하는 방식 : 하드코딩
//		
	}
}
