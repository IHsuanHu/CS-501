package project_8;
//“I pledge my honor that I have abided by the Stevens Honor System.”
//I-Hsuan Hu
import java.util.Scanner;
public class MorgansBonuses {
public static void main(String[] args) {
    double[][] bonuses = {{5,9,16,22,30},
{10,12,18,24,36},
{20,25,32,42,53},
{32,38,45,55,68},
{46,54,65,77,90},
{60,72,84,96,120},
{85,100,120,140,175}
};
Scanner keyboard = new Scanner(System.in);
final int Quit = 99;
int weeks;
int reviews;
int x,y;
System.out.print("Enter number of full weeks worked or " + Quit + " to quit>> ");
System.out.print("Enter number of positive reviews received>>");
weeks = keyboard.nextInt();
reviews = keyboard.nextInt();
if(weeks >= bonuses.length)
    weeks = bonuses.length-1;
if(reviews >= bonuses[0].length)
    reviews = bonuses[0].length-1;
System.out.print("Bonus for " + weeks + " weeks and" + reviews + " positive reviews is " + bonuses[weeks][reviews]);
}}