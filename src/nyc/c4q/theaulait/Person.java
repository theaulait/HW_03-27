package nyc.c4q.theaulait;

public class Person {

    private String name;
    private String phoneNumber;
    private String city;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean checkSameCity(Person person1, Person person2) {
        if (person1.getCity().equalsIgnoreCase(person2.getCity()))
            {
                return true;
            }
                else
            {
                return false;
            }

    }

    public static Person registeredChild(String childName, Person parent) {
        Person newperson = new Person();
        newperson.setName(childName);
        newperson.setPhoneNumber(parent.getPhoneNumber());
        newperson.setCity(parent.getPhoneNumber());

        return newperson;
    }
}





