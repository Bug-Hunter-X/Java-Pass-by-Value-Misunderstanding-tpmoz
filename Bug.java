public class MyClass {
    private int x = 10;

    public void method1() {
        int y = 20;
        method2(x, y);
    }

    public void method2(int a, int b) {
        a = a + b;
        System.out.println("a:" + a);
        System.out.println("x:" + x);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
    }
}