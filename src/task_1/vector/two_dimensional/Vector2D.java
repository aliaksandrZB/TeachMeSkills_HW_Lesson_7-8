package task_1.vector.two_dimensional;

import java.util.Objects;

public class Vector2D {

    private int x;
    private int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector2D)) return false;
        Vector2D vector2D = (Vector2D) o;
        return getX() == vector2D.getX() && getY() == vector2D.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    public double vectorLength() {
        return Math.sqrt(x * x + y * y);
    }

    public int scalarProduct(Vector2D vector2) {
        return x * vector2.x + y * vector2.y;
    }

    public Vector2D vectorAddition(Vector2D vector2) {
        return new Vector2D(x + vector2.x, y + vector2.y);
    }

    public Vector2D vectorDifference(Vector2D vector2) {
        return new Vector2D(x - vector2.x, y - vector2.y);
    }

    static public Vector2D[] arrayOfRandomVectors2D(int N) {
        Vector2D[] arrOfVectors = new Vector2D[N];

        for (int i = 0; i < arrOfVectors.length; ++i) {
            arrOfVectors[i] = new Vector2D((int) (Math.random() * 10 - 9), (int) (Math.random() * 10 - 9));
        }
        return arrOfVectors;
    }

}
