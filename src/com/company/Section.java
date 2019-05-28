package com.company;
import java.util.ArrayList;
import java.util.HashMap;


public class Section {

    public ArrayList<String> sectionTeachers = new ArrayList<>();



    private char sectionNumber;



    /*

    Tamil  = 0
    English = 1
    Math = 3
    Science = 4
    Social Science = 5
    Games = 6




  */

  // public String[] subjects = {tamilTeacher, englishTeacher, mathTeacher, scienceTeacher, socialScienceTeacher, gamesTeacher};


    Section(char mySectionNumber) {

        sectionNumber = mySectionNumber;

        for (int i = 0; i < 7; i++) {

           sectionTeachers.add(i, "");




        }

    }



    //GETTERS & Setters



    //SECTION NUMBER
    public char getSectionNumber() {

        return sectionNumber;
    }

    public void setSectionNumber(char sectionNumber) {
        this.sectionNumber = sectionNumber;
    }



    //TAMIL TEACHER
    public String getTamilTeacher() {

        return sectionTeachers.get(0);
    }

    public void setTamilTeacher(String tamilTeacher) {
        sectionTeachers.set(0, tamilTeacher);
    }



    //ENGLISH TEACHER
    public String getEnglishTeacher() {
        return sectionTeachers.get(1);
    }

    public void setEnglishTeacher(String englishTeacher) {
        sectionTeachers.set(1, englishTeacher);
    }

    //MATH TEACHER
    public String getMathTeacher() {
        return sectionTeachers.get(2);
    }

    public void setMathTeacher(String mathTeacher) {
        sectionTeachers.set(2, mathTeacher);
    }

    //SCIENCE TEACHER
    public String getScienceTeacher() {
        return sectionTeachers.get(3);
    }

    public void setScienceTeacher(String scienceTeacher) {

        sectionTeachers.set(3, scienceTeacher);
    }


    //SOCIAL SCIENCE TEACHER
    public String getSocialScienceTeacher() {

        return sectionTeachers.get(4);
    }

    public void setSocialScienceTeacher(String socialScienceTeacher) {
        sectionTeachers.set(4, socialScienceTeacher);
    }

    //GAMES TEACHER
    public String getGamesTeacher() {

        return sectionTeachers.get(5);
    }

    public void setGamesTeacher(String gamesTeacher) {

        sectionTeachers.set(5, gamesTeacher);
    }
}
