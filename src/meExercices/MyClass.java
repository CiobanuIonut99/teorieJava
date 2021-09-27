package meExercices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class MyClass {



    public List<Integer> myNumber(List<String> list) {
        List<Integer> intList = new ArrayList<>();
//        list.stream().forEach(x -> intList.add(x.length()));

        intList = list.stream().map(String::length).collect(toList());
        return intList;


    }
}

