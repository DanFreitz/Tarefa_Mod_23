package mod23.src.test.br.com.marcelocbasilio.testes;

import mod23.src.entities.Person;
import mod23.src.entities.enums.Gender;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MainTest {

    @Test
    public void testListOfWomen() {

        List<Person> listOfPeople = new Person().listPeople();
        List<Person> listOfWomen = listOfPeople.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .toList();

        for (Person person : listOfWomen) Assert.assertEquals(person.getGender(), Gender.FEMALE);
    }
}
