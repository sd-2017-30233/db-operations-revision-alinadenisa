package test;

import main.dao.EnrollmentDao;
import org.junit.jupiter.api.Test;

/**
 * Created by iliesalinadenisa on 15/03/2017.
 */
public class EnrollmentTest {
    private EnrollmentDao enrollmentDao = new EnrollmentDao();

    @Test
    public void testEnrollStudent(){
        enrollmentDao.addStudentToCourse(4,5);
    }

}
