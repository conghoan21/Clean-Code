public class Staff {
    String id;
    String fullname;
    int age;
    String tel;
    String email;

    public Staff(){
    }

    public Staff(String id, String fullname, int age, String tel, String email) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.tel = tel;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Id: " + getId()
                + ", fullname: " + getFullname()
                + ", age: " + getAge()
                + ", tel: " + getTel()
                + ", email: " + getEmail();
    }
}
