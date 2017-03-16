package test;

import main.dao.CourseDao;
import main.model.Course;
import org.junit.jupiter.api.Test;

/**
 * Created by iliesalinadenisa on 15/03/2017.
 */
public class CourseTest {
        private CourseDao courseDao = new CourseDao();

        @Test
        public void testAddCourse(){
            Course course = new Course();
            course.setName("Programare OO");
            course.setTeacher("Profesor");
            course.setStudyYear(2);
            courseDao.addCourse(course);
        }

        @Test
        public void testUpdateCourse(){
            Course course = new Course();
            course.setName("ProgrmareOO");
            course.setTeacher("ProfesorNou");
            course.setStudyYear(2);
            course.setId(5);
            courseDao.updateCourse(course);
        }

        @Test
        public void testDeleteCourse(){
            courseDao.deleteCourse(2);
        }

        @Test
        public void testShowCourse(){
            System.out.println(courseDao.getCourseById(5).toString());
        }
}
