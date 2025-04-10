import java.util.Arrays;
import java.util.Scanner;

public class practice8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("andazeh arayeh ra vared conid: ");
        int andazeh=scan.nextInt();
        int[] arr=new int[andazeh];
        int check;
        int sum;

        for(int i=0;i<andazeh;i++){
            System.out.print("vared conide: ");
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        
        for(int i=0;i<andazeh;i++){
            sum=1;
            check=arr[i];
            for(int j=i+1;j<andazeh;j++){
                if(check==arr[j]){
                    sum+=1;
                    i+=1;
                    
                }    
            }
            System.out.println("adad "+arr[i]+" ="+sum);
        }
    }
}
