package str_package;

public class demo {
    public static void main(String[] args){
        emp e1=new emp();
        e1.setSalary(50,000);

    }

}
class emp{
    private double salary;
    public void setSalary(double sal){
        salary=sal;
    }

    public double getSalary() {
        return salary;
    }
}