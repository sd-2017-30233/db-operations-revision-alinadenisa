package main.dao;

import main.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by iliesalinadenisa on 15/03/2017.
 */
public class EnrollmentDao {
    private Connection connection;

    public EnrollmentDao(){
        connection= DBUtil.getConnection();
    }

    public void addStudentToCourse(int studentId, int courseId){
        try {
            PreparedStatement statement =
                    connection.prepareStatement("insert into enrollment(idStudent,idCourse) values (?, ?)");
            statement.setInt(1, studentId);
            statement.setInt(2, courseId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

