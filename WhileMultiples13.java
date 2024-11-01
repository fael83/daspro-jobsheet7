import java.util.Scanner;
public class WhileMultiples13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiple, counter = 0, sum = 0, i = 1;
        double average;
        System.out.print("Input the multiple: ");
        multiple = input.nextInt();
        // for (int i = 1; i <= 50; i++) {
        //     if (i %multiple == 0) {
        //         sum += i;
        //         counter++;
        //     }
        // }
        while (i <= 50) {
            if (i %multiple == 0) {
                sum += i;
                counter++;
            }i++;
        }
         average = (double)sum / counter;
        System.out.printf("There are %d number that are mulitple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of h%d in range 1 to 50 is %d. \n",multiple, sum);
        System.out.println("The average of multiple sum and counter is " + average);
    } 
}