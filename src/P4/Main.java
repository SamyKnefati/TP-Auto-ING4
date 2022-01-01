package P4;

import lejos.hardware.lcd.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception{
        long startTime = System.nanoTime();
        /*try{
            LCD.drawString("nbvcrbv", 1,1);


        } catch (ExceptionInInitializerError e) {

        }*/

        long elapsedNanos = System.nanoTime() - startTime;


        String chaineScreen = "Affichage de la chaine sur ecran";

        /*try {
            ;
            BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"));
            writer.write(chaineScreen);

            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }*/
        File outFile = new File("src/P4/text.txt");



        FileWriter fileWriter = new FileWriter(outFile);



        fileWriter.write( chaineScreen);

        fileWriter.close();

        System.out.println(elapsedNanos);

    }
}

