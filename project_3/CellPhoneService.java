import java.util.Scanner;
//I-Hsuan Hu
//I pledge my honor that I have abided by the Stevens Honor System.
//Hu
public class CellPhoneService{
    public static void main (String args[]) {
    Scanner input = new Scanner(System.in);
    int talk;
    int texts;
    int data;
    final int TALK_MIN = 500;
    final int TEXTS_MIN = 100;
    final int DATA_MIN = 2;
    final int PRICEA = 49;
    final int PRICEB = 55;
    final int PRICEC = 61;
    final int PRICED = 70;
    final int PRICEE = 79;
    final int PRICEF = 87;
    String entry, message;
    int price;
    String plan;
    System.out.print("Enter talk minutes needed: ");
    entry = input.nextLine();
    talk = Integer.parseInt(entry);
    System.out.print("Enter text messages needed: ");
    entry = input.nextLine();
    texts = Integer.parseInt(entry);
    System.out.print("Enter gigabytes of data needed: ");
    entry = input.nextLine();
    data = Integer.parseInt(entry);
    if(data > 0) 
        if(data <= DATA_MIN) { 
            plan = "E";
            price = PRICEE;
        } else{ 
            plan = "F";
            price = PRICEF;
        } 
    else if(talk < TALK_MIN) 
            if(texts == 0 && data == 0) { 
                plan = "A";
                price = PRICEA; } 
            else { 
                plan = "B";
                price = PRICEB;
        } else if(texts < TEXTS_MIN){
            plan = "C";
            price = PRICEC;
        } else{
            plan = "D";
            price = PRICED ;
        }
message = "Plan " + plan + "  $" + price + " per month";
System.out.print(message);
}
}