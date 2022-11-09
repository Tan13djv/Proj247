import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class ImportData {
    XSSFWorkbook workbook;
    public ArrayList<University> Univs;
    public ArrayList<Student> Stud;
    XSSFSheet sheet;
    ImportData(){};

    ImportData(String filename) throws IOException {

        Univs = new ArrayList<University>();
        Stud = new ArrayList<Student>();

        FileInputStream fileInputStream = new FileInputStream(Main.class.getClassLoader().getResource(filename).getFile());
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = null;

    }
    public void ImportUniversity() throws IOException, ClassNotFoundException {
        sheet = workbook.getSheet("Университеты");

        for(Row row:sheet){
            if(row.getRowNum()>0) {
                String id = row.getCell(0).getStringCellValue();
                String fullName = row.getCell(1).getStringCellValue();
                String shortName = row.getCell(2).getStringCellValue();
                int yearOfFoundation = (int) row.getCell(3).getNumericCellValue();
                String Profile = row.getCell(4).getStringCellValue();

                Univs.add(new University(id, fullName, shortName, yearOfFoundation, University.StudyProfile.valueOf(Profile)));
            }
        }
       // System.out.println(Univs);
    }
    public void ImportStudients() throws IOException {

        sheet = workbook.getSheet("Студенты");

            for (Row row : sheet) {
                //System.out.print(row.getRowNum() + ":");
                if (row.getRowNum() > 0) {

                    String universityId = row.getCell(0).getStringCellValue();
                    String fullName = row.getCell(1).getStringCellValue();
                    int currentCourseNumber = (int) row.getCell(2).getNumericCellValue();
                    float avgExamScore = (float) row.getCell(3).getNumericCellValue();

                    Stud.add(new Student(universityId, fullName, currentCourseNumber, avgExamScore));
                }
            }
 //       System.out.println(Stud);
 //       Stud.sort(MyComparator.getMyComparator(MyComparator.StudChoseCompare.ExamScoreComparator));
 //       System.out.println(Stud);
    }
}
