public class Student {
    String fullName;
    String universityId;
    int currentCourseNumber;
    float avgExamScore;
    public Student() {
    }
    enum StudyProfile{
        MEDICINE("Медицина"), IT("Информационные технологии"), ECONOMY("Экономика"), LAW("Юриспруденция");
        String profileName;
        StudyProfile(String rus) {
            profileName = rus;
        }

        public String getProfileName() {
            return profileName;
        }
    };
    StudyProfile mainProfile;

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

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", universityId='" + universityId + '\'' +
                ", currentCourseNumber=" + currentCourseNumber +
                ", avgExamScore=" + avgExamScore +
                ", mainProfile=" + mainProfile +
                '}';
    }
}
