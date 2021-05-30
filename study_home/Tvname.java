package study_home;

public class Tvname {
	
	public static void main(String[] args) {
		// 자바테스트 연습 : 클래스 만들기
		tv ac = new tv();
		ac.upp(1);
		ac.down(1);
		System.out.println("hi");

	}
	
	
	
	

}
class tv{
	private int ch = 7;
	public void upp(int a) {
		ch++;
		System.out.println(ch);
}
	public void down(int a) {
		ch--;
		System.out.println(ch);
}
}
