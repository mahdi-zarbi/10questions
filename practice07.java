import java.util.Scanner;

public class practice7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("meghdar arrayeh ra vared conid : ");
        int meghdar=scan.nextInt();
        int[] aval=new int[meghdar];
        int[] dowom=new int[meghdar];
        int result=0;
        
        for(int i=0;i<meghdar;i++){
            System.out.println("vared conid1: ");
            aval[i]=scan.nextInt();
        }
        for(int i=0;i<meghdar;i++){
            System.out.println("vared conid2: ");
            dowom[i]=scan.nextInt();
        }
        for(int i=0;i<meghdar;i++){
            for(int j=0;j<meghdar;j++){
                if(aval[i]==dowom[j]){
                    dowom[j]=-1;
                    result+=1;
                    break;
                }
            }
        }
        if(result==meghdar){
            System.out.println("ok");
        }else{
            System.out.println("no");
        }
        scan.close();
    }
}
