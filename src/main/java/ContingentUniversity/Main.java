package ContingentUniversity;

// Перечисление для представления пола
enum Gender {
    MALE, FEMALE
}

// Перечисление для представления учёных степеней
enum AcademicDegree {
    MSc, PhD
}

// Перечисление для представления ступеней обучения
enum StudyStage {
    Bachelor, Master
}

public class Main {

    public static void main(String[] args) {

        // Массив персон
        Persona[] people = {
                new Teacher("Ronald Turner", Gender.MALE, "Computer science", AcademicDegree.PhD, "Programming paradigms"),
                new Teacher("Ruth Hollings", Gender.FEMALE, "Jurisprudence", AcademicDegree.MSc, "Domestic arbitration"),
                new Student("Leo Wilkinson", Gender.MALE, "Computer science", StudyStage.Bachelor, 3),
                new Student("Anna Cunningham", Gender.FEMALE, "World economy", StudyStage.Bachelor, 1),
                new Student("Jill Lundqvist", Gender.FEMALE, "Jurisprudence", StudyStage.Master, 1),
                new GraduateStudent("Ronald Correa", Gender.MALE, "Computer science", "Design of a functional programming language.")
        };

        // Вывод информации о персонах
        for (Persona person : people) {
            person.print();
            System.out.println();
        }
    }
}