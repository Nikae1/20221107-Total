package loader;

import java.util.Scanner;

import front.FrontEnd;

public class Loader {

	public static void main(String[] args) {
		System.out.println("Loading.....");
		/* [DataType] [VariableName]
		 * 
		 * [VariableName] = new [Constructor]; 
		 * 
		 * Constructor = ������ ?
		 *   -- Ŭ������ ����� �޸𸮷� �ε������ش�.
		 * */
	
		FrontEnd frontend = new FrontEnd();
//		frontend.aaa
//		frontend.bbb
		System.out.println("Closing.....");
		
		int[] root = new int[2];
		root[0] =3;
		root[1]=5;
		int roomLength = 9;
		
		int[] storage = new int[roomLength];
		
		
		for (int dan = root[0]; dan < root[1]+1; dan++) {
			
			for (int index = 0; index < roomLength ; index++) {
				storage[index] = dan*(index+1);
				System.out.println(dan+"*"+(index+1)+ "=" +	storage[index]);
				
			}
			
			
		}
		
		
//		for(int dan=root[0]; dan<root[1]+1; dan++) {
//			
//				
//		
//		for (int index=0; index<roomLength;index++) {
//			storage[index] = dan*(index+1);
////			System.out.println(storage[index]);
//			System.out.println(dan+"*"+(index+1) +"="+ storage[index]);
//			
//			
//			
//		}
//		}
		
	}

}
