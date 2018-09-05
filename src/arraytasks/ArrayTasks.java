package arraytasks;

import java.util.Arrays;


public class ArrayTasks {

    public static int gradesArraySize = 5;
    
    
    public static void main(String[] args) {
        char[] studentGrades = {'A', 'B', 'D', 'F'};
        
        // display all values of 'array'
        for (char element: studentGrades) {
            System.out.println("Original grades: " + element);
        }
        
        // establishing the size of the new array
        char[] newStudentGrades = new char[gradesArraySize];
        
        // copying the first 2 elements to the new array
        System.arraycopy(studentGrades, 0, newStudentGrades, 0, 2);
        // adding the new grade
        newStudentGrades[2] = 'C';
        // copy remaining elements to new array
        System.arraycopy(studentGrades, 2, newStudentGrades, 3, 2);
        
        // display new combined array
        for (char element: newStudentGrades) {
            System.out.println("New grades: " + element);
        }
    }
    
}
