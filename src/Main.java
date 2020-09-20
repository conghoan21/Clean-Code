import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Staff> list = new ArrayList<>();
        list.add(new StaffFulltime("001", "Malzahar",27,"09696","malzahar@gmail.com"));
        list.add(new StaffFulltime("002", "Riven",25,"09669","riven@gmail.com"));
        list.add(new StaffFulltime("003", "Jarvan IV",30,"06969","jarvaniv@gmail.com"));
        list.add(new StaffFulltime("004", "Master Yi",28,"69696","masteryi@gmail.com"));
        list.add(new StaffFulltime("005", "Malphite",27,"08668","malphite@gmail.com"));

        list.add(new StaffParttime("006", "Jinx", 25, "06868", "jinx@gmail.com"));
        list.add(new StaffParttime("007", "Tristana", 23, "68686", "tristana@gmail.com"));
        list.add(new StaffParttime("008", "Missfortune", 25, "68866", "missfortune@gmail.com"));
        list.add(new StaffParttime("009", "Ashe", 25, "66886", "ashe@gmail.com"));
        list.add(new StaffParttime("010", "Caitlyn", 25, "96696", "caitlyn@gmail.com"));

        Scanner sc = new Scanner(System.in);
// Hiển thị danh sách nhân viên
        for (Staff staff : list) {
            System.out.println(staff.toString());
        }
        // Thêm nhân viên
        System.out.println("Add new staff: ");
        System.out.print("Id: ");
        String id = sc.nextLine();
        System.out.print("FullName: ");
        String fullName = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.println("Tel: ");
        String tel = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        list.add(new Staff(id, fullName, age, tel, email));
// Tính lương nhân viên
        double sumSalaryOfFulltime = 0;
        double sumSalaryOfParttime = 0;
        for (Staff staff : list) {
            if (staff instanceof StaffFulltime) {
                System.out.print("Salary of " + staff.getFullname() + ": ");
                double salary = sc.nextDouble();
                ((StaffFulltime) staff).setSalary(salary);
                System.out.print("Bonus of " + staff.getFullname() + ": ");
                double bonus = sc.nextDouble();
                ((StaffFulltime) staff).setBonus(bonus);
                System.out.print("Fine of " + staff.getFullname() + ": ");
                double fine = sc.nextDouble();
                ((StaffFulltime) staff).setBonus(fine);
                sumSalaryOfFulltime += ((StaffFulltime) staff).getRealSalary();
            } else {
                System.out.print("Worktime of " + staff.getFullname() + ": ");
                int workTime = sc.nextInt();
                ((StaffParttime) staff).setWorktime(workTime);
                sumSalaryOfParttime += ((StaffParttime) staff).getRealSalary();
            }
        }
        double averageOfSalary = (sumSalaryOfFulltime + sumSalaryOfParttime) / (list.size());
        System.out.println("List of full-time employees whose salaries are below the average is: ");
        for (Staff staff : list) {
            if (staff instanceof StaffFulltime) {
                if (((StaffFulltime) staff).getRealSalary() < averageOfSalary) {
                    System.out.println(staff.getFullname());
                }
            }
        }

        System.out.println("Salary payable to all part-time employees is: " + sumSalaryOfParttime);


        ArrayList<StaffFulltime> listOfFullTime = new ArrayList<>();
        for (Staff staff : list) {
            if (staff instanceof StaffFulltime) {
                listOfFullTime.add((StaffFulltime) staff);
            }
        }
        for (int i = 0; i < listOfFullTime.size(); i++) {
            StaffFulltime min = listOfFullTime.get(i);
            int index = i;
            for (int j = i + 1; j < listOfFullTime.size(); j++) {
                if (listOfFullTime.get(j).getRealSalary() < min.getRealSalary()) {
                    min = listOfFullTime.get(j);
                    index = j;
                }
            }
            if (index != i) {
                listOfFullTime.set(i,listOfFullTime.get(index));
                listOfFullTime.set(index,listOfFullTime.get(i));
            }
        }
        System.out.println("The list of full-time employees by salary incrementally is: ");
        for (StaffFulltime staffFulltime: listOfFullTime){
            System.out.println(staffFulltime.getFullname());
        }
    }
}
