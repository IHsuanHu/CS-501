import java.io.*;
import java.util.Scanner;
import java.nio.file.*;
import java.nio.channels.FileChannel;
import static java.nio.file.StandardOpenOption.*;
//“I pledge my honor that I have abided by the Stevens Honor System.”
//I-Hsuan Hu  cwid: 20010728
public class StudentsStanding {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Path goodFile = Paths.get("StudentsGoodStanding.txt");
        Path probFile = Paths.get("StudentsAcademicProbation.txt");
        String s = "";
        String delimiter = ",";
        String stringId;
        String firstName;
        String lastName;
        double gpa;
        final String QUIT = "ZZZ";
        final double CUTOFF = 2.0;
        try {
            OutputStream goodStream = new BufferedOutputStream(Files.newOutputStream(goodFile, CREATE));
            BufferedWriter goodWriter = new BufferedWriter(new OutputStreamWriter(goodStream));
            OutputStream probStream = new BufferedOutputStream(Files.newOutputStream(probFile, CREATE));
            BufferedWriter probWriter = new BufferedWriter(new OutputStreamWriter(probStream));
            System.out.print("Enter student ID >> ");
            stringId = kb.nextLine();
            while(!stringId.equals(QUIT)){
                System.out.print("Enter firstName >> ");
                firstName = kb.nextLine();
                System.out.print("Enter last name >> ");
                lastName = kb.nextLine();
                System.out.print("Enter grade point average >> ");
                gpa = kb.nextDouble();
                kb.nextLine();
                s = stringId + delimiter + firstName + delimiter + lastName + delimiter + gpa + System.getProperty("line.seoarator");
                if(gpa < CUTOFF)
                probWriter.write(s, 0, s.length());
                else
                goodWriter.write(s, 0, s.length());
                System.out.print("Enter next student ID or " + QUIT + " to quit>> ");
                stringId = kb.nextLine();
            }
            probWriter.close();
            goodWriter.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Message: "+ e);
        }
    }
}
