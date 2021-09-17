package lambdaExpressions;


import student.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        String myStr = "SS  ";
//
//        List<String> worldElements = new ArrayList<>();
//        worldElements.add("Fire");
//        worldElements.add("Earth");
//        worldElements.add("Water");
//        worldElements.add("Wind");
//        worldElements.add("Energy");
//        worldElements.add("Ice");
//
//
//        for(int i=0; i < worldElements.size();i++){
//
//            int a;
//        a= worldElements.get(i).length() -1 ;
//            if(a % 2 == 0   ){
//                System.out.println(a);
//            }
//        }

//        worldElements.stream().sorted().forEach(x -> System.out.println(x));


//        worldElements.forEach(eachString -> System.out.println(eachString.length()));


//        worldElements
//                .stream()
//                .map(myVar -> myVar.length())
//                .map(x -> x*2)
//                .forEach(cipi -> System.out.println(cipi));


//        for(int i = 0; i < worldElements.size(); i++){
//            int a;
//           a = worldElements.get(i).length();
//            a = a*2;
//            System.out.println(a);
//        }
//
//        for(String a:worldElements)
//        {
//            int b;
//            b = a.length();
//            b = b*2;
//            System.out.println(b );
//
//        }


//        worldElements.stream().filter(eachString -> eachString.length() > 4).forEach(each -> System.out.println(each));


//        for (int i = 0; i < worldElements.size(); i++) {
//            System.out.println(worldElements.get(i));
//        }
//        for (String a : worldElements) {
//            System.out.println(a);
//        }

//        worldElements.forEach(eachString -> System.out.println(eachString));
//
//        List<Integer> nr = new ArrayList<>( );
//
//        nr.add(1);
//        nr.add(2);
//        nr.add(3);
//        nr.add(4);
//        nr.add(5);
//
//        nr.forEach(eachNr -> {
//            if(eachNr % 2 == 0){
//                System.out.println(eachNr);
//            }
//        });

        Student marcel = new Student("Marcel", 19, 9.5, 10, true);
        Student ana = new Student("Ana", 20, 5.2, 0, false);
        Student mark = new Student("Mark", 21, 6.73, 5, false);
        Student john = new Student("John", 18, 8.56, 14, true);

        Stream<Student> students = Stream.of(marcel, ana, mark, john);
//        students.filter(student ->student.getName().charAt(0) == 'a' || student.getName().charAt(0) == 'A').forEach(x -> System.out.println(x));


//        students.filter(student ->{if(student.getMark() < 7){
//                    student.setMark(student.getMark() +1);
//                    return true;
//
//                }
//
//                    return false;
//                })
//                .forEach(student -> System.out.println(student));

        students.sorted(Comparator.comparing(student -> student.getMark())).forEach(student -> System.out.println(student ));








//        students
//                .filter(student -> {
//                    if (student.isHasScutire()) {
//                        student.setAbsentNumber(student.getAbsentNumber() - 3);
//                        return true;
//                    }
//                    return false;
//                })
//                .forEach(student -> System.out.println(student));


    }
}
