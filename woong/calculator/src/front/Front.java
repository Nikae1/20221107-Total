package front;

import java.util.Scanner;

public class Front {

	public Front(int recordIdx) {
		this.controller(recordIdx);
	}

	public void controller(int recordIndex) {
		Scanner scanner = new Scanner(System.in);
		String title = this.makeTitle();
		String[][] menu = { { "EXIT", "프로그램을 종료합니다.~~" }, 
							{ "MAIN", "연산하기", "끝내기" },
							{ "연산", "새로운 연산", "이어서 연산", "이전 화면" }, };
		/**/
		boolean loopCheck = true;
		int selectMenu;

		while (loopCheck) {

			/* 로딩 후 첫 화면 출력 */
			this.display(title);
			this.display(this.makeSubMenu(menu[recordIndex]));

			/*
			 * 사용자 입력 ==> 화면 이동 selectMenu는 나중에 사용을 하거나, 2번 이상 사용을 위해서 저장
			 * 
			 * selectMenu의 값은 사용자가 선택하는 값이므로 처음 Main메뉴에 있는 1, 0 값 중 선택
			 */
			selectMenu = this.userInput(scanner);
			if (this.isIntegerRange(selectMenu, 0, menu[recordIndex].length - 2)) {
				recordIndex += (selectMenu == 0) ? -1 : 1;

				if (recordIndex == 0) {
					this.display(title);
					this.display(this.makeSubMenu(menu[recordIndex]));
					loopCheck = false; // 종료
				} else {
					// 연산하기 화면의 새로운 분기를 제어하기 위한 화면제어 메소드 이동
				}
			} else {
				// 유효값이 아닌 경우 재입력 요청....사용자 입력 반복
			}

		}
		scanner.close();

	}

	public String makeTitle() {

		StringBuffer title = new StringBuffer();
		title.append("#####################################\n\n");
		title.append("      JS FrameWork Calculator v1.0\n");
		title.append("                   Designed By JW\n\n");
		title.append("#####################################\n\n");

		return title.toString();

	}

	public String makeMessage(String text) {
		StringBuffer message = new StringBuffer();
		message.append("[");
		message.append(text);
		message.append("]");
		return message.toString();
	}

	public String makeSubMenu(String[] menu) {
		StringBuffer subMenu = new StringBuffer();
		subMenu.append("[ ");
		subMenu.append(menu[0]);
		subMenu.append(" ]_____________________________\n\n");

		if (menu.length <= 2) {
			subMenu.append(menu[menu.length - 1] + "  \n");
			subMenu.append("________________________________________________");

		} else {
			for (int colIdx = 1; colIdx < menu.length; colIdx++) {
				// colIdx는 menu[0]을 다시 사용하지 않아도 되는 것이라서 1로 시작
				if (colIdx == menu.length - 1) {
					subMenu.append("0. " + menu[colIdx] + " \n");
					// 1. 2. 3. 0. 의 마지막의 줄바꿈 양식에 따라서

				} else {
					subMenu.append("  " + colIdx + ". " + menu[colIdx] + " ");
				}
			}
			subMenu.append("__________________________ select : \n");

		}

		return subMenu.toString();

	}

	/*
	 * 사용자 입력 전용 메소드 고려사항 : 1. 숫자로 변환이 불가능한 데이터가 입력되어질 경우 해결방안 2.Scanner Class의 Life
	 * Cycle과 Performance
	 * 
	 */
	public int userInput(Scanner scanner) {
		return scanner.nextInt();
	}

	/* 출력 전용 메서도 1 */
	public void display(String text) {
		System.out.print(text);
	}

	/* 출력 전용 메서도 2 */
	public void display(String[] text) {
		for (int idx = 0; idx < text.length; idx++) {
			System.out.print((idx + 1) + ". " + text[idx] + " ");
		}

	}

	/* 문자, 숫자 판별 체크 */
	private boolean isInteger(String value) {
		boolean Result = true;
		try {
			Integer.parseInt(value);
		} catch (Exception e) {
			Result = false; // e.printStackTrace();
		}
		return Result;
	}

	/* 문자 >> 정수 변환 */
	private int convertToInterger(String value) {
		return Integer.parseInt(value);
	}

	/* 정수의 범의 체크 */
	private boolean isIntegerRange(int value, int starting, int last) {
		return (value >= starting && value <= last) ? true : false;
	}

}
