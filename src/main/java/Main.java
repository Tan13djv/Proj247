import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*
    List<Comparator> unCompList = new ArrayList<>();
    List<Comparator> stCompList = new ArrayList<>();
*/
    Comparator UnComp = null;
    Comparator StComp = null;

    ImportData NewData = new ImportData("universityInfo.xlsx");

    NewData.ImportUniversity();
    NewData.ImportStudients();
/*
    unCompList.add(MyComparator.getMyComparator(MyComparator.UnivChoseCompare.IdComparator));
    unCompList.add(MyComparator.getMyComparator(MyComparator.UnivChoseCompare.FullNameComparator));
    unCompList.add(MyComparator.getMyComparator(MyComparator.UnivChoseCompare.ShortNameComparator));
    unCompList.add(MyComparator.getMyComparator(MyComparator.UnivChoseCompare.YearOfFoundationComparator));
    unCompList.add(MyComparator.getMyComparator(MyComparator.UnivChoseCompare.StudyProfileComparator));

    stCompList.add(MyComparator.getMyComparator(MyComparator.StudChoseCompare.UniverIdComparator));
    stCompList.add(MyComparator.getMyComparator(MyComparator.StudChoseCompare.FullNameComparator));
    stCompList.add(MyComparator.getMyComparator(MyComparator.StudChoseCompare.CourseNumComparator));
    stCompList.add(MyComparator.getMyComparator(MyComparator.StudChoseCompare.ExamScoreComparator));


    NewData.Univs.sort(unCompList.get(0).thenComparing(unCompList.get(1)).thenComparing(unCompList.get(2)).thenComparing(unCompList.get(3)).thenComparing(unCompList.get(4)));
    NewData.Stud.sort(stCompList.get(0).thenComparing(stCompList.get(1)).thenComparing(stCompList.get(2)).thenComparing(stCompList.get(3)));

    //unCompList.stream().forEach(NewData.Univs::sort);
    //stCompList.stream().forEach(NewData.Stud::sort);
*/


    Scanner sc= new Scanner(System.in);

    System.out.println("Choose field for sorting of University: \n1.Full name\n2.Year of foundation\n3.Short mame\n4.Id\n5.Study Profile");
    int uCh = sc.nextInt();
    System.out.println("Choose field for sorting of Students: \n1.Full name\n2.University id\n3.Current course number\n4.Average exam score");
    int sCh = sc.nextInt();
    switch (uCh){
        case 1:
            UnComp = MyComparator.getMyComparator(MyComparator.UnivChoseCompare.FullNameComparator);
            break;
        case 2:
            UnComp = MyComparator.getMyComparator(MyComparator.UnivChoseCompare.YearOfFoundationComparator);
            break;
        case 3:
            UnComp = MyComparator.getMyComparator(MyComparator.UnivChoseCompare.ShortNameComparator);
            break;
        case 4:
            UnComp = MyComparator.getMyComparator(MyComparator.UnivChoseCompare.IdComparator);
            break;
        case 5:
            UnComp = MyComparator.getMyComparator(MyComparator.UnivChoseCompare.StudyProfileComparator);
            break;
    }

        switch (sCh){
            case 1:
                StComp = MyComparator.getMyComparator(MyComparator.StudChoseCompare.FullNameComparator);
                break;
            case 2:
                StComp = MyComparator.getMyComparator(MyComparator.StudChoseCompare.UniverIdComparator);
                break;
            case 3:
                StComp = MyComparator.getMyComparator(MyComparator.StudChoseCompare.CourseNumComparator);
                break;
            case 4:
                StComp = MyComparator.getMyComparator(MyComparator.StudChoseCompare.ExamScoreComparator);
                break;
        }
     NewData.Univs.stream().sorted(UnComp).forEach(System.out::println);
     NewData.Stud.stream().sorted(StComp).forEach(System.out::println);

    }


}
