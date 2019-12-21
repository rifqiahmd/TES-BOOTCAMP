
public class prima {

    public static void main(String[] args) {
        
        bilangan(4,3);
        
    }
    
    static void bilangan(int col, int row){
        int jml_prima = row * col;
        
        int hit = 0;
        int angka = 2;
        
        while (hit < jml_prima){
            boolean prima = true;
            
            for(int i = 2; i <= angka/2; i++){
                
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
            }
            
            if (prima) {
                hit++;
                
                if (hit % col == 0) {
                    System.out.println(angka);
                } else {
                    System.out.print(angka + " ");
                }
            }
             angka++;
            
        }
            
        
        
    }
    
}
