import java.util.Scanner;


public class PasswordGenerator
{

    public static void main (String[] args){
        
        String password="";
        Scanner kbd = new Scanner(System.in);
        String source="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!?@$%&";
        
        System.out.print("Password lenght: ");
        int pwlength = kbd.nextInt();
        
        
        for(int i=0; i<pwlength;pwlength--){
            int r = (int) (1+Math.random()*66); 
            password += source.charAt(r);   
        }
        
        System.out.println(password);
    }    

}
