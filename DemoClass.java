
package democlass;
import java.util.Scanner;
import java.lang.String;

public class DemoClass {

  

    
    public static void main(String[] args) {
        
      
         Scanner c= new Scanner(System.in);
         System.out.print("enter desired member");
        String desired_member=c.next();
        memeberFactory d =new memeberFactory();
        
        staff st = d.gitClasss(desired_member);
        System.out.print(st);
        
    }

   
    }
        
    
