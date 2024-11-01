import java.util.Scanner;
public class ForMultiples13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiple, counter = 0, sum = 0;
        System.out.print("Input the multiple: ");
        multiple = input.nextInt();
        for (int i = 1; i <= 50; i++) {
            if (i %multiple == 0) {
                sum += i;
                counter++;
            }
        }
        System.out.printf("There are %d number that are mulitple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of h%d in range 1 to 50 is %d. \n",multiple, sum);
    } 
}