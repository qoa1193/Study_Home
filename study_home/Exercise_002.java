package study_home;

import java.util.Scanner;

public class Exercise_002 {

	public static void main(String[] args) {
		// 4월30일차 복습
		
		/*1. while문을 이용하여 1~5 출력하는 예제
		
		int i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i+=1;
		}									*/
		
		
		/*2. while문과 continue를 이용한 짝수출력예제
		
		int i = 1,num = 9;
		while(i<=num) {
			if(i%2 !=0) {
			i += 1;
			continue;
			}
			System.out.print(i);
			i+=1;
		}									*/
		
		
		/*3. do while 예제 : 입력받은 문자가 q 또는 Q이면 종료
		
		char ch;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("문자를 입력하세요(q나 Q입력시 종료): ");
			ch = scan.next().charAt(0);
		}while(ch != 'q' && ch != 'Q');
		System.out.println("정답");
		scan.close();						*/
		
		//@@@ ch가 q가 아니고 Q가 아닐때(참)!= ch가 q이거나 Q일때(거짓)(쓰려면 안에 if문으로)
		
		
		
		/*4. 별 다섯개 다섯줄 출력하기 예제
		
		int i, j;
		for(i=1; i<=5; i+=1) {
			for(j=1;j<=5;j+=1) {
				System.out.print("*");
			}
			System.out.println();
		}									*/
		
		
		/*4-1. 공백4별4 줄5 출력하기 예제
		
		int i, j, k;
		for(k=1;k<=5;k+=1) {
			for(i=1;i<5;i+=1) {
				System.out.print(" ");
			}
			for(j=1;j<5;j+=1) {
				System.out.print("*");
			}
			System.out.println();
		}									*/
		
		
		/*4-2. 공백4~1/별1~4 줄5 출력하기 예제
		
		int i, j, k;
		for(i=1;i<=5;i+=1) {
			for(j=4;j>=i;j-=1) {
				System.out.print(" "); //@@@가로라는걸 명심 매줄마다 처음부터!!다시시작한다...
			}
			for(j=1;j<=i;j+=1) {
				System.out.print("*");
			}
			System.out.println();
		}									*/
		
		
		/*5. 콘솔에서 정수를 5번 입력받아 입력받은 값을 출력하기 예제
		
		int i, num;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 5번 입력하세요: ");
		for(i=1;i<=5;i+=1) {
			num = scan.nextInt();
			System.out.println(num);
		}									*/
		
		
		/*5-1. 콘솔에서 정수를 5번 입력받아 저장한 후 저장된 값 출력하기 예제
		
		int i, arr[] = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 5번 입력: ");
		for(i=0;i<arr.length;i+=1) {
			arr[i] = scan.nextInt();
			System.out.println(arr[i]);
			
		}									*/
		
		/*과제 : 트리 만들어보기
		
		int i, j,k=1;
		for(j=1;j<=5;j+=1) {
			for(i=4;i>=j;i-=1) {
				System.out.print(" ");
			}
			for(i=1;i<=k;i+=1) {
				System.out.print("*");
				
			}
			k+=2;
			System.out.println();
		}
		
		// j i 증가
		 * 1 1 0 
		 * 2 3 1
		 * 3 5 2
		 * 4 7 3
		 * 5 9 4 => j-i= +1씩 증가 j는 i+1 // 2i-1로 풀어도 되네?(서)
		
		*과제 : (역)트리 만들어보기
		
		int i, j;
		for(j=1;j<=5;j+=1) {
			for(i=1;i<j;i+=1) {				//i<=j-1 실수는 <i와 <=i-1 다르다햇나?
				System.out.print(" ");
			}
			for(i=9;i>=2*j-1;i-=1) {		//@@@이부분 참고함
				System.out.print("*");
				
			}
			System.out.println();
		}									*/
		
		
		
		/*과제2 : 숫자 야구 게임 만들어보기 */
		
		
		/* 랜덤수 -> arr에 3개 저장(for문 활용), 
		 * -> 랜덤수끼리 비교(안긴 for문*2)
		 * 테스트- 랜덤수 잘 저장되었는지 프린트 확인 후,
		 * do while로 해볼까? (초기값 증감패스 ..?)
		 * 
		 * for문으로 한다면:
		 * for(){
		 * 출력)1~9사이의 숫자를 3개 입력하세요:
		 * 정수 i j k에 각각 입력받음(스캔)
		 * ###if(i==arr[0] && j ==arr[1] && k == arr[2]){
		 * 	출력)정답입니다.
		 *  break;
		 * 	}else if(근데 다 하나씩 비교해볼거면 이프문 너무 길어지는데
		 * 걍 for문으로 아까처럼 해결보는게 낫지 않나? 포의 지옥 ㅎ)####
		 * 
		 * }
		 * 
		 * 
		 * 
		*/
		int min = 1, max = 10;
		int arr[] = new int[3];
		
		arr[0] = (int)(Math.random()*max-min+1)+min;
		arr[1] = (int)(Math.random()*max-min+1)+min;
		arr[2] = (int)(Math.random()*max-min+1)+min;
		
		System.out.println("테스트용:"+arr[0]+" "+ arr[1]+" "+arr[2]+"숫잔가?"+(int)arr[0]);
		
		int a = arr[0];
		System.out.println(+a+10+": 정수 테스트용");
		
		
		/*for(;;) {
			System.out.println("입력하세요(1~9): ");
			
			
			
		}*/
		
		
		
		
		
		
		
		
		
		// 6부터: 향상된 for문, arr3, 테스트4,5 남음 + 과제

	}

}
