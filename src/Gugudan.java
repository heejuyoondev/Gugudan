import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number : " + number);

        int result = number * 1; 
	}	
}
