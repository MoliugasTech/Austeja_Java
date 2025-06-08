package BMinMax;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        int[] skaiciai = new int[100];
        Random random = new Random();

        // Generuojame atsitiktinius skaicius nuo 1 iki 1000
        System.out.println("Skaiciu masyvas: ");
        for (int i=0; i<skaiciai.length; i++)
        {
            skaiciai[i]=random.nextInt(1000)+ 1;
            System.out.print(skaiciai[i] + " ");
        }
        System.out.println();
        System.out.println("Masyvo ilgis: " + skaiciai.length);
        
        int min = MaziausiasSkaicius(skaiciai);
        int max = DidziausiasSkaicius(skaiciai);
        
        System.out.println("Maziausias " + min);
        System.out.println("Didziausias " + max);
       
    }


public static int MaziausiasSkaicius (int[] skaiciai)
{
    int min = skaiciai[0];
    for (int naujas : skaiciai) //nes nereikia rasti maziausio skaiciaus pozicijos , o tik pati maziausia skaiciu
    {
        if (min > naujas)
        {
            min = naujas;
        }
    }
    return min;
}

public static int DidziausiasSkaicius (int[] skaiciai)
{
    int max = skaiciai[0];
    for (int naujas : skaiciai)
    {
        if (max < naujas)
        {
            max=naujas;
        }
    }
    return max;
}
}