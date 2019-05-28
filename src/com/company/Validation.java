package com.company;
import java.util.HashMap; // import the HashMap class
import java.util.ArrayList;

public class Validation {




    //Assign A Section to the teacher
    public static void assignSection(ArrayList<Section> sections, Teacher myTeacher) {

        ArrayList<Section> availableSections = new ArrayList<>();

        //sections in available Grade:
        for (Section currentSection: sections) {

            for (int i = 0; i < myTeacher.getTeachableGrades().length; i++) {

                if (currentSection.getGrade() == myTeacher.getTeachableGrades()[i]) {

                    availableSections.add(currentSection);
                }

            }


        }

        //Loop Through Each Section and Add the Available Sections
        for (Section currentSection: availableSections) {


            if (currentSection.sectionTeachers.get(Main.subjectToIndex.get(myTeacher.getSubject())) == "") {

                currentSection.sectionTeachers.set(Main.subjectToIndex.get(myTeacher.getSubject()), myTeacher.getName());
                return;

            }

        }

    }


    //Check Possible Sections for a Teacher
    public static ArrayList<Section> checkPossibileSections(ArrayList<Section> sections, Teacher myTeacher) {

        ArrayList<Section> availableSections = new ArrayList<>();

        //sections in available Grade:
        for (Section currentSection: sections) {

            for (int i = 0; i < myTeacher.getTeachableGrades().length; i++) {

                if (currentSection.getGrade() == myTeacher.getTeachableGrades()[i] && currentSection.sectionTeachers.get(Main.subjectToIndex.get(myTeacher.getSubject())) == "") {

                    availableSections.add(currentSection);
                }

            }


        }


        return availableSections;


    }
}
