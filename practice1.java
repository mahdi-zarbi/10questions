import java.util.Scanner;

public class practice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number1: ");
        String number1 = scan.nextLine();

        System.out.println("Please enter number2: ");
        String number2 = scan.nextLine();

        StringBuilder result = new StringBuilder();
        int carry = 0;
        int maxLength = Math.max(number1.length(), number2.length());

        for (int i = 0; i < maxLength; i++) {
            int digit1 = (number1.length() - 1 - i >= 0) ? number1.charAt(number1.length() - 1 - i) - '0' : 0;
            int digit2 = (number2.length() - 1 - i >= 0) ? number2.charAt(number2.length() - 1 - i) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.insert(0, sum % 10); // Insert at the beginning
            carry = sum / 10;
        }

        if (carry != 0) {
            result.insert(0, carry); // Insert leading carry
        }

        System.out.println("Sum: " + result.toString());
        scan.close();
    }
}