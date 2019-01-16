import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] names = new Person[3];

        names[0] = new Person("Ka");
        names[1] = new Person("Kar");
        names[2] = new Person("Karl");
        for (Person person : names) {
            System.out.println(person.getName());

        }
            Person karla = new Person("karla");
            Person[] fourthPerson = addPerson(names, karla);

            for(Person person: fourthPerson) {
                System.out.println(person.getName());
            }


        }


        public static Person[] addPerson(Person[] names, Person person) {
            Person[] personCopy = Arrays.copyOf(names, names.length + 1);
            personCopy[personCopy.length - 1] = person;
            return personCopy;


        }
}
