package school;
import java.util.ArrayList;
public class Person {
    
//    public static int numPeople = 10;
//    private static int currentPeopleIndex = 0;
//    private static Person people[] = new Person[numPeople];
    private static ArrayList<Person> people =
            new ArrayList<Person>();
    
    enum Gender {
        Male,Female,Gay,Lesbian,Trans
    }
    
    private Gender gender;
    private int weight;
    private String name;
    
    public static Person addPerson(String _name,Gender _gender, int _weight) {
        Person temp = new Person(_gender,_weight,_name);
       // people[currentPeopleIndex++] = temp;
        people.add(temp);
        return(temp);
    }
    
    Person (){
        gender = Gender.Male;
        weight = 180;
        name = "nameless";
    }
    
    Person (Gender gender_, int weight_, String name_){
        gender = gender_;
        weight = weight_;
        name = name_;
    }   
    //GET METHODS
    public int getWeight(){
        return(weight);
    }
    public String getName(){
        return(name);
    }
    public Gender getGender(){
        return(gender);
    }
    //SET METHODS
    public void setWeight(int weight_){
        weight = weight_;
    }
    public void setName(String name_){
        name = name_;
    }
    public void setGender(Gender gender_){
        gender = gender_;
    }
    public static void printNames(){
//        System.out.println("<==Names==>");
//        for(int i = 0;i < people.length;i++) {
//            if(people[i] != null)
//                System.out.println(people[i].getName());
//        }
//        System.out.println("<=========>");
        System.out.println("<==Names==>");
        for(Person temp : people) {
                System.out.println(temp.getName());
        }
        System.out.println("<=========>");
    }
    public static void printNames(Gender gender){
        System.out.println("<=="+gender+"Names==>");
        for(Person temp : people) {
            if(temp.getGender() == gender)
                System.out.println(temp.getName());
        }
        System.out.println("<=========>");
    }
    
    public String toString()
    {
        return(name + " " + gender + " " + weight);
    }
}
