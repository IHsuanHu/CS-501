//pledge my honor that I have abided by the Stevens Honor System.
//I-Hsuan Hu
import java.util.Scanner;
public class TestGrade{
public static void main(String args[]) throws Exception{
    Scanner input = new Scanner(System.in);
    int[] id = {1234, 1245, 1267, 1278, 2345, 1256, 3456, 3478, 4567, 5678};
    char[] grade = new char[10];
    String gradeString = new String();
    final int HIGHLIMIT = 100;
    String inString, outString = "";
    int flag = 0;
    for(int x = 0; x < id.length; ++x){
        System.out.print("Enter letter grade for student id number: " + id[x] + "\n");
        inString = input.nextLine();
        grade[x] = inString.charAt(0);
    try{
        flag = 0;
        for(int y = 0; y < GradeException.VALID_GRADES.length; ++y){
        if(grade[x] == GradeException.VALID_GRADES[y])
            flag = 1;
        }
        if(flag == 0){
            gradeString = "Invalid grade";
            throw(new GradeException(gradeString));
        }
    }
    catch(GradeException e){
        System.out.print(e.getMessage());
        grade[x] = 'I';
        }
    }
    for(int x = 0; x < id.length; ++x)
        outString = outString + "ID #" + id[x] + " Grade " +grade[x] + "\n";
        System.out.print(outString);
        }
    }
