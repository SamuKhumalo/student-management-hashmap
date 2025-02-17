package ex5practiceproblem;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import za.tut.student.Student;

public class Ex5PracticeProblem {

    public static void main(String[] args) {

        HashMap<Integer, Student> studentMap = new HashMap<>();
        Student stud = new Student();
        stud.setName("Jomo");
        stud.setStuNumber("111");
        stud.setTest(18);
        stud.addStudent(stud);

        studentMap.put(1, stud);

        stud = new Student();
        stud.setName("Mangethe");
        stud.setStuNumber("222");
        stud.setTest(5);
        stud.addStudent(stud);

        studentMap.put(2, stud);
        stud = new Student();
        stud.setName("Sputla");
        stud.setStuNumber("333");
        stud.setTest(20);
        stud.addStudent(stud);

        studentMap.put(3, stud);

        stud = new Student();
        stud.setName("Zembe");
        stud.setStuNumber("444");
        stud.setTest(10);
        stud.addStudent(stud);

        studentMap.put(4, stud);

        stud = new Student();
        stud.setName("Nitho");
        stud.setStuNumber("555");
        stud.setTest(8);
        stud.addStudent(stud);

        studentMap.put(5, stud);

        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            Integer key = entry.getKey();
            Student value = entry.getValue();

            System.out.println(key + " => " + value);

        }
        String input =JOptionPane.showInputDialog("Enter the name of the student: ");
        String searching=stud.searchStudent(input);
            String found= " ";
        
        if(stud.getName().equalsIgnoreCase(searching)){
             found= "The student FOUND";
        }else{
            found="Student NOT found";
        }
        JOptionPane.showMessageDialog(null, found);
        
        

    }
}
