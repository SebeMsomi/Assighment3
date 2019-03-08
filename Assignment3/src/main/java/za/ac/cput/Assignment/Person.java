package za.ac.cput.Assignment;

import javafx.util.Builder;

import java.util.Objects;

public class Person {
    private int age;
    private String name;
    private String surname;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public Person(Builder buil) {
        this.age = buil.age;
    }

    public static class Builder {
        private int age;
        private String name;
        private String surname;

        public Builder age(int x) {
            this.age = x;
            return this;
        }

        public Builder name(String x) {
            this.name = x;
            return this;
        }

        public Builder surname(String x) {
            this.surname = x;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;

        return Objects.equals(getSurname(), person.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }
}
