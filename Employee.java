/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if (calculate.age>16)
        return true;
        else
        return false;
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        int calculatePay=(hourlyWage*unpaidHours);
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        get.int calculatePay;
        send.int calculatePayToJohnDeere;
        system0utprintln;"Jonh has received a transfer of 70 CAD";
        reset unpaidHours()=0;
    }
}
q11
private string fullname
fullname();
unpaidHours();
private int yearOfBirth
currentyear();
yearOfBirth();
calculateAge();