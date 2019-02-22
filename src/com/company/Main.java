package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare }

        // Phase one (Declare all the variable)


//                                                                  Platypus
// If you go to some (Adjective) place like The Grand Canyon National (Noun), you must know how to deal with wild animals such as cougars, platypus, and
// (Animal). The most important to watch out for is the platypus. There are three types of platypus, the duck-billed, the (adjective) platypus, and the
// (adjective) platypus. They spend most of their time (ing ending verb) or (ing ending verb). They look very (adjective), but if you make them (adjective),
// they might bite your (noun). Platypus will come up to your window and beg for (food). They will stand on two feet amd clap their (body part) together and
// pretend to be (adjective). But do not get out of your (vehicle) and offer them (food) or (food). This same advice applies to other wild creatures such as
// (something alive) and (something alive). Follow all these rules and you will spend your trip (adverb) and not get eaten by a (Noun).

        //Declare
//                                                                 Platypus
// Adjective: lazy
// Noun: mall
// Animal: snakes
// Adjective: angry
// Adjective: sad
// Verb ending in ing: sitting
// Verb ending in ing: dropping
// Adjective: tired
// Adjective: hurt
// Noun: Finger
// Food: fries
// Body part: legs
// Adjective: stupid
// Vehicle: Jeep
// Food: tacos
// Food: burgers
// Something alive: dogs
// Something alive: flowers
// Adverb: happily
// Noun: student

        Scanner keyboard;
        String adjective,adjective2, adjective3, adjective4, adjective5, adjective6;
        String noun, noun2, noun3;
        String animal;
        String verb, verb2;
        String food, food2, food3;
        String bodypart;
        String vehicle;
        String wildAnimal, wildAnimal2;
        String adverb;






        // Phase two
         keyboard =  new Scanner(System.in);

         System.out.println("Give an adjective");
         adjective = keyboard.nextLine();
         System.out.println("Give a place");
         noun = keyboard.nextLine();
         System.out.println("Give me an animal");
         animal = keyboard.nextLine();
         System.out.println("Give me an emotion");
         adjective2 = keyboard.nextLine();
         System.out.println("Give me one more");
         adjective3 = keyboard.nextLine();
         System.out.println("Give me a verb ending in ing");
         verb = keyboard.nextLine();
         System.out.println("Give me another one");
         verb2 = keyboard.nextLine();
         System.out.println("Give me an adjective");
         adjective4 = keyboard.nextLine();
         System.out.println("Give me one more please");
         adjective5 = keyboard.nextLine();
         System.out.println("Give me a noun");
         noun2 = keyboard.nextLine();
         System.out.println("What's your favorite food");
         food = keyboard.nextLine();
         System.out.println("Give me a bodypart");
         bodypart = keyboard.nextLine();
         System.out.println("Give me an adjective");
         adjective6 = keyboard.nextLine();
         System.out.println("name a vehicle");
         vehicle = keyboard.nextLine();
         System.out.println("Give me a food");
         food2 = keyboard.nextLine();
         System.out.println("Give me another food");
         food3 = keyboard.nextLine();
         System.out.println("Give me a wild animal");
         wildAnimal = keyboard.nextLine();
         System.out.println("Give me another animal");
         wildAnimal2 = keyboard.nextLine();
         System.out.println("Give me an adverb");
         adverb = keyboard.nextLine();
         System.out.println("Give me a noun");
         noun3 = keyboard.nextLine();







        // Phase three

        System.out.print(" If you go to some "+adjective+" place like the Grand Canyon National "+noun+",");
        System.out.println(" you must know how to deal with animals such as cougars, "+animal+", and snakes.");
        System.out.print(" The most important to watch out for is the platypus.");
        System.out.println(" There are three types of platypus: the duck billed, the "+adjective2+" platypus, and the "+adjective3+" platypus.");
        System.out.print(" They spend most of their time "+verb+" or "+verb2+". ");
        System.out.println(" They look very "+adjective4+", but if you make them "+adjective5+", they might bite your "+noun2+".");
        System.out.print(" Platypus will come up to your window and beg for "+food+".");
        System.out.println(" They will stand on two feet and clap their "+bodypart+" together and pretend to be "+adjective6+". ");
        System.out.print(" But do not get out of your "+vehicle+" and offer them "+food2+" or "+food3+".");
        System.out.println(" This same advice applies to other wild creatures such as "+wildAnimal+" and "+wildAnimal2+".");
        System.out.print(" Follow all these rules and you will spend your trip "+adverb+" and not get eaten by a "+noun3+".");



//                                                                  Platypus
// If you go to some lazy place like The Grand Canyon National mall, you must know how to deal with wild animals such as cougars, platypus, and
// snakes. The most important to watch out for is the platypus. There are three types of platypus, the duck-billed, the angry platypus, and the
// sad platypus. They spend most of their time sitting or dropping. They look very tired, but if you make them hurt,
// they might bite your finger. Platypus will come up to your window and beg for fries. They will stand on two feet amd clap their legs together and
// pretend to be stupid. But do not get out of your Jeep and offer them tacos or burgers. This same advice applies to other wild creatures such as
// dogs and flowers. Follow all these rules and you will spend your trip happily and not get eaten by a student.


    }
}