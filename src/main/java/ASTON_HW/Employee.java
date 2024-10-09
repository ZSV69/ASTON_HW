package ASTON_HW;

public class Employee {
    public String fullName;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Employee (String fullName, String position, String email, String phone, int salary,int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
    }

    public void printEmployeeInf() {
        System.out.println("Информация о сотруднике:");
        System.out.println("ФИО: "+fullName);
        System.out.println("Должность: " + position);
        System.out.println("Почта: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }


}
