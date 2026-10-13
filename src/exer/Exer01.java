package exer;

public class Exer01 {

	public static void main(String[] args) {
		
		String email = "korea@korea.com";
		
		int index = email.indexOf("@"); //해당 문자의 인덱스를 반환
		
		String result1 = email.substring(0, index); //끝 인덱스의 문자는 포함되지 않음
		//korea
		String result2 = email.substring(index+1);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
