public class StaffParttime extends Staff {
    private int worktime;

    public StaffParttime(){
    }

    public StaffParttime(String id, String fullname, int age, String tel, String email) {
        super(id, fullname, age, tel, email);
    }

    public int getWorktime() {
        return worktime;
    }

    public void setWorktime(int worktime) {
        this.worktime = worktime;
    }

    public double getRealSalary(){
        return this.worktime*100000;
    }

}
