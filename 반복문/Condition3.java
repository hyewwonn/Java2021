package 반복문;

import java.util.Scanner;

public class Condition3 {
	/*큐브 연예인 아키네이터*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer;
		int idol = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("큐브 아이돌을 생각하세요(예 1, 아니오 2) : ");
		answer = scan.nextInt();
		if(answer == 1) {
			System.out.print("여자인가요? : ");
			answer = scan.nextInt();
			if(answer ==1) {//여자
				System.out.print("멤버가 6명 이상인가요? : ");
				answer = scan.nextInt();
				if(answer == 1) {//썸 칯
					System.out.print("멤버 중 중학생이 있나요? : ");
					answer = scan.nextInt();
					if(answer == 1) {//썸
						idol = 5;
						getCubeIdol(idol);
					}
					else {//칯
						idol = 2;
						getCubeIdol(idol);
					}
				}
				else {//들
					idol = 4;
					getCubeIdol(idol);
				}
			}
			else {//남자
				System.out.print("그룹으로 소속되어 있나요? : ");
				answer = scan.nextInt();
				if(answer == 1) {//빝 펜
					System.out.print("데뷔곡이 비밀인가요? : ");
					answer = scan.nextInt();
					if(answer == 1) {//빝
						idol = 1;
						getCubeIdol(idol);
					}
					else {//펜
						idol = 3;
						getCubeIdol(idol);
					}
				}
				else {//권 선
					System.out.print("프로듀스에 나왔나요? : ");
					answer = scan.nextInt();
					if(answer == 1) {//선
							
						idol = 6;
						getCubeIdol(idol);
					}
					else {//권
						idol = 0;
						getCubeIdol(idol);
					}
				}
					
			}
		}	
		else {//시작안함
			System.out.println("종료합니다");
		}
			
	}

	public static void getCubeIdol(int idol) {
		System.out.print("생각한 큐브 아이돌은 ");
		switch(idol) {
		case 0: System.out.println("조권"); break;
		case 1: System.out.println("비투비"); break;
		case 2: System.out.println("씨엘씨"); break;
		case 3: System.out.println("펜타곤"); break;
		case 4: System.out.println("(여자)아이들"); break;
		case 5: System.out.println("라잇썸"); break;
		case 6: System.out.println("유선호"); break;
		}
	}

}
