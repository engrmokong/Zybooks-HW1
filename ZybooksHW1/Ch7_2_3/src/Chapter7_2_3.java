import java.util.*;
public class Chapter7_2_3 {


        public static void main(String[] args) {
            // write your code here

            int [] courseGrades = {7, 9, 11, 10};

            for (int i = 0; i < courseGrades.length; ++i) {
                System.out.print( courseGrades[i] + " ");

            }
            System.out.println();
            int elementZero = courseGrades[0];
            int elementOne = courseGrades[1];
            for (int y = 0; y < courseGrades.length-2; ++y) {
                courseGrades[y] = courseGrades[courseGrades.length - 1- y];
                System.out.print(courseGrades[y] + " ");

            }
            System.out.println(elementOne + " "+ elementZero + " ");


        }
    }

