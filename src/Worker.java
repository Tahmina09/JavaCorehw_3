public class Worker {
    private static int CURRENT_YEAR = 2023;
    private String fullName;
    private String status;
    private String phone;
    private int salary;
    private int birthyear;

    static void salaryIncrease(Worker[] workers){
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 45) {
                workers[i].setSalary(workers[i].getSalary() + 5000);
            }
        }

    }

    Worker (String fullName, String status, String phone, int salary, int age) {
        this.fullName = fullName;
        setBirth(age);
        this.status = status;
        this.phone = phone;
        this.salary = salary;
    }

    public String getFullName() { return fullName; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }
    public int getAge() { return CURRENT_YEAR - birthyear; }
    public void setBirth(int age) { this.birthyear = CURRENT_YEAR - age; }


}
