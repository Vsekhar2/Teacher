package com.company;
import java.util.ArrayList; // import the ArrayList class
import java.util.HashMap; // import the HashMap class

public class Main {

    //Stores Section and Teachers
    private static ArrayList<Section> mySections = new ArrayList<Section>(); // Create an ArrayList object
    private static ArrayList<Teacher> myTeachers = new ArrayList<Teacher>(); // Create an ArrayList object

    private static HashMap<Integer, Character> indexToSectionNumber = new HashMap<Integer, Character>();
    public static HashMap<String, Integer> subjectToIndex = new HashMap<String, Integer>();


    private static int NUMBER_OF_SECTIONS = 7;


    public static void main(String[] args) {

        //Initialization
        hashMapCreation();
        createTeachers();
        createSections();


        System.out.println("Available Sections: ");
        for (Section mySection :Validation.checkPossibileSections(mySections, myTeachers.get(0))) {

            System.out.println(mySection.getSectionNumber());


        }

        Validation.assignSection(mySections, myTeachers.get(0));
        System.out.println("Available Sections: ");
        for (Section mySection :Validation.checkPossibileSections(mySections, myTeachers.get(0))) {

            System.out.println(mySection.getSectionNumber());


        }







    }

    //Hashmap Creation
    public static void hashMapCreation() {


        subjectToIndex.put("Tamil", 0);
        subjectToIndex.put("English", 1);
        subjectToIndex.put("Math", 2);
        subjectToIndex.put("Science", 3);
        subjectToIndex.put("Social Science", 4);
        subjectToIndex.put("Games", 5);




        indexToSectionNumber.put(0,'a');
        indexToSectionNumber.put(1,'b');
        indexToSectionNumber.put(2,'c');
        indexToSectionNumber.put(3,'d');
        indexToSectionNumber.put(4,'e');
        indexToSectionNumber.put(5,'f');
        indexToSectionNumber.put(6,'g');



    }


    //Create Sections
    public static void createSections() {

        for (int j = 6; j <= 10; j++) {

            for (int i = 0; i < NUMBER_OF_SECTIONS; i++) {

                mySections.add(new Section(indexToSectionNumber.get(i), j));


            }


        }




    }

    public static void createTeachers() {

        Teacher paramesh = new Teacher("Paramesh", "Math", false, new int[] {10, 9});

        myTeachers.add(paramesh);


    }


    public static void updateSections(ArrayList<Section> possibleSections) {








    }






}
