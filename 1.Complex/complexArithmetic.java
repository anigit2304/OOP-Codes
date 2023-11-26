class Complex {
    double real;
    double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex co2) {
        double newreal = this.real + co2.real;
        double newimaginary = this.imaginary + co2.imaginary;

        return new Complex(newreal, newimaginary);
    }

    Complex subtract(Complex co2) {
        double newreal = this.real - co2.real;
        double newimaginary = this.imaginary - co2.imaginary;

        return new Complex(newreal, newimaginary);
    }

    Complex mult(Complex co2) {
        double newreal = this.real * co2.real - this.imaginary * co2.imaginary;
        double newimaginary = this.real * co2.imaginary + this.imaginary * co2.real;

        return new Complex(newreal, newimaginary);
    }

    Complex divide(Complex co2) {
        double denominator = co2.real * co2.real - co2.imaginary * co2.imaginary;
        double newreal = (this.real * co2.real + this.imaginary * co2.imaginary) / denominator;
        double newimaginary = (this.imaginary * co2.real - this.real * co2.imaginary) / denominator;
        return new Complex(newreal, newimaginary);
    }
}

public class complexArithmetic {
    public static void main(String args[]) {
        Complex co1 = new Complex(5, 4);
        Complex co2 = new Complex(2, 4);
        Complex sum = co1.add(co2);
        Complex sub = co1.subtract(co2);
        Complex mult = co1.mult(co2);
        Complex div = co1.divide(co2);

        // Print the results
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
        System.out.println("Difference: " + sub.real + " + " + sub.imaginary + "i");
        System.out.println("Product: " + mult.real + " + " + mult.imaginary + "i");
        System.out.println("Division: " + div.real + " + " + div.imaginary + "i");
    }
}
