import java.util.Random;

public class practice4 {
    public static void main(String[] args) {
        Random ramdomnumber=new Random();
        int posht=0;
        int roo=0;
        
        for(int i=0;i<1000;i++){
            boolean number=ramdomnumber.nextBoolean();
            if(number==false){
                posht+=1;
            }
            else{
                roo+=1;
            }
        } 
        float d1=(float)posht/10; 
        float d2=(float)roo/10; 
           
        System.out.println("posht : "+posht +" bar  "+"%"+d1);
        System.out.println("ro : "+roo+" bar  "+"%"+d2);
        
    }
}
