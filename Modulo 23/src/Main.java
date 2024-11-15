package mod23.src;

import mod23.src.entities.Person;
import mod23.src.entities.enums.Gender;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        String listOfName = question();
        listOfPeople(listOfName, persons);

        System.out.println("> Lista de Mulheres <");
        persons.stream().filter(s -> s.getGender().equals(Gender.FEMALE)).forEach(System.out::println);

        System.exit(0);
    }

    private static void listOfPeople(String listOfName, List<Person> persons) {
        List<String> people = List.of(listOfName.split(","));
        for (String p : people) {
            Person person = new Person();
            if (p.endsWith("-m") || p.endsWith("-M")) {
                person.setName(p.substring(0, p.lastIndexOf("-")));
                person.setGender(Gender.MALE);
                persons.add(person);
            } else if (p.endsWith("-f") || p.endsWith("-F")) {
                person.setName(p.substring(0, p.lastIndexOf("-")));
                person.setGender(Gender.FEMALE);
                persons.add(person);
            }
        }
    }

    private static String question() {
        String title = "[mod23] Teste Parte 01";
        String message = "> Digite nomes e sexo (-m ou -f) separados por vírgula!";
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
