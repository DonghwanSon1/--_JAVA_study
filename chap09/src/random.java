import java.util.Random;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		Random a = new Random();
		
		for (int i = 0; i < 10; i++) {
			x = a.nextInt(6)+1;
			System.out.print(x + " ");
		}
		
	}

}
