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
		
		
		
		
		/*6. Array : 정수 num의 약수를 배열에 저장후 출력 (최대10개)
		
		int num=10,i, r=0, arr[] = new int[10];
		
		for(i=1;i<=num;i+=1) {
			if(num%i==0) {
				arr[r] = i;
				r+=1;
				if(r==10) {
					break;
				}
			}
		}
		for(i=0;i<r;i+=1) {
			System.out.print(arr[i]+" ");
		}											*/
		
		
		
		/*7. 1~10사이의 정수 3개를 랜덤 생성 후 배열 저장, 중복여부 가리기
		
		int min = 1, max = 10, i;
		int arr[] = new int[3];
		
		for(i=0;i<arr.length;i+=1) {
			arr[i] = (int)(Math.random()* (max-min+1))+min;
		}
		
		int k;
		boolean isDuplicated = false;
		for(i=0;i<arr.length-1;i+=1) {
			for(k=i+1;k<arr.length;k+=1) {
				if(arr[i] == arr[k]) {
					isDuplicated = true;
				}
			}
		}
		if(isDuplicated) {
			System.out.println("중복");
		}else {
			System.out.println("중복아님");
		}
		
		//예시 : bool은 트루값일때 동작(조건식이참임) 따라서 조건식이 false(거짓)이라면 else 문구 동작
		boolean ani = false;
		if(ani) {
			System.out.println("아니");
		}else {
			System.out.println("응");
		}											*/
		
		/*8. 학생 3명의 성적을 입력받은 후 총점과 평균을 출력
		
		int i, r=0, arr[] = new int[3];
		
		Scanner scan = new Scanner(System.in);
		System.out.print( "3명의 성적 입력 : ");
		for(i=0;i<arr.length;i+=1) {
			arr[i] = scan.nextInt();
			r += arr[i];
		}
		System.out.println(r);
		System.out.println((double)r/arr.length);		*/
		
		
		
		/*9. 1~10 사이의 랜덤한 수를 6개 생성하여 배열에 저장한 후 출력(중복가능)
		
		int min = 1, max = 10, i;
		int arr[] = new int[6];
		
		for(i=0;i<arr.length;i+=1) {
			arr[i] = (int)(Math.random()*(max-min+1)+min);
			System.out.println(arr[i]);
		}												*/
		
		/*10. 향상된 for문 예제 : 전체 탐색 시 사용
		
		int arr[] = {1, 2, 3, 4, 5};
		for(int tmp:arr) {
			System.out.print(tmp + " ");
		}												*/
		
		
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
		
		// #j i 증가
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
		
		int i,k, min = 1, max = 10;
		int arr[] = new int[3];
		
		
		for(;;) {
			for(i=0;i<arr.length;i+=1) {
				arr[i] = (int)(Math.random()*(max-min+1)+min);
			}
			System.out.println("테스트용:"+arr[0]+" "+ arr[1]+" "+arr[2]);
				
			boolean ran = false;
			for(i=0;i<arr.length-1;i+=1) {
				for(k=i+1;k<arr.length;k+=1) {
					if(arr[i] == arr[k]) {
						ran = true;			
					}
				}
			}
			
			if(ran) {
				System.out.println("테스트용: 중복");
				continue;
			}else {
				System.out.println("테스트용: 중복아님");
				break;
			}
		}
		//여기까지 중복확인하고 랜덤값 입력함수 끝(기본세팅완료)
		Scanner scan = new Scanner(System.in);
		int j, num[] = new int[3];
		
		
		for(;;) {
			System.out.print("입력하세요(1~9): ");
			for(i=0;i<num.length;i+=1) {
				num[i] = scan.nextInt();		//값 입력받기(무한루프)
			}
			

			for(i=0,j=0;i<num.length;i+=1) {	//위치와 값 비교하기
				if(num[i] == arr[i]) {
					j+=1;
				}
			}
			/*여기부터 막힘 ㅠㅠ...*/
			int r = 0;
			boolean ran = false;
			for(i=0;i<num.length-1;i+=1) {		//위치 상관없이 값만 비교하기
				for(k=i+1;k<arr.length;k+=1) {
					if(num[i] == arr[k]) {
						ran = true;
						r += 1;	
					}
					
				}
			}
			/*바로 밑 코드 : 값만 비교하기 부분 막힘*/
			if(ran) {
				System.out.println(r+"b");
			}		
			if(0<j && j<3) {					//s와 o 해결
				System.out.println(j+"s ");
				continue;
			}
			if(j==3) {
				System.out.print("정답입니다.");
				break;
			}else {
				System.out.println("o");
			}
			
			//break; //임시로
		}
		System.out.println("테스트용: 무한루프 확인용");
		
		
		/* 랜덤수 -> arr에 3개 저장(for문 활용), 
		 * -> 랜덤수끼리 비교(안긴 for문*2)
		 * 테스트- 랜덤수 잘 저장되었는지 프린트 확인 후,
		 * do while로 해볼까? (초기값 증감패스 ..?)
		 * ----해결
		 * 
		 * for문으로 한다면:
		 * for(){
		 * 출력)1~9사이의 숫자를 3개 입력하세요:
		 * 정수 i j k에 각각 입력받음(스캔)
		 * ---해결
		 * 
		 * 1. 입력받은값 각각 arr[]와 비교
		 * if(){
		 * -> true의 갯수가 1개면 1s, 2개면 2s 3개면 3s 
		 * 		3s가 되면 정답입니다 출력 후 종료 break;  }
		 * ---해결
		 * 
		 * 2. else if(){
		 * -> 입력받은 값과 arr[]의 값을 하나씩 비교(순서중요하지 않음)
		 * 수끼리 비교(안긴 for문 확인해보기 : 중복확인해서 중복이 있으면 
		 * 그 각각마다 1b씩 출력 최대 3b)
		 * }
		 *##근데 어차피 위에거는 가로세로 확인하는거고 밑에거는 가로 한줄 확인이니까
		 *걍 밑에거 먼저하고 통과되면 그다음에 불 넣어서 트루갯수 확인하면 되는거아닌가?
		 *그러고 브레이크 하고 ..? 그럼 엘스까지 안가나?아닌데 갈거같은디.. 
		 *
		 *
		 * else: (일치하는 숫자가 하나도 없을경우 o 출력) 
		 * ---해결
		 * }
		 * 
		 * 
		 * 
		
		
		
		
		System.out.println("테스트용:"+arr[0]+" "+ arr[1]+" "+arr[2]+"숫잔가?"+(int)arr[0]);
		
		int a = arr[0];
		System.out.println(+a+10+": 정수 테스트용");
		
		
		
			System.out.println("입력하세요(1~9): ");
			
			
			
		}*/
		
		
	}

}
