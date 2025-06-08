package cDubliai;
import java.util.Random;

public class DubliaiMain {
    public static void main(String[] args) {
        int[] skaiciai = new int[100];
        Random random = new Random();
        
        System.out.println("Skaiciu masyvas: ");
        for (int i = 0; i < skaiciai.length; i++) {
            skaiciai[i] = random.nextInt(1000) + 1; // Skaičiai nuo 1 iki 1000
            System.out.print(skaiciai[i] + " ");
            if ((i + 1) % 10 == 0) { // Po 10 skaičių nauja eilutė
                System.out.println();
            }
        }
        System.out.println();
        
        int[] dubliai = rastiDubliai(skaiciai);
        if (dubliai.length > 0) {
            System.out.println("Dubliai: ");
            for (int d : dubliai) {
                System.out.print(d + " ");
            }
            System.out.println();
        } else {
            System.out.println("Nera dubliu.");
        }
    }
    
    public static int[] rastiDubliai(int[] skaiciai) {
        boolean[] matytas = new boolean[1001]; // susikuriam tuscia masyva skaiciams sekti, nuo 0 iki 1000
        boolean[] dublikatas = new boolean[1001]; // pagal indeksus matysime koks skaicius dublikatas.
        int dubliuKiekis = 0;
        
        // žymime matytus skaičius
        for (int skaicius : skaiciai) {
            if (skaicius >= 1 && skaicius <= 1000) {
                if (matytas[skaicius]) {
                    // Jei jau matėme šį skaičių - tai dublikatas
                    if (!dublikatas[skaicius]) {
                        dublikatas[skaicius] = true;
                        dubliuKiekis++;
                    }
                } else {
                    matytas[skaicius] = true;
                }
            }
        }
        
        // surenkame dublius
        int[] dubliai = new int[dubliuKiekis]; //pagal dubliu kieki skiriam vietos
        int index = 0;
        for (int i = 1; i < dublikatas.length; i++) {
            if (dublikatas[i]) {
                dubliai[index++] = i; //i masyva sudedam duplikatu indeksus. nes indeksas = reiksme
            }
        }
        return dubliai;
    }
}