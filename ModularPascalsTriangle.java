import java.util.Arrays;
public class ModularPascalsTriangle {
	
	private int rows;
	private int cols;
	private int mod;
	private int[][] triangle;

	public ModularPascalsTriangle(int rows, int cols, int mod) {
		this.rows = rows;
		this.cols = cols;
		this.mod = mod;
		this.triangle = new int[rows][cols];
		

		
		// Column 0 will always contain 1 for all rows.
		for (int i = 0; i < rows; i++) 
			triangle[i][0]  = 1;
		
		// The rest of row 0 will contain zeros.
		for  (int i = 1; i < cols; i++)
			triangle[0][i] = 0;
		
	
		
		for (int i = 1; i < rows; i++)
			for (int j = 1; j < cols; j++) 
				triangle[i][j] = (triangle[i-1][j-1] + triangle[i-1][j]) % mod;
			
				
				
	}
	
	public int getValue(int row, int col) {
		return triangle[row][col];
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getCols() {
		return cols;
	}
	
	public int getMod() {
		return mod;
	}

}
