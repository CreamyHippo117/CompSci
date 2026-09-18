

public class Student {
    private String name;
    private String id;
    private int grade;


public Student(String newName){
    name = newName;
    grade = 10;
    id = generateId();
}


public Student(String newName, int newGrade){
    name = newName;
    grade = newGrade;
    id = generateId();
}

public String getName(){
    return name;
}

public void setName(String newName){
    name = newName;
}
public String getId(){
    return id;
}
public void setId(String newId){
    id = newId;
}
public int getGrade(){
    return grade;
}
public void setGrade(int newGrade){
    grade = newGrade;
}

public String toString(){
    return "Student" + name + "Id" + id + "Grade" + grade + ".";
}

public boolean equals(Student other){
  if(name.equals(other.name) && id.equals(other.id) && grade == other.grade) {
    return true;
  }
  else{
    return false;
  }
   }

   public String generateId(){
        int first = (int) (Math.random() * 800) + 100;
        int last = (int) (Math.random() * 9000) + 1000;
        return first + "-" + last;
    }
}




