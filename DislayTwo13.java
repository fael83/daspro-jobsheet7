import java.util.Scanner;
public class DislayTwo13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;
        System.out.print("Input some number: ");
        numInput = input.nextInt();
        for (int i = 2; i <= numInput; i += 2) {
            // if (i % 2 == 0) {
                System.out.println("2 multiple: " + i);
            
        }
    }
}