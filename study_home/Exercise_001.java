package study_home;

import java.util.Scanner;

public class Exercise_001 {

	public static void main(String[] args) {
		// TODO 4월 29일 이중 루프 for문 복습		#결과 : 3/7 다시풀기
		
		
		
		/*01.콘솔에서 q나 Q를 입력받을때까지 반복하는 예제(0)
		
		Scanner scan = new Scanner(System.in);
		char op;
		for(;;){
			System.out.print("q나 Q를 입력하세요: ");
			op = scan.next().charAt(0);
			if(op=='q'||op=='Q') {
				System.out.print("정답입니다.");
				break;
			}
		}															*/
		 
		
		
		/*02.두 정수의 최소 공배수를 구하는 코드를 작성하세요.(@@@다시풀기)
		
		1차시도.
		int i, num1, num2;
		for(num2=8;;num2+=num2) {
			for(num1=3;num1<=num2;num1+=num1) {
				i=num1;
				System.out.println(i);
				break;
			}	
		}
		2차시도.
		int i, num1=8, num2=12;
		for(i=num1;;i+=num1) {
			if(i%num2==0) {
				System.out.println(i);
				break;
			}
		}
		//정수의 배수는 어떻게 구하나요?
		/*int i가 i+=i?
		 *그럼 이 발전한 정수 i가 최초로 발전한 j와 같을때? 공배수 아닐까?			*/
		
		
		
		/*03.정수 num이 소수인지 아닌지 판별하는 코드를 작성하세요. (@@@다시풀기)
		int i, cnt=0, num = 14;
		for(i=1;i<=num;i+=1) {
			if(num%i==0) {
				cnt+=1;
			}
		}
		if(cnt==2) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("no");
		}															*/
		
		
		
		/*04.100이하의 모든 소수를 출력하는 코드를 작성하세요.     @@@아앍 다시풀기
		1차시도.
		int i, j, k=1;
		for(i=1, j=0; i<=100; i+=1){
			if(i%k==0) {
				j+=1;
				
			}
			if(j==2) {
				System.out.print(k);
			}
		}															*/
		
		
		
		/*05.1부터 100까지 숫자 중 일의 자리가 3, 6, 9로 끝나는 수들을 출력하는 코드(0)
		int i,j=0;
		for(i=1;i<=100;i+=1) {
			if(i%10==3||i%10==6||i%10==9) {
				System.out.print(i+ " ");
				j+=1;
			}
			if(j%3==0) {
				System.out.println();
			}
		}															*/
		
		
		
		/*06. 정수를 거꾸로 출력하는 코드를 작성하세요.(0)
		int i = 1234;
		for(;;) {
			System.out.print(i%10);
			i = i/10;
			if(i==0) {
				break;
			}
		}															*/
		
		
		
		/*07. 랜덤 숫자맞추기 게임(0)
		//Math.random()
		
		int min = 1, max = 100, k=60;
		int r = (int)(Math.random()*(max-min+1)+min);
		for(;;) {
			//scan.으로 k값 입력받기 루프문 생성
			if(r<k) {
				System.out.println("down");
			}else if(r>k) {
				System.out.println("up");
			}else if(r==k) {
				System.out.println("정답");
				break;
			}
			
			
		}															*/
		
		

	}

}
