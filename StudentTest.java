package test;

import main.dao.StudentDao;
import main.model.Student;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by iliesalinadenisa on 15/03/2017.
 */
public class StudentTest{
    private StudentDao studentDao = new StudentDao();


    @Test
    public void testAddStudent() throws ParseException {
        Student student = new Student();
        student.setName("Ilies Alina");
        student.setAddress("Str.Observatorului nr 34");
         String strDate = "1995-01-31 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        java.util.Date date = sdf.parse(strDate);
        java.sql.Date sqlDate = (java.sql.Date) new Date(date.getTime());
        student.setName("Ilies Alina");
        student.setAddress("Str.Observatorului nr 34");
        student.setBirthdate(sqlDate);
        studentDao.addStudent(student);
    }

    @Test
    public void testUpdateStudent() throws ParseException {
        Student student = new Student();
        String strDate = "1995-01-31 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        java.util.Date date = sdf.parse(strDate);
        java.sql.Date sqlDate = (java.sql.Date) new Date(date.getTime());
        student.setName("Ilies Denisa");
        student.setAddress("Strada Observatorului nr 36");
        student.setBirthdate(sqlDate);
        student.setId(1);
        studentDao.updateStudent(student);
    }

    @Test
    public void testShowStudent(){
        System.out.println( studentDao.getStudentById(4).toString());
    }

    @Test
    public void testDeleteStudent(){
        studentDao.deleteStudent(1);

    }

}
