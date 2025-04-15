package com.ps;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in); //Declare scanner class scope
    static String userFirstName = "";
    static String userMiddleName = "";
    static String userLastName = "";


    public static void main(String[] args) {
        //call out the name generator
        nameGenerator();

    }

    public static void  nameGenerator(){
        //ask user for the first name input
        System.out.print("Please enter your first name: ");
        String firstName = scanner.nextLine(); //scan all the string till user press enter
        //change the first character of the string to upper case and the rest to lower
        String newFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        userFirstName = newFirstName;

        //ask user's middle name
        System.out.print("Please enter your middle name: ");
        String middleName = scanner.nextLine(); //scan all the string till user press enter

        //check did user just press enter?
        if (middleName.equals("")){
            userMiddleName = "";
        }
        else{
            //change the first character of the string to upper case and the rest to lower
            String newmiddleName = middleName.substring(0, 1) + middleName.substring(1).toLowerCase();
            userMiddleName = newmiddleName.toUpperCase();
            }

        //ask user for the last name input
        System.out.print("Please enter your last name: "); //ask user's third name
        String lastName = scanner.nextLine(); //scan all the string till user press enter
        //change the first character of the string to upper case and the rest to lower
        String newLastName = lastName.substring(0, 1) + lastName.substring(1).toLowerCase();
        userLastName = newLastName.toUpperCase();

        //generate full name
        String fullName = userFirstName + " " + userMiddleName + " " + userLastName;

        System.out.print(fullName); // print out fullname

    }
}