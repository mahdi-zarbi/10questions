import java.util.Scanner;

public class practice03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression with brackets: ");
        String expression = scanner.nextLine();
        scanner.close();

        int countParen = 0;
        int countBrace = 0;
        int countBracket = 0;
        boolean balanced = true; // Assume balanced initially

        for (char c : expression.toCharArray()) {
            switch (c) {
                case '(':
                    countParen++;
                    break;
                case ')':
                    countParen--;
                    if (countParen < 0) {
                        balanced = false;
                        break; // Exit the loop early
                    }
                    break;
                case '{':
                    countBrace++;
                    break;
                case '}':
                    countBrace--;
                    if (countBrace < 0) {
                        balanced = false;
                        break; // Exit the loop early
                    }
                    break;
                case '[':
                    countBracket++;
                    break;
                case ']':
                    countBracket--;
                    if (countBracket < 0) {
                        balanced = false;
                        break; // Exit the loop early
                    }
                    break;
            }
            if (!balanced) {
                break; // No need to continue if already unbalanced
            }
        }

        if (balanced && countParen == 0 && countBrace == 0 && countBracket == 0) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
    }
}
    

