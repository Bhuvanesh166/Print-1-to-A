import java.util.Scanner;

class Print {
    public static void printNumber(int number, int i) {
        if (number >= i) {
            System.out.print(i + " ");
            printNumber(number, i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();
        printNumber(number, 1);
        System.out.println();
    }


}