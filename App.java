public class App {
    public static void main(String[] args) {
        Student stu = new Student.StudentBuilder("A", "B")
            .addAge(20).build();
        System.out.println(stu);
    }
    
}
