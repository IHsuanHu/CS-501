package project_5;
// I-Hsuan Hu
// cwid: 20010728
import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tla = "", entry;
        int stringLength;
        int i;
        int count = 0;
        int Max = 3;
        char c;
        System.out.print("Please enter three words: ");
        entry = input.nextLine();
        stringLength = entry.length();
        tla += Character.toUpperCase(entry.charAt(0));
        ++count;
        for (i = 1; i < stringLength; i++) {
            if(count < Max) {
                if(entry.charAt(i)== ' ') {
                    ++ i;
                    c = entry.charAt(i);
                    c = Character.toUpperCase(c);
                    tla += c;
                    ++count;
                }
            }
        }
        System.out.print("Original phrase was " + entry + "\nThree letter acronym is " + tla);;
    }
}