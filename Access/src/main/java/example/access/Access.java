
package example.access;

import people.Person;

public class Access {

    public static void main(String[] args) {
        OtherClass other = new OtherClass();
        other.sayHello();
        
        Person person = new Person("Pepito","Perez",15);
        //person.createFullName("Santiago","Alberto");
        System.out.println(person.getFullname());
        
        System.out.println(person.getAge());
        
    }
}
