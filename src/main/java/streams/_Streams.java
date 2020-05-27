package streams;

import imperative.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static streams._Streams.Gender.FEMALE;
import static streams._Streams.Gender.MALE;


public class _Streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("john",MALE),
                new Person("maria",FEMALE),
                new Person("ashia", FEMALE),
                new Person("alex",FEMALE),
                new Person("alice",FEMALE)
        );
        people.stream().
                map(person -> person.gender).
                collect(Collectors.toSet()).
                forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE,FEMALE;
    }
}
