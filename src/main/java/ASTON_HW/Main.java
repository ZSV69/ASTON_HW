package ASTON_HW;

public class Main {
    public static void main(String[] args) {

        Employee [] employees = new Employee[5];
        employees [0] = new Employee("Иван Смирнов","Аналитик","smirnov@mail.ru", "4951111",12000,30);
        employees [1] = new Employee("Сергей Петров","Менеджер","petrov@mail.ru", "4951212",20000,32);
        employees [2] = new Employee("Илья Федоров","Директор","fedorov@mail.ru", "4950000",80000,37);
        employees [3] = new Employee("Ирина Кит","Инженер","kit@mail.ru", "4955555",40000,35);
        employees [4] = new Employee("Елена Икс","Секретарь","iks@mail.ru", "4946551",23000,19);
        Employee employee = new Employee("Иван","клоун","папавпва","655465431",1545,25);

    }
}