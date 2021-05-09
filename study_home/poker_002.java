package study_home;

public class poker_002 {

	public static void main(String[] args) {
		// 포커 풀하우스 스트레이트 트리플 투페어 페어 엘스(탑)
		int card[] = new int[] {1,1,3,4,5,6,7};
		System.out.println("스트레이트: "+ straight(card));
		System.out.println(result(card));
		//포커-풀하우스-스트레이트- 트리플-투페어-페어-else(탑) "입니다."

	}
	//포커를 확인할 수 있는 메소드
	public static int poker(int card[]) {
		int cnt = 1, num = 0;
		for(int i = 0; i<card.length-1;i+=1) {
			if(card[i] == card[i+1]) {
				cnt+=1;
				if(cnt==4) {
					return card[i];
				}
			}else {
				cnt=1;
			}
		}
		return 0;
	}
	//스트레이트 확인할 수 있는 메소드
	public static int straight(int card[]) {
		int num = 0, tes=1;
		for(int i=0;i<card.length-1;i+=1) { // 배열길이가 7개면 i는 i<7-1 이므로 i<=5 card[5]는 배열 6번째
			if(card[i] == card[i+1]) {
				continue;
			}
			if(card[i] == card[i+1]-1) {
				tes += 1;
				num = card[i]+1;
			}else {
				if(tes >= 5) {
					return num;
				}
				tes = 1;
			}
		}
		if(tes >= 5) {
			return num;
		}
		return 0;
	}
	//트리플을 확인할 수 있는 메소드
	public static int[] tripleList(int[]card) {
		int cnt = 1, num =0, k= 0;
		int list[] = new int[2];
		for(int i=0;i<card.length-1;i+=1) {
			if(card[i] == card[i+1]) {
				cnt+=1;
				num = card[i];
			}else {
				if(cnt==3) {
					list[k] = num;
					k+=1;
				}
				cnt = 1;
			}
		}
		if(cnt == 3) {
			list[k] = num;
			k+=1;			//이부분은 왜??? 왜 더해도 잘 돌아가는걸까??
		}
		if(k==0) {			// 트리플이 0개일때 -> 왜냐하면 트리플이 있었다면 k값도 1증가하고 식이 다음으로 넘어가기 때문에 
		return null;
		}if(k==2) {			// @@@ 트리플이 몇개지?? // 최소 list[k] = list[2]가 됨, 마지막이 트리플일 경우도 +1해주고 끝나기 때문에 확인값에서는 k=2가 됨
			return list;
		}else {
			int tmp[] = new int[1];
			tmp[0] = list[0];
			return tmp;
		}
	}
	//트리플 기능하는 메소드 정리
	public static int triple(int[]card) {			//@@@ 헷갈려!
		int []res = tripleList(card);
		if(res == null|| res.length == 2) {		// 즉 이때는 트리플이 하나가 아닌 경우
			return 0;
		}
		return res[0];	//위에서 안걸러지면 트리플값이 하나 있는거니까 배열 res의 0번지 불러오기
	}
	//페어를 확인할 수 있는 메소드
	public static int[] pairList(int[]card) {
		int pair[] = new int[3];
		int cnt = 1, num = 0, res =0;
		for(int i=0;i<card.length-1;i+=1) {
			if(card[i] == card[i+1]) {
				cnt +=1;
				num = card[i];
			}else {
				if(cnt == 2) {
					pair[res]= num;
					res += 1;
				}
			}
		}
		if(cnt == 2) {
			pair[res] = num;
			res += 1;
		}
		if(res == 0) {
			return null;
		}else if(res <3) {
			int tmparr[] = new int[res];
			for(int i=0;i<res;i+=1) {
				tmparr[i] = pair[i];
			}
			return tmparr;
		}
		return pair;	// @@@pair에서 리턴하는게 뭐지? 배열? 이게 페어가 2개 이상일땐가? 몇갤 리턴하는거지?
	}
	//원페어를 확인할 수 있는 메소드
	public static int onePair(int[]card) {
		int res[] = pairList(card);
		if(res != null && res.length == 1) {
			return res[0];
		}
		return 0;
	}
	//투페어를 확인할 수 있는 메소드
	public static int[] twoPair(int[]card) {
		int res[] = pairList(card);
		/*if(res != null && res.length >= 2) {
			return res;
		}
		return null;*/ //@@@ 이렇게 하는 이유는?
		if (res == null || res.length == 1) {
			return null;
		}
		return res;
	}
	
	//풀하우스를 확인할 수 있는 메소드 ####### 하다가 맘
	public static int fullHouse(int[]card) {		// @@@왜 배열 아니고 정수일까?
		int res[] = new int[3];
		return 0;
	}
	//포커-풀하우스-스트레이트- 트리플-투페어-페어-else(탑) "입니다."
	public static int result(int[]card) {
		int twoPair = 0;
		int result[] = {poker(card), fullHouse(card), straight(card),triple(card), twoPair, onePair(card)};
		for(int i=0;i<result.length;i+=1) {
			if(i!= 4) {
				if(result[i]!=0) {
					switch(i) {
					case 0:
						System.out.print("포커 ");
						return poker(card);
					case 1:
						System.out.print("풀하우스 ");
						return fullHouse(card);
					case 2:
						System.out.print("스트레이트 ");
						return straight(card);
					case 3:
						System.out.print("트리플");
						return triple(card);
					case 5:
						System.out.print("원페어");
						return onePair(card);	
					}
				}
			}else {
				if(i == 4) {
					System.out.print("투페어 ");
					for(int tmp: twoPair(card)) {
						return tmp;
					}
				}
			}
		}
		System.out.print("탑 ");
		return card[card.length-1];
	}
	
	/*public static result printList(int[]card) {
		int res;
		if(twoPair(card)[1]>twoPair(card)[0]) {
			res = twoPair(card)[1];
		}else {
			res = 0;
		}
		int printList[] = {poker(card), fullHouse(card), straight(card),triple(card), res, onePair(card)};
		for(int i=0; i<printList.length;i+=1){
			printList[i] = result[i];
			case(result[i]){
			POKER:
				return poker(card);
			FULLHOUSE:
				return fullHouse(card);
			STRAIGHT:	
				return straight(card);
			TRIPLE:
				return triple(card);
			res:
				return twoPair(card);
			ONEPAIR:
				return onePair(card);
			}
		}
		
		for (~ ) {
if(i!=4) {//투페어 아닌 경우 스위치 사용
} else {//투페어인 경우 스위치 사용 안하고 포문 넣어서 출력(기존대로)
{
}
	}
	enum result{POKER, FULLHOUSE, STRAIGHT, TRIPLE, TWOPAIR, ONEPAIR}*/
}
