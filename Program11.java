class A {
    A() {
        System.out.println("A constructor");
    }

    A(int value) {
        System.out.println("A constructor: " + value);
    }
}

class B extends A {
    B() {
        System.out.println("B constructor");
    }

    B(int value) {
        super(value + 10);
        System.out.println("B constructor: " + value);
    }
}

class C extends B {
    C() {
        System.out.println("C constructor");
    }

    C(int value) {
        super(value + 20);
        System.out.println("C constructor: " + value);
    }
}

public class Program11 {
    public static void main(String[] args) {
        C obj1 = new C();
        C obj2 = new C(10);
    }
}
