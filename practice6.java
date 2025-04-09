import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("meghdar arayeh ra vared konid: ");
        int meghdar=scan.nextInt();
        int[]arr=new int[meghdar];
        int a=-1;
        int b=-1;
        for(int i=0;i<meghdar;i++){
            System.out.println("vared konid: ");
            arr[i]=scan.nextInt();
        } 
        System.out.println("meghdar aval ra vared conid: ");
        int aval=scan.nextInt();
        System.out.println("meghdar dowom ra vared conid: ");
        int dowom=scan.nextInt();
        for(int j=0;j<meghdar;j++){
            if(arr[j]==aval){
                a=j;
                break;
            }
        }
        for(int j=0;j<meghdar;j++){
            if(arr[j]==dowom){
                b=j;
                break;
            }
        }
        if(a!=-1&&b!=-1){
            System.out.println(b-a);
        }else{
            System.out.println("vojood nadarad .");
        }
        
        scan.close();
        
    }
}
