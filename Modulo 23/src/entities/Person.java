package mod23.src.entities;

import mod23.src.entities.enums.Gender;

import java.util.List;

public class Person {

    private String name;
    private Gender gender;

    public Person() {}

    public Person(String name, Gender gender) {
        this.setName(name);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Person> listPeople() {
        Person person1 = new Person("Robert", Gender.MALE);
        Person person2 = new Person("John", Gender.MALE);
        Person person3 = new Person("Mary", Gender.FEMALE);
        Person person4 = new Person("Jane", Gender.FEMALE);
        Person person5 = new Person("Bob", Gender.MALE);
        Person person6 = new Person("Alice", Gender.FEMALE);

        return List.of(person1, person2, person3, person4, person5, person6);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return name.equals(person.name) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + gender.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person {" +
               "name = '" + name + '\'' +
               ", gender = " + gender +
               '}';
    }
}
