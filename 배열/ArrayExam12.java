package �迭;

public class ArrayExam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[4][4];
		int k = 0;
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				a[i][j] = ++k;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
