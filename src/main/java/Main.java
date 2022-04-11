
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
 2.Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
  Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
  тогда при запросе такой фамилии должны выводиться все телефоны.
   Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
   Консоль использовать только для вывода результатов проверки телефонного справочника.
*/

public class Main {


    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        a = Arrays.asList("One", "One", "Two", "One", "Two",
                "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "One", "Two", "Three", "Four");
        HashMap<String, Integer> hm = new HashMap<>();
        for (String i : a) {
            if (hm.containsKey(i)) hm.put(i, hm.get(i) + 1);
            else hm.put(i, 1);
        }
        LinkedHashSet<String> set = new LinkedHashSet<>(a);
        String[] arr = new String[a.size()];
        a.toArray(arr);
        System.out.println("Значания встречаются в количестве " + hm);


        System.out.println(set + " Уникальныые значения массива");


        Phonebook phonebook = new Phonebook();
        phonebook.add("Bond", "094-843-42-21");
        phonebook.add("Bond", "050-843-42-21");
        phonebook.add("James", "073-345-623-34");
        System.out.println(phonebook.get("Bond"));
    }
}


