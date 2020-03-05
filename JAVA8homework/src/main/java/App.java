import entity.MasterNumber;
import entity.Person;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        PersonService personService = new PersonService();
        //TODO: print Person data that masterNumber is 1 and 2
        // print Person data that masterNumber is 3

        Stream<Person> person12 = personService.getPersonByMasterNumbers(Arrays.asList(
                new MasterNumber("1"), new MasterNumber("2")));
        Stream<Person> person3 = personService.getPersonByMasterNumbers(Arrays.asList(new MasterNumber("3")));
        System.out.println("==Person with masterNumber 1&2==");
        person12.forEach(System.out::println);
        System.out.println("================================");
        System.out.println("==Person with masterNumber 3====");
        person3.forEach(System.out::println);
        System.out.println("================================");
    }

}
