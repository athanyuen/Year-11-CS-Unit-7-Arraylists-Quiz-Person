import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if(allPersons.size() == 0){
            allPersons.add(person);
            return;
        }
        int x = 0;
        for(Person person1 : allPersons){
            if(person.getLastName().compareTo(person1.getLastName()) < 0){
                allPersons.add(x, person);
                break;
            }
            x++;
        }

    }

    public ArrayList<Person> under18() {
        ArrayList<Person> under18List = new ArrayList();
        for(Person person1 : allPersons){
            if(person1.getAge() < 18){
                under18List.add(person1);
            }
        }
        return under18List;
    }

    public boolean checkLastName(String lastName) {
        for(Person person1 : allPersons){
            if(person1.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}


