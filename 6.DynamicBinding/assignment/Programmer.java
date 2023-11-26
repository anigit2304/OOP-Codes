package assignment;

public class Programmer extends Employee {
	double BasicPay;
    public
    Programmer(){
    BasicPay = 150000;
}
    //super.CalculateSal(double bp);
    
void CalculateSal() {
    super.CalculateSal(BasicPay);
}
}
