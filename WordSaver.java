//where I left off
//Need to make it not rewrite the words.txt file or make it continue on in it
//need to make it do something with the number like add them to be the propper amount of syllables

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class WordSaver{
    static int syllables = 0;
    // Asks for word and asks for number of syllabes
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // Saves to a word file called words.txt
        try{
            FileWriter myWriter = new FileWriter("words.txt");
            System.out.println("Enter the word");
            String line = scan.nextLine();
            System.out.println("Enter the Number of Syllables");
            int syl = scan.nextInt();
            while(!line.equals("")){
            myWriter.write(line + syl + "\n");
            line = scan.nextLine();
            }
        

        myWriter.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        scan.close();
}

}
