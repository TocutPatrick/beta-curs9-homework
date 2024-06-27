package Exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        // adding employees
        company.employ(new Person("Costel", 31, "Manager"));
        company.employ(new Person("Cicaldau", 21, "welder"));
        company.employ(new Person("Hagi", 22, "carpenter"));
        company.employ(new Person("Stanciu", 55, "plumber"));
        company.employ(new Person("Nita", 67, "plumber"));
        company.employ(new Person("Dragusin", 19, "carpenter"));

        // get managers
        System.out.println(company.getManager());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        // get person with specific profession
        System.out.println(company.getPersons("carpenter"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        // get person older than input age
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        System.out.println(company.getPersonsOlder(age));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        //get person by name
        System.out.print("Enter name: ");
        String name = scan.next();
        System.out.println(company.getPerson(name));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
