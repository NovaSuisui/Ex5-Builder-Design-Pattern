public class Student {
  private String name, university;
  private int age;

  public Student(StudentBuilder studentBuilder) {
    this.name = studentBuilder.name;
    this.university = studentBuilder.university;
    this.age = studentBuilder.age;
  } 
  public static class StudentBuilder {
    private final String name, university; 
    private int age = 0; 
    public StudentBuilder(String name, String university) {
      this.name = name;
      this.university = university;
    }
    public StudentBuilder addAge(int annualIncome) {
      this.age = annualIncome;
      return this;
    }
  
    public Student build()
    {
      return new Student(this);
    }
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("name: " + name + "\n");
    sb.append("university: " + university + "\n");
    if (this.age != 0) {
      sb.append("age: " + age + "\n");
    }
    return sb.toString();
  }
  
}
