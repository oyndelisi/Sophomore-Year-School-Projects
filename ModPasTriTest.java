import java.util.Arrays;
public class ModPasTriTest {

	public static void main(String[] args) {
		ModularPascalsTriangle triangle = new ModularPascalsTriangle(9, 9, 2);
		
		for (int i = 0; i < triangle.getRows(); i++) {
			for (int j = 0; j < triangle.getCols(); j++) {
				System.out.print(triangle.getValue(i, j));
			}
System.out.println("");
		}
		

	}

}
