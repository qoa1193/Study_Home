package study_home;

public class Poker_001 {

	public static void main(String[] args) {
		// 5월 7일차 복습하기 - 포커
		//배열에 같은 숫자 3개가 있으면 있는 숫자들을 배열에 저장하여 알려주는 코드를 작성하세요.
		int arr[] = new int[] {1,2,2,3,3,3,7};
		int card[] = new int[2];
		int cnt = 1, num = 0;
		int res = 0;
		
		for(int i= 0; i<arr.length-1;i+=1) {
			if (arr[i] ==arr[i+1]) {
				cnt +=1;
				num = arr[i];
			}else{
				if(cnt%3==0) {
					card[res] = num;
					res+=1;
					cnt =1;
				}
				cnt = 1;
			}
		}
		if(cnt %3 ==0) {
			card[res] = num;
		}
		if(res == 0) {
			System.out.println("트리플 없음");
		}else {
			for(int i = 0; i < res; i+=1) {
				System.out.print(card[i]+" ");
			}
		}

	}

}
