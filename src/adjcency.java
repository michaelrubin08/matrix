import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class adjcency {

	public static void main(String[] args) throws IOException {

		String Input;

		BufferedReader br = new BufferedReader(new FileReader("testFile.txt"));

		Input = br.readLine();
		PrintStream prOut = new PrintStream(new FileOutputStream("OutputFile.txt"));

		int temp = Integer.parseInt(Input);
		int cols = temp;
		int rows = temp;
		int num = rows * rows;
		int count = (int) Math.pow(2, num);
		for (int i = 0; i < count; i++) {

			String s = String.format("%" + num + "s", Integer.toString(i, 2)).replaceAll(" ", "0");
			System.setOut(prOut);
			System.out.println("Matrix " + i + ", Binary value " + s);
			int[][] matrix = newMatrix(rows, cols, s, temp);
		}
	}

	private static int[][] newMatrix(int rows, int cols, String s, int temp) {

		int result[][] = new int[rows][cols];

		for (int x = 0; x < s.length(); x++) {

			int t = s.charAt(x) - '0';

			System.out.printf("%2d", t);
			if ((x + 1) % temp == 0) {
				System.out.println();
			}

		}

		return result;
	}

}
