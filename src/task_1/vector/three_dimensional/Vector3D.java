package task_1.vector.three_dimensional;

import task_1.vector.two_dimensional.Vector2D;

import java.util.Objects;

public class Vector3D {

    private int x;
    private int y;
    private int z;

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector3D)) return false;
        Vector3D vector3D = (Vector3D) o;
        return getX() == vector3D.getX() && getY() == vector3D.getY() && getZ() == vector3D.getZ();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getZ());
    }

    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public int scalarProduct(Vector3D vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    public Vector3D vectorAddition(Vector3D vector2) {
        return new Vector3D(x + vector2.x, y + vector2.y, z + vector2.z);
    }

    public Vector3D vectorDifference(Vector3D vector2) {
        return new Vector3D(x - vector2.x, y - vector2.y, z - vector2.z);
    }

    static public Vector3D[] arrayOfRandomVectors3D(int N) {
        Vector3D[] arrOfVectors = new Vector3D[N];

        for (int i = 0; i < arrOfVectors.length; ++i) {
            arrOfVectors[i] = new Vector3D((int) (Math.random() * 10 - 9), (int) (Math.random() * 10 - 9), (int) (Math.random() * 10 - 9));
        }
        return arrOfVectors;
    }

}
