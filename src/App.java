// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    private static Employee[] employees = {
        new Employee("Подоплелов Подоплел Подоплелович", (byte) 5, 96547),
        new Employee("Машина Маша Машевна", (byte) 5, 54778),
        new Employee("Лерова Лера Леровна", (byte) 1, 50000),
        new Employee("Саркисов Саркис Саркисович", (byte) 2, 7050),
        new Employee("Лапорта Жоан Хименесович", (byte) 5, 456123),
        new Employee("Мария Хосе Хименес", (byte) 3, 16548),
        new Employee("Дорова Дора Доровна", (byte) 2, 781621),
        new Employee("Пумова Пума Пумовна", (byte) 4, 46883),
        new Employee("Пашев Паша Пашевич", (byte) 4, 48613),
        new Employee("Катюхина Катюха Катюховна", (byte) 1, 78451)
    };

    public static void main(String[] args) {
        determinator();
        Employee.getAllEmployees(employees);
        determinator();
        Employee.getNames(employees);
        determinator();
        System.out.println("Средняя зарплата работников - " + Employee.avarageValueOfSalaries(employees) + " рублей");
        determinator();
        System.out.println("Максимальная зарплата работника составляет - " + Employee.searchMaxSalary(employees) + " рублей");
        determinator();
        System.out.println("Минимальная зарплата работника составляет - " + Employee.searchMinSalary(employees) + " рублей");
        determinator();
        System.out.println("Итоговая сумма всех затрат на зарплаты работников - " + Employee.sumOfSalaries(employees) + " рублей");
        determinator();
        //---------------------------------------------------------------------------------------------------------------------------
        System.out.println("Минимальная зарплата в пятом отделе - " +  Employee.minSalaryInDepartment(employees, 5));
        determinator();
        System.out.println("Максимальная зарплата в пятом отделе - " +  Employee.maxSalaryInDepartment(employees, 5));
        determinator();
        System.out.println("Общая сумма затрат на зарплаты в 4 отделе - " +  Employee.sumSalaryInDep(employees,4));
        determinator();
        System.out.println("Среднее значение зарплат в 4 отделе - " +  Employee.avarageSalaryInDep(employees,4));
        determinator();
        Employee.increaseSalaryInDep(employees, 5, 9);
        Employee.printEmployeesInDep(employees,5);
        determinator();
        Employee.getByLessSalary(employees,50000);
        determinator();
        Employee.getByMoreSalary(employees,50000);
        determinator();
        Employee.increaseSalary(employees, 14);
        Employee.getAllEmployees(employees);


    }
    private static void determinator() {
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println("-");
    }
}