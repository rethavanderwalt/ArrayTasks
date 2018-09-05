package arraytasks;

import java.util.Arrays;


public class ArrayTasks {

    public static int gradesArraySize = 5;
     // TASK 2 //
    public static int subjectArraySize = 3;
    public static int newSubjectArraySize = 5;
    
    public static void main(String[] args) {
        char[] studentGrades = {'A', 'B', 'D', 'F'};
        String[] studentSubjects = {"Maths", "PE", "Music"};
        
        
         // TASK 1 //
        // display all values of studentGrades
        System.out.println("Original grades: ");
        for (int i = 0; i< studentGrades.length; i++) {
            System.out.println(studentGrades[i]);
        }
        System.out.print("\n");

        
        // establishing the size of the new array
        char[] newStudentGrades = new char[gradesArraySize];
        
        // copying the first 2 elements to the new array
        System.arraycopy(studentGrades, 0, newStudentGrades, 0, 2);
        // adding the new grade
        newStudentGrades[2] = 'C';
        // copy remaining elements to new array
        System.arraycopy(studentGrades, 2, newStudentGrades, 3, 2);
        
        // display new combined array
        System.out.println("New grades: ");
        for (int i = 0; i< newStudentGrades.length; i++) {
            System.out.println(newStudentGrades[i]);
        }
        System.out.print("\n");

        
         // TASK 2 //
        // show student subjects
        System.out.println("Student subjects: ");
        for (int i = 0; i< studentSubjects.length; i++) {
            System.out.println(studentSubjects[i]);
        }
        System.out.print("\n");

        // show second item of studentSubjects
        System.out.println("Second subject is: " + studentSubjects[1] + "\n");
        
        // adding new array for new subjects
        String[] newStudentSubjects = new String[newSubjectArraySize];
        System.arraycopy(studentSubjects, 0, newStudentSubjects, 0, 3);
        newStudentSubjects[3] = "Food tech";
        newStudentSubjects[4] = "Social studies";
        
        // display new student subjects array
       System.out.println("New student subjects: ");
        for (int i = 0; i< newStudentSubjects.length; i++) {
            System.out.println(newStudentSubjects[i]);
        }

    }    
}
