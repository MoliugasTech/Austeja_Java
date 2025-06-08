package ApverstasZodis;
import java.util.Scanner; 

public class ReverseMain {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Iveskite zodi"); //teksto ivedimas i console
        
        String zodis = obj.nextLine();
        String reverse = ""; //sukuriamas tuscias stringas reversui
        for (int i=0; i<zodis.length(); i++)
        {
            reverse = zodis.charAt(i) + reverse; //uzpildome reverse stringa
        }
        System.out.println("Apverstas zodis " + reverse);
        obj.close();
    }
}