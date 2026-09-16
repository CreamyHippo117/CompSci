package Day6;

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
public String GetId(){
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
    return "";
}

public boolean equals(Student other){
   if (name == other.name && )
}
}



