/*
 * Reading student records from a file, generating Student objects, counting and averaging
 * Suggested exercises:
 * - Use grade to determine the type of the student: excellent (> 89), ok [60,89], and failure (< 60)
 * - Define an enum type {excellent, ok, failure} and use it to print the student type
 * - Do counting and averaging within each student type (excellent, ok, and failure)
 * - Count students by using a static variable in class Student
 */
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Students {
    public static void main(String[] args) throws IOException {
        String first_name, last_name;
        int grade;
        int totalExcellent = 0, countExcellent = 0;
        int totalOk = 0, countOk = 0;
        int totalFailure = 0, countFailure = 0;
        double averageExcellent, averageOk, averageFailure;

        List<String> lines = Files.readAllLines(Paths.get("students.txt"));
        
        for (String line : lines) {
            Scanner sc = new Scanner(line);
            
            first_name = sc.next();
            last_name = sc.next();
            grade = sc.nextInt();

            Student st = new Student(first_name, last_name, grade);

            //System.out.println(st.lname);
            //print student name
            //explaination: when lname is set to private, they are only accessible within the declared class, while the user using students.java cannot access it via st.lname
            //but if lname and fname is set to public, code outside can easily access the class atributes
            //like in the example above, we can easily get the student first name by just running st.lname
            switch (st.status) {
                case Excellent:
                    totalExcellent += grade;
                    countExcellent++;
                    break;
                case Ok:
                    totalOk += grade;
                    countOk++;
                    break;
                case Failure:
                    totalFailure += grade;
                        countFailure++;
                    break;
            }
            System.out.println(st);
            sc.close();
        }

        if (countExcellent > 0)
            averageExcellent = (double) totalExcellent / countExcellent;
        else averageExcellent = 0;

        if (countOk > 0)
            averageOk = (double) totalOk / countOk;
        else averageOk = 0;

        if (countFailure > 0)
            averageFailure = (double) totalFailure / countFailure;
        else averageFailure = 0;

        System.out.println("There are " + countExcellent + " Excellent students with average grade " + averageExcellent);
        System.out.println("There are " + countOk + " Ok students with average grade " + averageOk);
        System.out.println("There are " + countFailure + " Failure students with average grade " + averageFailure);
    }
}
