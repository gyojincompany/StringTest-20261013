package exer;

//5. 다음 문자열에서 알파벳의 개수를 출력하는 프로그램을 작성하시오. (hint : 아스키 코드값 활용)
//"Hello123, Java456"


public class Exer02 {

	public static void main(String[] args) {
		String str = "Hello123, Java456";
		int count=0;
		
		str.charAt(0); //H
		str.charAt(1); //e
		str.charAt(2); //l
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			//65~90 or 97~122 사이의 아스키 코드 값이 속하면 알파벳임
			
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				count++;
			}
		}
		
		System.out.println("알파벳의 개수:" + count);

	}

}
