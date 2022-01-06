package task_1;

import task_1.vector.three_dimensional.Vector3D;
import task_1.vector.two_dimensional.Vector2D;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the desired size of the arrays:");
        int N = sc.nextInt();

        Vector2D[] arrOfVectors2D = Vector2D.arrayOfRandomVectors2D(N);
        Vector3D[] arrOfVectors3D = Vector3D.arrayOfRandomVectors3D(N);

        System.out.println("Arrays of vectors are created:");
        for (int i = 0; i < arrOfVectors2D.length; ++i) {
            System.out.println("Vector 2D " + (i + 1) + ": " + arrOfVectors2D[i].toString());
        }
        for (int i = 0; i < arrOfVectors2D.length; ++i) {
            System.out.println("Vector 3D " + (i + 1) + ": " + arrOfVectors3D[i].toString());
        }

        System.out.println("Compare two vectors by entering their numbers separated by a space");

        System.out.println("For a 2D array:");
        int a = sc.nextInt(), b = sc.nextInt();

        if (arrOfVectors2D[a - 1].equals(arrOfVectors2D[b - 1])) {
            System.out.println("Vectors are equal.");
        } else {
            System.out.println("Vectors are not equal.");
        }

        System.out.println("For a 3D array:");
        a = sc.nextInt(); b = sc.nextInt();

        if (arrOfVectors2D[a - 1].equals(arrOfVectors2D[b - 1])) {
            System.out.println("Vectors are equal.");
        } else {
            System.out.println("Vectors are not equal.");
        }

        System.out.println("Calculate the length of the vector by entering its number:");

        System.out.println("For a 2D array:");
        N = sc.nextInt();
        System.out.println("The length of the vector is " + arrOfVectors2D[N - 1].vectorLength());

        System.out.println("For a 3D array:");
        N = sc.nextInt();
        System.out.println("The length of the vector is " + arrOfVectors3D[N - 1].vectorLength());

        System.out.println("Calculate the dot product of two vectors by entering their numbers separated by a space:");

        System.out.println("For a 2D array:");
        a = sc.nextInt(); b = sc.nextInt();
        System.out.println("The scalar product of two vectors is " + arrOfVectors2D[a - 1].scalarProduct(arrOfVectors2D[b - 1]));

        System.out.println("For a 3D array:");
        a = sc.nextInt(); b = sc.nextInt();
        System.out.println("The scalar product of two vectors is " + arrOfVectors3D[a - 1].scalarProduct(arrOfVectors3D[b - 1]));

        System.out.println("Get a new vector by adding the other two by entering their numbers separated by a space");

        System.out.println("For a 2D array:");
        a = sc.nextInt(); b = sc.nextInt();
        System.out.println("resulting vector : " + arrOfVectors2D[a - 1].vectorAddition(arrOfVectors2D[b - 1]).toString());

        System.out.println("For a 3D array:");
        a = sc.nextInt(); b = sc.nextInt();
        System.out.println("resulting vector : " + arrOfVectors3D[a - 1].vectorAddition(arrOfVectors3D[b - 1]).toString());

    }

}
