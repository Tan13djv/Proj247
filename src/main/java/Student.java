import org.apache.commons.lang3.StringUtils;

public class Student  {
    String fullName;
    String universityId;
    int currentCourseNumber;
    float avgExamScore;
    public Student(String universityId,String fullName, int currentCourseNumber,float avgExamScore) {
        this.setFullName(fullName);
        this.setUniversityId(universityId);
        this.setCurrentCourseNumber(currentCourseNumber);
        this.setAvgExamScore(avgExamScore);
    }

    public Student() {
    }
    enum ChoseCompare{
        FNAME, FOUNDY
    }

    static class FullNameComparator implements IStudComparator{

        @Override
        public int compare(Student o1, Student o2) {
            return StringUtils.compare(o1.getFullName(),o2.getFullName());
        }
    }
    static class CourseNumComparator implements IStudComparator{

        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getCurrentCourseNumber(), o2.getCurrentCourseNumber());
        }
    }
    static class ExamScoreComparator implements IStudComparator{

        @Override
        public int compare(Student o1, Student o2) {
            return Float.compare(o2.getAvgExamScore(),o1.getAvgExamScore());
        }
    }
    static class UniverIdComparator implements IStudComparator{

        @Override
        public int compare(Student o1, Student o2) {
            return StringUtils.compare(o1.getUniversityId(),o2.getUniversityId());
        }
    }

    public String getFullName() {
        return fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }


    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", universityId='" + universityId + '\'' +
                ", currentCourseNumber=" + currentCourseNumber +
                ", avgExamScore=" + avgExamScore +
                '}';
    }

 }
