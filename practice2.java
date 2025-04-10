
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your phrase: ");
        String result="";
        String word=scan.nextLine();
        
        for(int i=0;i<word.length();i++){
            char w=word.charAt(i);
            if (result.indexOf(String.valueOf(w)) == -1){
                result+=w;
            }
        }
        System.out.println(result);
        scan.close();
    }
    
}
