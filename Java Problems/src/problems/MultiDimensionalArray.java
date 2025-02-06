package problems;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 3, columns = 3, counter=0;
		int[][] multiArray = new int[rows][columns];
		for (int row=0;row<multiArray.length; row++) {
			for(int column=0; column<multiArray[row].length; column++) {
				multiArray[row][column] = counter;
				System.out.print(counter);
				if(!(row == multiArray.length-1 && column == multiArray[row].length-1)) {
					System.out.print(", ");
				}
				counter++;
			}
			System.out.println();
		}
		
	}

}
