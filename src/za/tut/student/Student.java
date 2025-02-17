
package za.tut.student;

import java.util.ArrayList;


public class Student {
    private ArrayList<Student>students;
    private String name;
    private String stuNumber;
    private int test;

    public Student() {
         name = " ";
        stuNumber = " ";
        test = 0;
        students= new ArrayList<>();
    }

    
    public Student(String name, String stuNumber, int testWritten) {
        this.name = name;
        this.stuNumber = stuNumber;
        this.test = testWritten;
        students= new ArrayList<>();
    }

  



    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    
    public void addStudent(Student student){
        students.add(student);
    }
    public String searchStudent(String name){
        String nameFound=" ";
        
        for (int i=0;i<students.size();i++){
            if(students.get(i).getName().equals(name)){
                nameFound=students.get(i).getName()+" is found in the list.";
            }
            break;
        }
        
        return nameFound;
    }

    @Override
    public String toString() {
        String display=" ";
   
            display="Student{" +  " name=" + getName() + ", stuNumber=" + getStuNumber() + ", test=" + getTest() + '}';
        
        
        return display;
    }
    
    
   
    
}
