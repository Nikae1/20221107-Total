package front;

import back.BackEnd;

public class FrontEnd {
	private String title;
	
	public FrontEnd() {
		this.title = this.makeTitle();
		System.out.println(title);
	}
	
	public String makeTitle() {
	StringBuffer title = new StringBuffer();
	
	title.append("************************************************\n\n");
	title.append("       JS Framework Calculator v1.0\n");
	title.append("                  Designed By HoonZzang\n");
	title.append("************************************************\n\n");
	return title.toString();
	}
	public String makeMessage(String text) {
		StringBuffer message = new StringBuffer();
		message.append("[");
		message.append(text);
		message.append("]");
		return message.toString();
	}
	
	public String makeSubMenu(String subMenuTitle, String menu) {
		StringBuffer subMenu = new StringBuffer();
		subMenu.append("[");
		subMenu.append(subMenuTitle);
		subMenu.append("]___________________________________\n");
		subMenu.append(menu);
		subMenu.append("");
		return subMenu.toString();
	}
	
	
	public void gugu() {
		int a =2*1;
		int b =2*2;
		int c =2*3;
		int d =2*4;
		int e =2*5;
		int f =2*6;
		int g =2*7;
		int h =2*8;
		int i =2*9;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int roomLength = 9;
		
	int[] storage = new int[roomLength];
	storage[0] = 2*1;
	storage[1] = 2*2;
	storage[2] = 2*3;
	
	
	for (int index=0; index<roomLength;index++) {
		System.out.println(storage[index]);
	
	}
	
	}
	
//	public void aaa() {
//		System.out.print("A"+this.title);
//	}
	
	
}

//int result;

/* 1. �����ڰ� ���� �ִ� ���� Ŭ���� �������Ʈ�� �޸𸮷� �ε� 
 * 2. (�ʿ��ϴٸ�) field�� �ʱ�ȭ 
 * 
 * *** Ŭ������ �ε��� �� �ѹ��� ���� �� �� �ִ�. */

//		System.out.println("FrontEnd Class");
//		System.out.println(backend.controller('+', 2, 3));
//		System.out.println(backend.product(2, 3));