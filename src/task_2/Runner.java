package task_2;

import task_2.vector.Vector;

public class Runner {

    public static void main(String[] args) {

        Vector vector1 = new Vector(new int[] {3, -2, 4, 5, 0});
        Vector vector2 = new Vector(new int[] {-5, 3, 1, 6, -4});

        System.out.println(vector1.toString());
        System.out.println(vector2.toString());

        System.out.println("vector comparison:");
        if (vector1.equals(vector2)) {
            System.out.println("vectors are equal");
        } else {
            System.out.println("vectors are not equal");
        }

        System.out.println("vector length:");
        System.out.println(vector1.vectorLength());
        System.out.println(vector2.vectorLength());

        System.out.println("scalar product:");
        System.out.println(vector1.scalarProduct(vector2));

        System.out.println("vector addition:");
        System.out.println(vector1.vectorAddition(vector2).toString());

    }

}
