// Biil Ruben
// p. 112 Exercise 5
import java.util.Scanner;
public class BookstoreCredit
{
 public static void main(String[] args)
 {
  double gpa;
  String studentName;
  Scanner keyboard = new Scanner(System.in);
  System.out.print("Enter the student's name >> ");
  studentName = keyboard.nextLine();
  System.out.print("Enter the student's gpa >> ");
  gpa = keyboard.nextDouble();
  computeCredit(gpa, studentName);
 }
 public static void computeCredit(double avg, String stName)
 {
  double credit;
  credit = avg * 10;
  System.out.println("Hermosa High School Student: " + stName + " will receive a $" + credit + " credit " + "with a " + avg + " gpa." );
 }
}