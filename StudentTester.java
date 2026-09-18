class StudentTester {

    public static void main(String[] args) {
        Student john = new Student("John");
        Student jane = new Student("Jane", 11);
        Student jack = new Student("Jack");
        Student alex = new Student("John", 12);
    

    System.out.println("Students:");
    System.out.println((john.toString()));
    System.out.println((jane.toString()));
    System.out.println((jack.toString()));
    System.out.println((alex.toString()));

    alex.setName("Alexandra");
    alex.setGrade(11);
    System.out.println(alex.toString());
    }
}