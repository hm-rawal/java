package problems;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 10;
		for (int i = 1; i <= length; i++) {
			for (int j = length; j >= 1; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = length; j > 1; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}

			System.out.print("\n");
		}
		
		//for Diamond
//		for (int i = 1; i <= length; i++) {
//			for (int j = 1; j < length; j++) {
//				if (i >= j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			for (int j = length; j > 1; j--) {
//				if (i >= j) {
//					System.out.print("");
//				} else {
//					System.out.print("*");
//				}
//			}
//
//			System.out.print("\n");
//		}

		//for Christmas Tree
//		for(int i=1;i<=2;i++) {
//			for (int j=1; j<=length*2; j++) {
//				if((j>=length-1)&&(j<=length+1)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
	}

}
