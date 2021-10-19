package Lesson_5;
/**
 * Java 1. HomeWork 5.
 *
 * @author Pavel
 * @version 19.10.2021
 */
class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int years;

    Person (String name, String position, String email, String phone, int salary, int years) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.years = years;
    }

    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + years;
    }
}

class HomeWork {

    public static void main(String[] args) {
	    Person person = new Person("Ivanov", "QA", "ivanov@compani.ru", "+7777777777", 100000, 30);
            System.out.println(person);
    }
}
