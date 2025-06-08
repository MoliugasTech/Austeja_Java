package dBalsiaiPriebalsiai;

import java.util.Scanner;

public class BalsiaiMain{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Iveskite sakini: ");
        String sakinys = obj.nextLine();
        //String[] zodziai = sakinys.split(" ");

        int balsiuKiekis = 0;
        int priebalsiuKiekis = 0;


        // Eikvojame per kiekvieną simbolį sakinyje
        for (int i = 0; i < sakinys.length(); i++) {
            char raide = sakinys.charAt(i);
            
            // Tikriname ar simbolis yra raidė
            if (arRaide(raide)) {
                // Tikriname ar tai balsis
                if (arBalsis(raide)) {
                    balsiuKiekis++;
                } else {
                    // Jei raidė, bet ne balsis - tai priebalsis
                    priebalsiuKiekis++;
                }
            }
        }
        
        System.out.println("Balsių kiekis sakinyje: " + balsiuKiekis);
        System.out.println("Priebalsių kiekis sakinyje: " + priebalsiuKiekis);
        System.out.println("Iš viso raidžių: " + (balsiuKiekis + priebalsiuKiekis));
        
        obj.close();
    }
    
    // Funkcija tikrina ar simbolis yra balsis
    public static boolean arBalsis(char raide) {
        // Lietuviški balsiai (mažosios ir didžiosios raidės)
        char[] balsiai = {'a', 'ą', 'e', 'ę', 'ė', 'i', 'į', 'o', 'u', 'ų', 'ū', 'y',
                         'A', 'Ą', 'E', 'Ę', 'Ė', 'I', 'Į', 'O', 'U', 'Ų', 'Ū', 'Y'};
        
        for (int i = 0; i < balsiai.length; i++) {
            if (raide == balsiai[i]) {
                return true;
            }
        }
        return false;
    }
    
    // Funkcija tikrina ar simbolis yra raidė (lietuviška ar anglų kalbos)
    public static boolean arRaide(char simbolis) {
        // Praleidžiame tarpus, skyrybos ženklus ir kitus ne-raidės simbolius
        if (simbolis == ' ' || simbolis == ',' || simbolis == '.' || simbolis == '!' || 
            simbolis == '?' || simbolis == ';' || simbolis == ':' || simbolis == '-' ||
            simbolis == '\t' || simbolis == '\n') {
            return false;
        }
        
        // Tikriname anglų kalbos raides
        if ((simbolis >= 'a' && simbolis <= 'z') || (simbolis >= 'A' && simbolis <= 'Z')) {
            return true;
        }
        
        // Tikriname lietuviškas raides (papildomos)
        char[] lietuviskosPriebalsiai = {'č', 'š', 'ž', 'Č', 'Š', 'Ž'};
        char[] lietuviskiBalsiai = {'ą', 'ę', 'ė', 'į', 'ų', 'ū', 'Ą', 'Ę', 'Ė', 'Į', 'Ų', 'Ū'};
        
        // Tikriname lietuviškas priebalsės
        for (int i = 0; i < lietuviskosPriebalsiai.length; i++) {
            if (simbolis == lietuviskosPriebalsiai[i]) {
                return true;
            }
        }
        
        // Tikriname lietuviškas balsės
        for (int i = 0; i < lietuviskiBalsiai.length; i++) {
            if (simbolis == lietuviskiBalsiai[i]) {
                return true;
            }
        }
        
        return false;
    }
}
