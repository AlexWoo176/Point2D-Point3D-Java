package classes.point;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3DOne = new Point3D();
        System.out.println(point3DOne);

        Point3D point3DTwo = new Point3D(17.6f, 14.1f, 6.5f);
        System.out.println(point3DTwo);
    }
}
