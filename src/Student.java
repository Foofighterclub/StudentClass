import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Student {

  private final String name;
  private final String surname;
  private final Date birthDate;
  private final String taxCode;
  private Map<ClassType, Grade> studentGrades;

  public Student(String name, String surname, Date birthDate, String taxCode) {
    this.name = name;
    this.surname = surname;
    this.birthDate = birthDate;
    this.taxCode = taxCode;
    this.studentGrades = new HashMap<>();
  }
}
