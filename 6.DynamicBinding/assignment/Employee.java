package assignment;
import java.util.Scanner;

public class Employee {
String Emp_name;
double Emp_id;
String address;
String Emp_mail;
long Mobile_no;

Scanner sc = new Scanner(System.in);

public void Read() {
	System.out.println("Enter Employee Name");
	Emp_name = sc.nextLine();
	System.out.println("Entewr Employee id");
	Emp_id = sc.nextDouble();
	sc.nextLine();
	System.out.println("Enter Employee Address");
	address = sc.nextLine();
	System.out.println("Enter Mobile No");
	Mobile_no = sc.nextLong();
	sc.nextLine();
	System.out.println("Enter Email id");
	Emp_mail = sc.nextLine();
}
public void Display() {
	System.out.println("Employee Details");
	System.out.println("Employee Name " + Emp_name);
	System.out.println("Employee id " + Emp_id);
	System.out.println("Employee Address " + address);
	System.out.println("Employee Mobile No " + Mobile_no);
	System.out.println("Employee " + Emp_mail);
}

void CalculateSal(double bp){
	double da,hra,  pf, scf,  grossSal,  netSal;
	da = bp*0.97;
	hra = bp*0.1;
	pf = bp*0.12;
	scf = bp*0.001;
	
	grossSal = da+hra+bp+pf+scf;
	netSal = grossSal - pf - scf;
	System.out.println("DA: "+da);
	System.out.println("Basis Pay (BP)"+bp);
	System.out.println("HRA"+hra);
	System.out.println("PF"+pf);
	System.out.println("SCF"+scf);
	System.out.println("Gross Salary"+grossSal);
	System.out.println("Net Salary"+netSal);
}

}
