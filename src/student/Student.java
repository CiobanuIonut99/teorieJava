package student;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private double mark;
    private int absentNumber;
    private boolean hasScutire;


public Student(){
    System.out.println("Salut sunt constructor");
}

public final void mess(String aion){
final int num = 1300;

    System.out.println(num);
}






}
