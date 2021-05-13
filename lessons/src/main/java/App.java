import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {
        App app = new App();
        List<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();
        //fill

        //count
        Map<String, Integer> map = app.countingWords(arrayList);
        Map<String, Integer> map2 = app.countingWords(linkedList);
        Map<String, Integer> map3 = app.countingWords(new HashSet<>());

       Optional<String> s1 = Optional.empty();
       Optional<String> s2 = Optional.of("s2");

       List<String> list = app.getList("name", new HashMap<>());

       for (String s : list) {
           System.out.println(s);
       }

       list.forEach(System.out::println);


    }


    public Map<String, Integer> countingWords(Collection<String> list) {
        Map<String, Integer> hm = new TreeMap<>();
        //logic
        for (String s : list) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        return hm;
    }

    public List<String> getList(String name, Map<String, List<String>> map) {
        return map.getOrDefault(name, Collections.emptyList());
    }
}
