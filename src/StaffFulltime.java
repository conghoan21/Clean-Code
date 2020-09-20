public class StaffFulltime extends Staff {
    private double salary;
    private double bonus;
    private double fine;

    public StaffFulltime(){
    }

    public StaffFulltime(String id, String fullname, int age, String tel, String email) {
        super(id, fullname, age, tel, email);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getRealSalary(){
        return (this.salary+this.bonus-this.fine);
    }
}
