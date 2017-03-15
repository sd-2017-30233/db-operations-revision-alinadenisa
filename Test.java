package main;

import main.dao.CourseDao;
import main.dao.EnrollmentDao;
import main.dao.StudentDao;
import main.model.Course;
import main.model.Student;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by iliesalinadenisa on 14/03/2017.
 */
public class Test {
    public static void main(String[] args) throws ParseException {

        StudentDao studentDao = new StudentDao();
        CourseDao courseDao = new CourseDao();
        EnrollmentDao enrollmentDao = new EnrollmentDao();
        String strDate = "2011-12-31 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        java.util.Date date = sdf.parse(strDate);
        java.sql.Date sqlDate = new Date(date.getTime());

        Student student = new Student();
        Student student1 = new Student();
        student.setName("alinaaaaa");
        student.setBirthdate(sqlDate);
        student.setAddress("dsada");
        student.setId(4);
        Course course = new Course();
        course.setName("Logicaaaaaa");
        course.setTeacher("B");
        course.setStudyYear(2);
        course.setId(4);
        studentDao.addStudent(student);
        studentDao.updateStudent(student);
        studentDao.deleteStudent(2);
        System.out.println(studentDao.getStudentById(1).toString());
        courseDao.addCourse(course);
        courseDao.updateCourse(course);
        courseDao.deleteCourse(1);
        enrollmentDao.addStudentToCourse(student.getId(),course.getId());
        System.out.println(courseDao.getCourseById(4).toString());
    }
}
