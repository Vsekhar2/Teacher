package com.company;

public class Teacher {

    //Instance Variables
    private String name;
    private String subject;

    private boolean classRoomTeacher;
    private int[] teachableGrades;



    private final int MINIMUM_PERIODS_PER_WEEK = 7;
    private final int MINIMUM_NUMBER_OF_SECTIONS = 4;

    /*

        Tamil  = 0
        English = 1
        Math = 3
        Science = 4
        Social Science = 5
        Games = 6


  */


    //Constructor
    Teacher(String myName, String mySubject, boolean isClassRoomTeacher, int[] myTeachableGrades) {

        name = myName;
        subject = mySubject;
        classRoomTeacher = isClassRoomTeacher;
        teachableGrades = myTeachableGrades;


    }



    public void printValues() {

        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Is ClassRoom Teacher? " + classRoomTeacher);

        System.out.print("Teachable Classes: ");


        for (int i = 0; i < teachableGrades.length; i++) {

            System.out.print(teachableGrades[i] + " ");


        }

    }


    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public boolean isClassRoomTeacher() {
        return classRoomTeacher;
    }

    public int[] getTeachableGrades() {
        return teachableGrades;
    }



}
