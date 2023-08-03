public class Director extends Worker{
    public Director(String fullName, String status, String phone, int salary, int age) {
        super (fullName, status, phone, salary, age);
    }

    static void salaryIncrease(Worker[] workers){
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 45) {
                workers[i].setSalary(workers[i].getSalary() + 5000);
            }
        }
    }
}
