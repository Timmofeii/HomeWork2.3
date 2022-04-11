import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List <String>> phoneBook = new HashMap<>();
    private List <String> phoneNumberList;
    public void add( String surname,String phoneNumber){
        if (phoneBook.containsKey(surname)){
            phoneNumberList=phoneBook.get(surname);
            phoneNumberList.add(phoneNumber);
            phoneBook.put(surname,phoneNumberList);
        }else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            phoneBook.put(surname, phoneNumberList);
        }
    }
    public List<String> get(String surname){
        return phoneBook.get(surname);
    }

}



