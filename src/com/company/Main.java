package com.company;
import java.util.ArrayList; // import the ArrayList class
import java.util.HashMap; // import the HashMap class

public class Main {

    //Stores Section and Teachers
    private ArrayList<Section> mySections = new ArrayList<Section>(); // Create an ArrayList object
    private ArrayList<Teacher> myTeachers = new ArrayList<Teacher>(); // Create an ArrayList object

    private HashMap<Integer, Character> indexToSectionNumber = new HashMap<Integer, Character>();

    private int NUMBER_OF_SECTIONS = 7;


    public static void main(String[] args) {











    }

    //Hashmap Creation
    public void hashMapCreation() {

        indexToSectionNumber.put(0,'a');
        indexToSectionNumber.put(1,'b');
        indexToSectionNumber.put(2,'c');
        indexToSectionNumber.put(3,'d');
        indexToSectionNumber.put(4,'e');
        indexToSectionNumber.put(5,'f');
        indexToSectionNumber.put(6,'g');



    }


    //Create Sections
    public void createSections() {

        for (int i = 0; i < NUMBER_OF_SECTIONS; i++) {

            mySections.add(new Section(indexToSectionNumber.get(i)));


        }



    }

    public void createTeachers() {

        Teacher paramesh = new Teacher("Paramesh", "Math", false, new int[] {10, 9});

        myTeachers.add(paramesh);


    }


    //Core Computing






}
