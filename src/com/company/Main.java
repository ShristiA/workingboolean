package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String userResponse = "y";

        ArrayList<Person>personList = new ArrayList<>();


        while(userResponse.equalsIgnoreCase("Y")) {
            System.out.println("enter name");
            String Username = sc.next();
            System.out.println("Does this person like French fries (true or false)");
            boolean UserFriesLikes = sc.nextBoolean();
            System.out.println("Does this person like to sleep (true or false)");
            boolean userSleep = sc.nextBoolean();
            System.out.println("Is this person adventurous (true or false");
            boolean userAdvent = sc.nextBoolean();

            personList.add(new Person(Username,UserFriesLikes,userSleep,userAdvent));

            System.out.println("Would you like to enter another?");
            userResponse = sc.next();
        }

        for(Person personType : personList){
            System.out.println("enter name "+ personType.getName());
            System.out.println("Does this person like French fries (true or false)"+ personType.isFrenchfries() );
            System.out.println("Does this person like to sleep (true or false)"+ personType.isSleeping());
            System.out.println("Is this person adventurous (true or false)"+ personType.isAdventurous());
            System.out.println("\n");

            }
        for(Person personType : personList) {
            if (personType.isFrenchfries() == true) {
                System.out.println(personType.getName());
            }
        }

    }
}
