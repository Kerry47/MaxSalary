package org.com.pluralsight;
import java.util.Scanner;
public class FullNameApplication {

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String firstName = getStringInput(scanner,  "Enter your first name: ");
            String middleName = getStringInput(scanner, "Enter your middle name: ");
            String lastName = getStringInput(scanner, "Enter your last name: ");
            String suffix = getStringInput(scanner, "Enter your suffix: ");

            middleName = (middleName.length() == 1)? (middleName + "."):middleName;

            if(!suffix.isBlank()){
                System.out.println( firstLetterCapital(firstName) + " " + firstLetterCapital(middleName) + " " +
                        firstLetterCapital(lastName) + " " + firstLetterCapital(suffix));
            }else{
                System.out.println(firstLetterCapital(firstName) + " " + firstLetterCapital(middleName) + " " +
                        firstLetterCapital(lastName));
            }
        }
    public static String getStringInput(Scanner scanner, String prompt){
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }
    public static String firstLetterCapital(String name){
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
}
