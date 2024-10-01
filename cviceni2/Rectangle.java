package cviceni2;

public class Rectangle {
    static int instanceCount = 0;
    int a, b;

    public Rectangle(int a, int b) {
        if (a > 0 && b > 0) {
            this.a = a;
            this.b = b;
            instanceCount++;
        }
    }

    /*
    public Rectangle(int a) {
        this(a, a);
    }

    public Rectangle() {
        this(3, 5);
    }
    */

    int getArea() {
        return 2 * (a + b);
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    static Rectangle getInstance(int a, int b) {
        if (a > 0 && b > 0) {
            instanceCount++;
            return new Rectangle(a, b);
        }
        return null;
    }

    static Rectangle getInstance(int a) {
        return getInstance(a, a);
    }

    static Rectangle getInstance() {
        return getInstance(3, 5);
    }
}