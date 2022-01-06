package task_2.vector;

import java.util.Arrays;

public class Vector {

    private int[] coordinates;

    public Vector(int[] coordinates) {
        this.coordinates = coordinates;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int[] coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "coordinates=" + Arrays.toString(coordinates) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector)) return false;
        Vector vector = (Vector) o;
        return Arrays.equals(getCoordinates(), vector.getCoordinates());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCoordinates());
    }

    public double vectorLength() {
        int sum = 0;
        for (int i = 0; i < coordinates.length; ++i) {
            sum += coordinates[i] * coordinates[i];
        }
        return Math.sqrt(sum);
    }

    public int scalarProduct(Vector vector2) {
        int sum = 0;
        for (int i = 0; i < coordinates.length; ++i) {
            sum += coordinates[i] * vector2.coordinates[i];
        }
            return sum;
    }

    public Vector vectorAddition(Vector vector2) {
        int[] newCoordinates = new int[coordinates.length];
        for (int i = 0; i < coordinates.length; ++i) {
            newCoordinates[i] = coordinates[i] + vector2.coordinates[i];
        }
        return new Vector(newCoordinates);
    }


}
