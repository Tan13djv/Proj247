import java.lang.reflect.GenericDeclaration;
import java.util.Comparator;

public class MyComparator {
    enum UnivChoseCompare{
        FullNameComparator, YearOfFoundationComparator, ShortNameComparator,IdComparator,StudyProfileComparator
    }
    enum StudChoseCompare{
        FullNameComparator, UniverIdComparator, CourseNumComparator, ExamScoreComparator
    }
    public static Comparator getMyComparator(UnivChoseCompare myEnum){
        if(myEnum == UnivChoseCompare.FullNameComparator)
            return new University.FullNameComparator();
        if(myEnum == UnivChoseCompare.YearOfFoundationComparator)
            return new University.YearOfFoundationComparator();
        if(myEnum == UnivChoseCompare.ShortNameComparator)
            return new University.ShortNameComparator();
        if(myEnum == UnivChoseCompare.IdComparator)
            return new University.IdComparator();
        if(myEnum == UnivChoseCompare.StudyProfileComparator)
            return new University.StudyProfileComparator();
        return null;
    };
    public static Comparator getMyComparator(StudChoseCompare myEnum){
        if(myEnum == StudChoseCompare.FullNameComparator)
            return new Student.FullNameComparator();
        if(myEnum == StudChoseCompare.UniverIdComparator)
            return new Student.UniverIdComparator();
        if(myEnum == StudChoseCompare.CourseNumComparator)
            return new Student.CourseNumComparator();
        if(myEnum == StudChoseCompare.ExamScoreComparator)
            return new Student.ExamScoreComparator();
        return null;
    };
}
