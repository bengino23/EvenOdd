import java.util.Scanner;

class EvenOdd {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        input.close();
    }
}