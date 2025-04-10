import java.util.Scanner;
public class practice5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("plese enter number : ");
        String number=scan.nextLine();
        int length=number.length();
        int nimeh=length/2;
        int avali=0;
        int dowomi=0;
        for(int i=0;i<nimeh;i++){
            int adad=number.charAt(i)-'0';
            avali+=adad;
        }
        for(int j=length-1;j>=length-nimeh;j--){
            int adad=number.charAt(j)-'0';
            dowomi+=adad;
        }
        String result=(avali==dowomi)?"yes":"no";
        System.out.println("aya barabar ast? "+result);
        scan.close();
    }    
}
