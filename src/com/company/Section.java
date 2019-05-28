package com.company;

public class Section {

    private char sectionNumber;

    private String tamilTeacher;
    private String englishTeacher;
    private String mathTeacher;
    private String scienceTeacher;
    private String socialScienceTeacher;
    private String gamesTeacher;


    Section(char mySectionNumber) {

        sectionNumber = mySectionNumber;




    }







    //GETTERS & Setters
    public char getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(char sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public String getTamilTeacher() {
        return tamilTeacher;
    }

    public void setTamilTeacher(String tamilTeacher) {
        this.tamilTeacher = tamilTeacher;
    }

    public String getEnglishTeacher() {
        return englishTeacher;
    }

    public void setEnglishTeacher(String englishTeacher) {
        this.englishTeacher = englishTeacher;
    }

    public String getMathTeacher() {
        return mathTeacher;
    }

    public void setMathTeacher(String mathTeacher) {
        this.mathTeacher = mathTeacher;
    }

    public String getScienceTeacher() {
        return scienceTeacher;
    }

    public void setScienceTeacher(String scienceTeacher) {
        this.scienceTeacher = scienceTeacher;
    }

    public String getSocialScienceTeacher() {
        return socialScienceTeacher;
    }

    public void setSocialScienceTeacher(String socialScienceTeacher) {
        this.socialScienceTeacher = socialScienceTeacher;
    }

    public String getGamesTeacher() {
        return gamesTeacher;
    }

    public void setGamesTeacher(String gamesTeacher) {
        this.gamesTeacher = gamesTeacher;
    }
}
