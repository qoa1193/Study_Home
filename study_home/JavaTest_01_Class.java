package study_home;

public class JavaTest_01_Class {
	
	

	public static void main(String[] args) {
		// 자바테스트 연습 : 클래스 만들기
		String a = new String();
		abcu au = new abcu();
		au.reta();
		reta2();

	}
	public void reta() {
		System.out.println("클래스 연습");
	}
	public static void reta2() {
		System.out.println("클래스 연습");
	}


}
class abcu{
	
	
	public void reta() {
		System.out.println("클래스 연습");
	}
}

class updown {

	int ch = 1;
	
	public int upp(int a) {
		if(a>0) {
			return ch++; 
		}else {
			return 0;
		}
	
	}
	public int down(int a) {
		if(a>0) {
			return ch--;
		}else {
			return 0;
		}
	}
}
