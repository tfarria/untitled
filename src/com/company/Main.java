package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Corporation aCorporation;

        JobTitle aJobTitle;

        boolean stopCorporation = false;
        String answerCorporation= " ";

        boolean stopJobTitle = false;
        String answerJobTitle = "";

        Scanner keyboard = new Scanner(System.in);

        ArrayList<Corporation> corpList = new ArrayList<>();




        do {


            System.out.println("Corporation Name : ");
            aCorporation = new Corporation(keyboard.nextLine());

            System.out.println("Your Corporation Name is : "+" "+ aCorporation.getOfficialName());

            corpList.add(aCorporation);





                           do {


                                aJobTitle = new JobTitle();

                                System.out.println("Enter Job Title : ");
                                aJobTitle.setTitle(keyboard.nextLine());

                                System.out.println("Enter Job Number : ");
                                aJobTitle.setJobNumber(keyboard.nextLine());


                                System.out.println("Job Details : " + " " + aJobTitle.getTitle() + " " + aJobTitle.getJobNumber());

                               aCorporation.addJobTitle(aJobTitle);

                                System.out.println("Want to Enter Another Job Title");
                                answerJobTitle = keyboard.nextLine();

                                if (answerJobTitle.equalsIgnoreCase("N") || answerJobTitle.equalsIgnoreCase("No"))

                                    stopJobTitle = true;




                            }while (!stopJobTitle);

                           corpList.add(aCorporation);

            System.out.println("Want to Enter Another Corporation ?");
            answerCorporation = keyboard.nextLine();

            if (answerCorporation.equalsIgnoreCase("N")  || answerCorporation.equalsIgnoreCase("No")) {
                stopCorporation = true;
            }

        }while (!stopCorporation);

    }
}
