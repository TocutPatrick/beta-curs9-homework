package Exercise3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> employees;


    public Company() {
        this.employees = new ArrayList<>();
    }

    public Person getManager(){

        for(Person person : employees){
            if(person.getPosition().equalsIgnoreCase("manager"))
                return person;
        }
        return null;
    }

    public List<Person> getPersons(String profession){
        List<Person> persons = new ArrayList<>();
        for(Person p : employees){
            if(p.getPosition().equalsIgnoreCase(profession))
                persons.add(p);
        }
        return persons;
    }

    public List<Person> getPersonsOlder(int age){
        List<Person> persons = new ArrayList<>();
        for(Person p : employees){
            if(p.getAge() > age)
                persons.add(p);
        }
        return persons;
    }

    public List<Person> getPerson(String filterName){
        List<Person> persons = new ArrayList<>();
        for(Person p : employees){
            if(p.getName().equalsIgnoreCase(filterName)){
                persons.add(p);
            }
        }
        return persons;
    }

    public void employ(Person person){
        employees.add(person);
    }

}
