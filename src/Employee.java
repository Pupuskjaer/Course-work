import java.util.Objects;

public class Employee {
    private final String fullName;
    private byte department;
    private int salary;
    private static int idCounter;       // переменная-счетчик для id
    private final int id;             // id сотрудника

    public String getFullName() {
        return fullName;
    }

    public byte getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /*
    * Выводит полный список всех сотрудников со всеми имеющимися по ним данными.
    * */
    public static void getAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {

                System.out.println(employee.toString());
                for (int i = 0; i < 50; i++){
                    System.out.print("--");
                    if (i == 49) {
                        System.out.println("--");
                    }
                }

        }
    }

    /*
    * Выводит сумму затрат на зарплаты
    * */
    public static int sumOfSalaries(Employee [] employees) {
        int sum = 0; // сумма затрат на зарплаты
        for (Employee employee : employees) {
            if (employee.getFullName() != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    /*
    * Поиск минимальной зарплаты
    * */
    public static int searchMinSalary(Employee [] employees) {
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary && employee.getSalary() != 0) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }
    /*
    * Поиск максимальной зарплаты. В рассчет идут только ячейки массива с
    * ненулевой зарплатой и чье имя не Null
    * */
    public static int searchMaxSalary(Employee [] employees) {
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary & employee.getSalary() != 0) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }
    /*
    * Вывод среднего арифметического зарплат. В рассчет идут только объекты с заполненным
    * именем и ненулевой зарплатой
    * */
    public static int avarageValueOfSalaries (Employee[] employees) {
        return sumOfSalaries(employees)/employees.length;
    }

    public static void getNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    /*
     * -----------------------------------------------------------------------------------------------------------------
     * Для повышенного уровня сложности
     * -----------------------------------------------------------------------------------------------------------------
     * */
    public static void increaseSalary(Employee[] employees, int increasingPercent) {
        float currentSalary;
        for (Employee employee : employees) {
            currentSalary =((float) employee.getSalary())*(1+increasingPercent/100f);
            employee.setSalary((int)(currentSalary));
        }
    }
    /*
    * Возвращает минимальную зарплату в отделе
    * */
    public static int minSalaryInDepartment(Employee[] employees,int depNumber) {
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getDepartment() == depNumber && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }
    /*
    * Возвращает максимальную сумму по отделу
    * */
    public static int maxSalaryInDepartment(Employee[] employees,int depNumber) {
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getDepartment() == depNumber && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }
    /*
    * Возвращает общую сумму затрат по зарплатам по отделу
    * */
    public static int sumSalaryInDep(Employee[] employees, int depNumber) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == depNumber) {
                sumSalary += employee.getSalary();

            }
        }
        return sumSalary;
    }

    /*
     * Возращает среднюю зарплату по отделу
     * */
    public static int avarageSalaryInDep(Employee[] employees, int depNumber) {
        int employeeInDep = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == depNumber) {
                employeeInDep++;
            }
        }
        return (int)(sumSalaryInDep(employees,depNumber)/employeeInDep);
    }

    /*
     * Индексирует зарплату работников всего отдела на процент, получаемый
     * в параметрах метода
     * */
    public static void increaseSalaryInDep(Employee[] employees,int depNumber,int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == depNumber) {
                float emp = (float)employee.getSalary() * (1+percent/100.0f);
                employee.setSalary((int)emp);
            }
        }
    }

    /*
     * Печать всех работников отдела и их данных за исключением номера отдела
     * */
    public static void printEmployeesInDep(Employee[] employees, int depNumber) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == depNumber) {
                System.out.println("Ф.И.О. - " + employee.getFullName()
                        + "\n Зарплата - " + employee.getSalary()
                        + "\n ID - " + employee.getId());
                System.out.println("---------------------------------------------");
            }
        }
    }
    /*
    * Выводит всех сотрудников с зарплатой
    * меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    *  */
    public static void getByMoreSalary(Employee[] employees,int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println("Ф.И.О. - " + employee.getFullName()
                        + "\n Зарплата - " + employee.getSalary()
                        + "\n ID - " + employee.getId());
                System.out.println("---------------------------------------------");
            }
        }
    }
    /*
    * Выводит всех сотрудников с зарплатой
    * меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    *  */
    public static void getByLessSalary(Employee[] employees,int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println("Ф.И.О. - " + employee.getFullName()
                        + "\n Зарплата - " + employee.getSalary()
                        + "\n ID - " + employee.getId());
                System.out.println("---------------------------------------------");
            }
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return  "Ф.И.О. - " + fullName + '\'' +
                "\n Номер отдела - " + department +
                "\n Зарплата - " + salary +
                "\n id - " + id;
    }

    public Employee(String fullName, byte department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }
}
