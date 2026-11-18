class Complex {
    double real;
    double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    Complex multiply(Complex c) {
        return new Complex(real * c.real - imaginary * c.imaginary,
                           real * c.imaginary + imaginary * c.real);
    }

    int compareMagnitude(Complex c) {
        double first = Math.sqrt(real * real + imaginary * imaginary);
        double second = Math.sqrt(c.real * c.real + c.imaginary * c.imaginary);
        return Double.compare(first, second);
    }

    Complex copy() {
        return new Complex(real, imaginary);
    }

    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        }
    }
}

public class ComplexProgram2 {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, 5);
        Complex copied = c1.copy();

        System.out.print("First: ");
        c1.display();
        System.out.print("Second: ");
        c2.display();

        System.out.print("Addition: ");
        c1.add(c2).display();

        System.out.print("Multiplication: ");
        c1.multiply(c2).display();

        int result = c1.compareMagnitude(c2);
        if (result > 0) {
            System.out.println("First complex number has greater magnitude");
        } else if (result < 0) {
            System.out.println("Second complex number has greater magnitude");
        } else {
            System.out.println("Both complex numbers have equal magnitude");
        }

        c1.real = 10;
        System.out.print("Modified first: ");
        c1.display();
        System.out.print("Copied object: ");
        copied.display();
    }
}
