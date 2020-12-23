package floatingnosconversion;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public class FloatingnosConversion {
    
    
    public static float randFloat(float min, float max) {
    
    Random rand = new Random();

    return rand.nextFloat() * (max - min) + min;

}
   
    public static void main(String[] args) {
        System.out.println(String.format("%-10s %-15s %-5s %-15s %-17s %-15s %-10s", "S/No.", "|", "DecimalNo.", "|", "Binary No.","|", "Remarks."));
        //Iterate the loop for 5 times
        for(int i=0; i < 30; i++)
        {
            // Generate random number
            double randnum = Math.random();
            float d= randFloat(10f,100f);
            d= BigDecimal.valueOf(d).setScale(3, BigDecimal.ROUND_HALF_DOWN).floatValue();
           
             System.out.print(String.format("%-10s %-15s %-10s %-15s",(i+1),"|",d, "|"));
           
            
             double fractionalPart= 0,number;
             int rem=0,integralPart,k=5;
              String Remarks="Approximate";
             StringBuilder s=new StringBuilder();
             
             int n=(int) d;
    fractionalPart=d-n;
   while(n!=0) {
      rem=n%2;
      n=n/2;
      s.insert(0,rem);
   }
    System.out.print(String.format("%10s %-1s", s,"."));
    s=new StringBuilder();
    while(k!=0) {
       
      integralPart=(int) (fractionalPart*2);
      s.append(integralPart);
      number=fractionalPart*2;
      fractionalPart=number-integralPart;
      k--;
        
       if(fractionalPart==0){
           
           Remarks="Exactly";
           k=0;
       }
      
    }
     
      
    System.out.print(s+"\t"+"|"+"\t"+"\t"); 
     System.out.println(Remarks); 
    
        }
    }
}
