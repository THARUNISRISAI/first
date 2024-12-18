import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial: ");
        int number = in.nextInt();
        System.out.println(factorial(number));

    }
    static int factorial(int number){
        if(number <= 1){
            return number;
        }
        int fact = number*factorial(number-1);
        return fact;
    }
}

