package stringTest;

public class StringNumTest {

	public static void main(String[] args) {
		//****** 문자열 숫자 -> 실제 숫자(정수, 실수)로 변환 *******
		
		String age = "17"; //외부로부터 입력 받은 나이
		
		int ageNum = Integer.parseInt(age);
		//문자열 age 값이->정수로 변환되어서 ageNum 저장
		//문자열 숫자 -> 실제 정수형 숫자
		
		int plusAge = ageNum + 3; //당신의 나이는 3년 후에 20살이 됩니다.
		//age->문자열이므로 계산 불가
		System.out.println(plusAge); //20
		
		String height = "175.8";
		double heightNum = Double.parseDouble(height);
		//문자열 height 값이->실수로 변환되어서 doubleNum 저장
		

	}

}
