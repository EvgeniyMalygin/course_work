import java.util.Scanner;

public class Main {
    private static Employee[] employees = new Employee[10];

    //Метод печати всех данных сотрудников
    private static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    //Метод подсчета суммы зарплаты в месяц
    private static double sumSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    //Метод подсчета средней зарплаты в месяц
    private static double averageSalary() {
        return (sumSalary() / employees.length);
    }

    //Метод поиска минимальной зарплаты в месяц
    private static Employee minSalary() {
        double tempSalary = employees[0].getSalary();
        int tempIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (tempSalary > employees[i].getSalary()) {
                tempSalary = employees[i].getSalary();
                tempIndex = i;
            }
        }
        return employees[tempIndex];
    }

    //Метод поиска максимальной зарплаты в месяц
    private static Employee maxSalary() {
        double tempSalary = employees[0].getSalary();
        int tempIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (tempSalary < employees[i].getSalary()) {
                tempSalary = employees[i].getSalary();
                tempIndex = i;
            }
        }
        return employees[tempIndex];
    }

    //Метод печати ФИО сотрудников
    private static void printFullName() {
        for (Employee i : employees) {
            System.out.println(i.getLastName() + " " + i.getFistName() + " " + i.getMiddleName());
        }
    }

    //Индексация зарплаты
    private static void indexSalary(double percent) {
        for (Employee i : employees) {
            i.setSalary(i.getSalary() + i.getSalary() * percent / 100);
        }
    }

    //Поиск сотрудника с минимальной зарплатой в отделе
    private static Employee minSalaryInDepartment(int number) {
        double tempSalary = employees[0].getSalary();
        int tempIndex = 0;
        for (Employee j : employees) {
            if (j.getNumberOfDepartment() == number) {
                tempSalary = j.getSalary();
                break;
            }
            tempIndex += 1;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getNumberOfDepartment() == number && tempSalary > employees[i].getSalary()) {
                tempSalary = employees[i].getSalary();
                tempIndex = i;
            }
        }
        return employees[tempIndex];
    }

    //Поиск сотрудника с максмальной зарплатой в отделе
    private static Employee maxSalaryInDepartment(int number) {
        double tempSalary = employees[0].getSalary();
        int tempIndex = 0;
        for (Employee j : employees) {
            if (j.getNumberOfDepartment() == number) {
                tempSalary = j.getSalary();
                break;
            }
            tempIndex += 1;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getNumberOfDepartment() == number && tempSalary < employees[i].getSalary()) {
                tempSalary = employees[i].getSalary();
                tempIndex = i;
            }
        }
        return employees[tempIndex];
    }

    //Подсчет зарплаты по отделу
    private static double sumSalaryInDepartment(int number) {
        double sum = 0;
        for (Employee i : employees) {
            if (i.getNumberOfDepartment() == number) {
                sum += i.getSalary();
            }
        }
        return sum;
    }

    //Подсчет средней зарплаты по отделу
    private static double averageSalaryInDepartment(int number) {
        int count = 0;
        for (Employee i : employees) {
            if (i.getNumberOfDepartment() == number) {
                count++;
            }
        }
        return (sumSalaryInDepartment(number) / count);
    }

    //Индексация зарплаты по отделу
    private static void indexSalaryInDepartment(double percent, int number) {
        for (Employee i : employees) {
            if (i.getNumberOfDepartment() == number) {
                i.setSalary(i.getSalary() + i.getSalary() * percent / 100);
            }
        }
    }

    //Печать ФИО сотрудников отдела
    private static void printEmployeeInDepartment (int number){
        for (Employee i : employees) {
            if (i.getNumberOfDepartment() == number){
                System.out.println("id: " + i.getIdEmployee() + " ФИО: " + i.getLastName() + " " + i.getFistName() + " "
                        + i.getMiddleName() + ", зарплата: " + i.getSalary());
            }
        }
    }

    //Поиск сотрудников отдела с зарплатой меньше заданной
    private static void salaryIsLess(double number) {
        for (Employee i : employees) {
            if (i.getSalary() < number){
                System.out.println("id: " + i.getIdEmployee() + " ФИО: " + i.getLastName() + " " + i.getFistName() + " "
                        + i.getMiddleName() + ", зарплата: " + i.getSalary());
            }
        }
    }

    //Поиск сотрудников отдела с зарплатой больше заданной
    private static void salaryIsMore(double number) {
        for (Employee i : employees) {
            if (i.getSalary() >= number){
                System.out.println("id: " + i.getIdEmployee() + " ФИО: " + i.getLastName() + " " + i.getFistName() + " "
                        + i.getMiddleName() + ", зарплата: " + i.getSalary());
            }
        }
    }
    public static void main(String[] args) {
        // Employee[] employees = new Employee[10];
        double persent = 10.5; // Процент индексации зарплаты
        int number = 2; //Номер отдела для поиска минимальной и максимальной зарплаты в отделе
        double salaryIsLess = 40000; //Значение для поиска сотрудников с меньшей зарплатой
        double salaryIsMore = 20000; //Значение для поиска сотрудников с большей зарплатой
        //Заполнение списка с консоли
//        String fistName = "";
//        String lastName = "";
//        String middleName = "";
//        int numberOfDepartment = 0;
//        double salary = 0;
//        int j = 1;
//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < employees.length; i++)
//        {
//            System.out.println("Сотрудник №" + j);
//            j++;
//            System.out.print("Введите фамилию: ");
//            lastName = in.nextLine();
//            System.out.print("Введите имя: ");
//            fistName = in.nextLine();
//            System.out.print("Введите отчество: ");
//            middleName = in.nextLine();
//            System.out.print("Введите номер отдела (1-5): ");
//            numberOfDepartment = in.nextInt();
//            System.out.print("Введите ежемесячную зарплату сотрудника: ");
//            salary = in.nextDouble();
//            in.nextLine();
//            employees[i] = new Employee( lastName, fistName, middleName, numberOfDepartment, salary);
//        }

        // Заполнение в программе
        employees[0] = new Employee("Петров", "Иван", "Сергеевич",
                1, 12000);
        employees[1] = new Employee("Иванов", "Иван", "Сергеевич",
                2, 14000);
        employees[2] = new Employee("Сидоров", "Петр", "Иванович",
                3, 12030);
        employees[3] = new Employee("Сергеев", "Демид", "Петрович",
                4, 11200);
        employees[4] = new Employee("Терновский", "Олег", "Михайлович",
                5, 53023);
        employees[5] = new Employee("Мимиков", "Федор", "Никодимович",
                1, 11230);
        employees[6] = new Employee("Демидов", "Ринат", "Магомедович",
                1, 23450);
        employees[7] = new Employee("Черкасов", "Николай", "Петрович",
                2, 32456);
        employees[8] = new Employee("Козлов", "Олег", "Константинович",
                2, 33123);
        employees[9] = new Employee("Ястребов", "Дмитрий", "Сергеевич",
                3, 33678);
        //Печать всех данных сотрудников
        printEmployees();
        System.out.println("========================================================================");
        System.out.println("Сумма затрат на зарплаты за месяц: " + sumSalary());
        System.out.println("Среднее значение зарплат за месяц: " + averageSalary());
        System.out.println("Минимальная зарплата у сотрудника: " + minSalary().toString());
        System.out.println("Максимальная зарплата у сотрудника: " + maxSalary().toString());
        System.out.println("========================================================================");
        //Печать ФИО сотрудников
        printFullName();
        System.out.println("========================================================================");
        //Изменение данных сотрудника через сеттеры
        employees[9].setNumberOfDepartment(3);
        employees[9].setSalary(43000);
        //Печать всех полей сотрудника с измененными данными
        System.out.println(employees[9].toString());
        System.out.println("========================================================================");
        //Печать данных после индексации зарплаты
        indexSalary(persent);
        printEmployees();
        System.out.println("========================================================================");
        System.out.printf("Минимальная зарплата в отделе № %s у сотрудника %s \n", number,
                minSalaryInDepartment(number).toString());
        System.out.println("========================================================================");
        System.out.printf("Максимальная зарплата в отделе № %s у сотрудника %s \n", number,
                maxSalaryInDepartment(number).toString());
        System.out.println("========================================================================");
        System.out.printf("Сумма затрат на зарплату в отделе № %s составляет %s \n", number,
                sumSalaryInDepartment(number));
        System.out.println("========================================================================");
        System.out.printf("Средняя зарплата  в отделе № %s составляет %s \n", number,
                averageSalaryInDepartment(number));
        System.out.println("========================================================================");
        //Печать данных после индексации зарплаты в отделе
        indexSalaryInDepartment(persent, number);
        printEmployees();
        System.out.println("========================================================================");
        // Печать сотрудников отдела
        printEmployeeInDepartment(number);
        System.out.println("========================================================================");
        // Печать сотрудников с зарплатой меньше заданной
        System.out.printf("Список сотрудников с зарплатой меньше %s \n", salaryIsLess);
        salaryIsLess(salaryIsLess);
        System.out.println("========================================================================");
        // Печать сотрудников с зарплатой больше заданной
        System.out.printf("Список сотрудников с зарплатой больше %s \n", salaryIsMore);
        salaryIsMore(salaryIsMore);
    }
}