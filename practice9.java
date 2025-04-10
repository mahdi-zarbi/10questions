import java.util.Scanner;

public class practice9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] kandid={"ali","mahdi","zahra","abas","maryam","bateleh"};
        int[] emtiaz={0,0,0,0,0,0};
        for(int i=0;i<25;i++){
            System.out.println(i+1+": kandid ra vared conid: ");
            String r=scan.nextLine();
            switch(r){
                case "ali":
                    emtiaz[0]+=1;
                    break;

                case "mahdi":
                    emtiaz[1]+=1;
                    break;

                case "zahra":
                    emtiaz[2]+=1;
                    break;

                case "abas":
                    emtiaz[3]+=1;
                    break;

                case "maryam":
                    emtiaz[4]+=1;
                    break;

                default:
                    emtiaz[5]+=1;
                    break;       
            }
        }
        for(int i=0;i<6;i++){
            System.out.println(kandid[i]+" = "+emtiaz[i]);
        }
        scan.close();
    }
}
