
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class validasi {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    

    public static void main(String[] args) throws IOException {
        
        
        cekusername("Kamusiapa");
        cekemail("Kamusiapa@gmail.com");
        cekpassword("Kamusiapa2169");
    }
    
    static void cekusername(String user){
        String cek = user.toLowerCase();
        
        if (user.length() <= 6 && user.equals(cek)) {
            System.out.println("Valid");
            
        }else {
            System.out.println("Invalid");
        }
            
    }
    
    static void cekemail(String email){
        String cek = email.toLowerCase();
        boolean x = email.contains("@");
        
        if (email.equals(cek) && x == true) {
            System.out.println("Valid");
            
        }else {
            System.out.println("Invalid");
        }
        
    }
    
    static void cekpassword(String pass){
        
        boolean cek = pass.matches("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");

        
        if (cek) {
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
    
}
