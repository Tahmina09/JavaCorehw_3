
public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Иванова Надежда Владимировна", "Старший бухгалтер", "+7 900 567 23 40", 150000, 50);
        Worker w2 = new Worker("Смирнов Артем Сергеевич", "Бухгалтер", "+7 982 890 45 23", 135000, 46);
        Worker w3 = new Worker("Соколов Егор Морозович", "Помощник бухгалтера", "+7 961 034 78 90", 115000, 35);
        Worker w4 = new Worker("Лебедева Лариса Александровна", "Бухгалтер-стажер", "+7 567 120 91 28", 105000, 28);
        Worker w5 = new Worker("Волков Вадим Олегович", "Стажер", "+7 821 348 53 69", 100000, 25);
        Director d1 = new Director("Новиков Алексей Васильевич", "Главный бухгалтер", "+7 890 386 72 85", 200000, 55);
        //printInfo(w2);

        Worker[] workers = {d1, w1, w2, w3, w4, w5};

        for (int i = 0; i < workers.length; i++) {
            salaryIncrease(workers[i], 5000);
        }

        for (int i = 0; i < workers.length; i++) {
            printInfo(workers[i]);
        }

        System.out.println(midAge(workers));
        System.out.println(midSalary(workers));
    }

    public static void printInfo(Worker worker){
        System.out.println("Worker's " +
                "Full name: " + worker.getFullName() +
                "\nStatus: " + worker.getStatus() +
                "\nPhone Number: " + worker.getPhone() +
                "\nSalary: " + worker.getSalary() +
                "\nAge: " + worker.getAge() + System.lineSeparator());
    }


    public static void salaryIncrease(Worker worker, int amount){
        if (worker.getAge() > 45) {
            worker.setSalary(worker.getSalary() + amount);
        }
    }

    public static float midAge(Worker[] workers){
        float sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getAge();
        }
        return sum / workers.length;
    }

    public static float midSalary(Worker[] workers){
        float sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        return sum / workers.length;
    }
}