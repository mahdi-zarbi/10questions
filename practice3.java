import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression with brackets: ");
        String s = scanner.nextLine();
        scanner.close();
    
        int len;
        do {
            len = s.length();
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        } while (len != s.length());
    
        if (s.isEmpty()) {
             System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
        }
}
    

