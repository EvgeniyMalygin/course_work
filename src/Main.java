import java.util.Scanner;

public class Main {
    //Метод печати всех данных сотрудников
    public static void printEmployees(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
    //Метод подсчета суммы зарплаты в месяц
    public static double sumSalary(Employee[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getSalary();
        }
        return sum;
    }
    //Метод подсчета средней зарплаты в месяц
    public static double averageSalary(Employee[] arr) {
        return (sumSalary(arr) / arr.length);
    }
    //Метод поиска минимальной зарплаты в месяц
    public static Employee minSalary(Employee[] arr) {
        double tempSalary = arr[0].getSalary();
        int tempIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (tempSalary > arr[i].getSalary()) {
                tempSalary = arr[i].getSalary();
                tempIndex = i;
            }
        }
        return arr[tempIndex];
    }
    //Метод поиска максимальной зарплаты в месяц
    public static Employee maxSalary(Employee[] arr) {
        double tempSalary = arr[0].getSalary();
        int tempIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (tempSalary < arr[i].getSalary()) {
                tempSalary = arr[i].getSalary();
                tempIndex = i;
            }
        }
        return arr[tempIndex];
    }
    //Метод печати ФИО сотрудников
    public static void printFullName(Employee[] arr) {
        for (Employee i : arr) {
            System.out.println(i.getLastName() + " " + i.getFistName() + " " + i.getMiddleName());
        }
    }


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

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
                1, 14000);
        employees[2] = new Employee("Сидоров", "Петр", "Иванович",
                1, 12030);
        employees[3] = new Employee("Сергеев", "Демид", "Петрович",
                1, 11200);
        employees[4] = new Employee("Терновский", "Олег", "Михайлович",
                1, 53023);
        employees[5] = new Employee("Мимиков", "Федор", "Никодимович",
                1, 11230);
        employees[6] = new Employee("Демидов", "Ринат", "Магомедович",
                1, 23450);
        employees[7] = new Employee("Черкасов", "Николай", "Петрович",
                1, 32456);
        employees[8] = new Employee("Козлов", "Олег", "Константинович",
                1, 33123);
        employees[9] = new Employee("Ястребов", "Дмитрий", "Сергеевич",
                1, 33678);
        //Печать всех данных сотрудников
        printEmployees(employees);
        System.out.println("========================================================================");
        System.out.println("Сумма затрат на зарплаты за месяц: " + sumSalary(employees));
        System.out.println("Среднее значение зарплат за месяц: " + averageSalary(employees));
        System.out.println("Минимальная зарплата у сотрудника: " + minSalary(employees).toString());
        System.out.println("Максимальная зарплата у сотрудника: " + maxSalary(employees).toString());
        System.out.println("========================================================================");
        //Печать ФИО сотрудников
        printFullName(employees);
        System.out.println("========================================================================");
        //Изменение данных сотрудника через сеттеры
        employees[9].setNumberOfDepartment(3);
        employees[9].setSalary(43000);
        //Печать всех полей сотрудника с измененными данными
        System.out.println(employees[9].toString());
    }
}