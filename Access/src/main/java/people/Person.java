
package people;

public class Person {
    private String name;
    private String lastname;
    private String fullName;
    private int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        createFullName(name,lastname);
    }
    
    private void createFullName(String name, String lastname){
        this.fullName = name + " " + lastname;
    }
    public String getFullname(){
        return this.fullName;
    }

    public int getAge() {
        return age;
    }
}
