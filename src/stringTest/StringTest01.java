package stringTest;

public class StringTest01 {

	public static void main(String[] args) {
		
		String firstName = "홍";
		String lastName = "길동";
		
		String fullName = firstName + lastName; //문자열 연결
		
		System.out.println(fullName);
		
		int age = 25;
		
		System.out.println("나이:" + age);
		
		String str = "나이:";
		String strs = str + age; //문자열 + 정수 -> 자동형변환 -> age->문자열로 자동 변환
		System.out.println(strs);
		
		System.out.println(fullName.length()); //문자열의 길이->문자의 개수를 반환->3글자
		System.out.println(strs.length()); //문자열의 길이->문자의 개수를 반환->5글자
		
		System.out.println("=====================");
		
		String str1 = "Hello";
		System.out.println(str1.charAt(1)); //인덱스를 사용하여 한글자씩 추출하여 반환
		
		String str2 = "Hello Good Morning Java";
		str2.contains("Good"); //true를 반환
		//Good이라는 문자열이 str2에 들어있으면 true, 아니면 false
		str2.startsWith("Hello"); //true
		//특정 문자열로 시작하는지의 여부를 확인 true 또는 false
		str2.endsWith("Java");
		//특정 문자열로 끝나는지의 여부를 확인 true 또는 false
		String str3 = "abc.jpg";
		str2.endsWith(".jpg"); //jpg 이미지 파일의 여부를 확인
		
		System.out.println(str3.substring(4)); //확장자만 추출
		//입력한 인덱스에 해당하는 문자부터 마지막 문자까지 추출 
		String str4 = "대한민국";
		System.out.println(str4.substring(1, 3)); //한민
		//끝 인덱스는 포함되지 않는다
				
		System.out.println("=====================");
		
		System.out.println(str4.replace("민국","국민")); //민국->국민
		String str5 = str4.replace("민국","국민"); //str5->대한국민
		System.out.println(str4); //대한민국
		
		String str6 = "우리는-자바-공부를-열심히-해야됩니다!";
		//- -> _ 로 변경
		String str7 = str6.replace("-","_");
		System.out.println(str7);
		String str8 = str6.replaceAll("-", " ");
		System.out.println(str8);
		//replace()와 replaceAll의 차이는 정규식의 사용여부
		
		String str9 = "abc123def456";
		//str9에서 숫자를 제거하시오->abcdef
		
		String str10 = str9.replaceAll("[0-9]", ""); //정규식 사용->모든 숫자 제거
		System.out.println(str10);
		String str11 = str9.replaceAll("[^0-9]", ""); //정규식 사용->모든 영어 제거
		System.out.println(str11);
		
		String str12 = "Korea";
		System.out.println(str12.toUpperCase()); //대문자로 변경
		System.out.println(str12.toLowerCase()); //소문자로 변경
		String str13 = " 안녕하세요  ";
		System.out.println(str13);
		System.out.println(str13.trim()); 
		//문자열 양쪽의 공백을 제거 -> 외부로부터 입력받은 문자열은 무조건 trim()을 적용한 후 사용
		String str14 = ""; //아무것도 저장안됨
		//외부로부터 문자열을 입력받았을때 확인 필요->내용이 있는지 없는지의 여부를 확인
		System.out.println(str14.isEmpty()); 
		//비어있으면 true, 무슨 문자라도 저장이 되어 있으면 false
		String str15 = " "; //공백 입력됨
		System.out.println(str15.isEmpty()); //공백도 문자로 인식->false
		System.out.println(str14.isBlank()); 
		//공백문자만 들어있는 경우->true, ""->아무것도 없어도 true
		
	}

}
