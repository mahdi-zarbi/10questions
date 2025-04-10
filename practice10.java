import java.util.Scanner;

public class practice10 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String[] kandid={"ali","zahra","yasamin","mahdi","sama","bateleh"};
        int[] emtiaz={0,0,0,0,0,0};
        System.out.println("a.ali    z.zahra    y.yasamin    m.mahdi    s.sama");

        for(int i=0;i<2;i++){

            System.out.println(i+1+" : kandid ra vared conid: ");
            String r=scan.nextLine();
            String[] R=r.split(" ");

            for(int j=0;j<5;j++){

                String result=R[j];

                switch(result){
                    case "a":emtiaz[0]+=5-j;break;
                    case "z":emtiaz[1]+=5-j;break;
                    case "y":emtiaz[2]+=5-j;break;
                    case "m":emtiaz[3]+=5-j;break;
                    case "s":emtiaz[4]+=5-j;break;
                    case " ":emtiaz[5]+=1;break;
                    default:emtiaz[5]+=1;break;
                }
            }
        }
        for(int i=0;i<6;i++){
            System.out.println(kandid[i]+" = "+ emtiaz[i]);
        }
        scan.close();
    }
}
