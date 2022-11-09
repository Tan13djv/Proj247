import org.apache.commons.lang3.StringUtils;

public class University {
    String id;
    String fullName;
    String shortName;
    int yearOfFoundation;

    enum StudyProfile{
        MEDICINE("Медицина"),
        MATHEMATICS ("Математика"),
        PHYSICS ("Инженерия"),
        LINGUISTICS ("Лингвистика");
        String profileName;
        StudyProfile(String rus) {
            profileName = rus;
        }

        public String getProfileName() {
            return profileName;
        }
    };
    public static class FullNameComparator implements IUniverComparator{
        @Override
        public int compare(University o1, University o2) {
            return StringUtils.compare(o1.getFullName(),o2.getFullName());
        }

    }
    public static class ShortNameComparator implements IUniverComparator{
        @Override
        public int compare(University o1, University o2) {
            return StringUtils.compare(o1.getShortName(),o2.getShortName());
        }

    }
    public static class YearOfFoundationComparator implements IUniverComparator{
        @Override
        public int compare(University o1, University o2) {
            return Integer.compare(o1.getYearOfFoundation(),o2.getYearOfFoundation());
        }

    }
    public static class IdComparator implements IUniverComparator{
        @Override
        public int compare(University o1, University o2) {
            return StringUtils.compare(o1.getId(),o2.getId());
        }

    }
    public static class StudyProfileComparator implements IUniverComparator{
        @Override
        public int compare(University o1, University o2) {
            return StringUtils.compare(o1.getMainProfile().getProfileName(),o2.getMainProfile().getProfileName());
        }

    }

    StudyProfile mainProfile;

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public University()
    {

    }

    public University(String id,String fullName,String shortName,int yearOfFoundation,StudyProfile mainProfile) {
        this.setId(id);
        this.setFullName(fullName);
        this.setShortName(shortName);
        this.setYearOfFoundation(yearOfFoundation);
        this.setMainProfile(mainProfile);
    }

    @Override
    public String toString() {
        return "University{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", MainProfile=" + mainProfile.getProfileName() +
                '}';
    }
}
