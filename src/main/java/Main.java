public class Main {
    public static void main(String[] args) {
        University Amgu = new University();
        Amgu.setShortName("АМГУ");
        Amgu.setFullName("Амурский государственный университет");
        Amgu.setYearOfFoundation(1975);
        Amgu.setId("amursu");
        Student Sd1 = new Student();
        Sd1.setFullName("Иванов Иван Петрович");
        Sd1.setAvgExamScore(4);
        Sd1.setUniversityId("amursu");
        Sd1.setCurrentCourseNumber(2);
        Sd1.setMainProfile(Student.StudyProfile.ECONOMY);
        System.out.println(Amgu.toString());
        System.out.println(Sd1.toString());
    }
}
