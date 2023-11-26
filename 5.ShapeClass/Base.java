import java.util.Scanner;
abstract class Base{
    double val1;
    double val2;
    void input_data(double val1, double val2){
        Scanner sc = new Scanner(System.in);
        this.val1 = sc.nextDouble();
        this.val2 = sc.nextDouble();
    }
    abstract void computeArea();
}

