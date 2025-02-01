public class MyClass {
    private int x = 10;

    public void method1() {
        int y = 20;
        x = method2(x, y);
    }

    public int method2(int a, int b) {
        return a + b; // Return modified value
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        System.out.println("x:" + obj.x); //Now x is updated
    }
}