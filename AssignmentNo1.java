import java.util.Scanner;
public class AssignmentNo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput , i= 1, a ;
        String s = " ";
        System.out.print("Input some number: ");
        numInput = input.nextInt();
        i = numInput;
        while (i >= 1) {
                System.out.println(s = " *".repeat(i));
                i--;
            }
    }         
}