package study_home;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		/*사용자번호를 랜덤으로 작성하고 당첨번호를 입력하면 당첨등수를 출력하는 코드를 작성
		 * 사용자번호(매개변수명 user[]): min=1,max=45,중복x,랜덤숫자 6개
		 * 당첨번호(변수명 com[]): min=1,max=45, 중복x, 랜덤숫자 6개+1개
		 * => 동일한 메소드 하나 작성하고 그거 끌어다 쓰면 될 듯
		 * 
		 * 사용할 변수값 
		 * user[], com[], cnt(중복숫자확인 후 저장), i,j(이중 포문에서 사용), 
		 * r(랜덤숫자임시배정), count(중복숫자 확인 갯수), n(숫자 생성 몇개나 할지)
		 * 
		 * 
		 * */
		// 로또만들기
		
		int user[] = new int[7];
		int min = 1, max = 45;
			init(user, min,max);
			for(int tmp: user) {
				System.out.print(tmp+" ");
			}
			
			int bonus = user[6];
			System.out.println();
				
				//당첨번호를 입력
				int lotto[] = new int[6];
				Scanner scan = new Scanner(System.in);
				
				
				System.out.print("당첨번호 6개를 입력하세요: ");
				for(int i =0; i<lotto.length;i+=1) {
					lotto[i] = scan.nextInt();
				}
				scan.close();
				//당첨 등수 확인
				printRank(user, lotto, bonus);

			}
			
		public static boolean contains(int arr[], int count, int num) {
			for(int i=0; i< count; i+=1) {
				if(arr[i]==num) {
					return true;
				}
			}
			return false;
		}
			
		public static void init(int []arr, int min, int max) {
				
			int cnt = 0;
			while(cnt < arr.length) {
				int r = (int)(Math.random()*(max-min+1)+min);
				if(!contains(arr, cnt, r)) {
					arr[cnt] = r;
					cnt += 1;
				}
			}
		}
			
			
			/*기능 : 두 배열이 주어지면 두 배열에서 같은 숫자가 몇개인지 알려주는 메소드
			 * 매개변수 : 두 배열 => int[]arr1, int[]arr2 
			 * 리턴타입 : 같은 숫자의 갯수 => int
			 * 메소드명 : getSameCount\
			 * */
		public static int getSameCount(int arr1[], int arr2[]) {
			int cnt = 0;
			for(int tmp:arr1) {
				if(contains(arr2, arr2.length, tmp)){
					cnt+=1;
				}
			}
			return cnt;
		}
			
			/*기능 : 자동 생성번호와 당첨번호, 보너스 번호가 주어지면 몇등인지 알려주는 메소드
			 * 	 단, 꽝은 0등으로 표현
			 * 매개변수 : 자동생성번호, 당첨번호, 보너스 번호
			 * 			=> int[]user, int[]lotto, int bonus
			 * 리턴타입 : 당첨 등수 => 정수 = int 
			 * 메소드명 : rank
			 * */
		public static int rank(int lotto[], int user[], int bonus) {
			int res = 0; //등수
			int count = getSameCount(lotto, user); //아래와 동일
			switch(count) {
			case 6: res = 1;	break;
			case 5:
				if(contains(lotto, lotto.length, bonus)) {		//이하 동일한 코드
					res = 2;
				}else {
					res = 3;
				}
					//res = contains(user, user.length, bonus)? 2:3; //조건선택연산자
				break;
			case 4: res = 4;	break;
			case 3: res = 5;	break;
			}
			return res;
		}
			/* 기능 : 자동생성번호와 로또번호, 보너스가 주어지면 당첨 등수를 출력하는 메소드
			 * 매개변수 : 자동생성번호, 당첨번호, 보너스
			 * 			=> int []user, int[]lotto, int bonus
			 * 리턴타입 : 없음 => void
			 * 메소드명 : printRank
			 * */
			public static void printRank(int []lotto, int[]user, int bonus) {
				int rank = rank(lotto, user, bonus);
				switch(rank){
					case 1,2,3,4,5:
						System.out.println(rank+"등입니다.");
						break;
					default:
						System.out.println("꽝입니다.");
				}		

	}
	/* 중복 가려내는 코드 작성*/
	
	/* 1~45 랜덤숫자 n개 배열[]에 저장하는 코드 작성*/
	
	/* u와 c 각각의 숫자 비교 (전체 중복 갯수 - 번지갯수)(스트라이크와 볼 사례)*/
	
	/* 메인? : 번호 n개 일치하면 n-i등 출력하기? i=5부터 1개씩 감소? 이상한뎅
	 * 이렇게 하려면 2등나올때는 일단 패스시켜야함 ㅎㅎ;
	 * 
	 * count값으로 몇개까지 셀지 정해서 int com[7];중에
	 * com[5]번지까지만 중복 출력하고 안에 if문으로 중복값 2 이하면 꽝 출력후 브레이크; 
	 * 
	 * 이중 for문 끝나면 예외로 밑에 for문 다시 돌려서
	 *  
	 * com[6]이랑 중복되는 u값 검색하고 없으면 컨티뉴
	 * 있으면 중복값 cnt가 6인지 확인후 6이면 2등! 
	 * */
	
	/* 지울것
	 * 두 와일 너무 하기싫은데 ...해야겟지 흐흫흑 이거랑 향상된 포문은 아직도 적용을 못하겟네
	 * 
	 * */

}
