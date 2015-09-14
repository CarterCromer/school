/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

public class School {

    public static void main(String[] args) {
        Person joe = Person.addPerson("Joe", Person.Gender.Male, 120);
        Person phil = Person.addPerson("Phil", Person.Gender.Male, 120);
        Person daquanda = Person.addPerson("Daquanda", Person.Gender.Female, 436);
        Person nigga = Person.addPerson("Tyrone", Person.Gender.Female, 210);
        
        Person.printNames();
        Person.printNames(Person.Gender.Female);
        System.out.println(phil.getWeight());
        System.out.println(phil);
    }
}
