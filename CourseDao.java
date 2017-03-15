package main.dao;

import main.util.DBUtil;
import main.model.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by iliesalinadenisa on 14/03/2017.
 */
public class CourseDao {
    private Connection connection;

    public CourseDao(){
        connection= DBUtil.getConnection();
    }

    public void addCourse(Course course) {
        try {
            PreparedStatement statement =
                    connection.prepareStatement("insert into course(name,teacher,studyYear) values (?, ?, ?)");
            statement.setString(1, course.getName());
            statement.setString(2, course.getTeacher());
            statement.setInt(3, course.getStudyYear());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCourse(Course course){
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update course set name=?, teacher=?, studyYear=?" +
                            " where id=?");
            // Parameters start with 1
            preparedStatement.setString(1,course.getName());
            preparedStatement.setString(2, course.getTeacher());
            preparedStatement.setInt(3, course.getStudyYear());
            preparedStatement.setInt(4, course.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteCourse(int courseId){
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from course where id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, courseId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Course getCourseById(int courseId) {
        Course course = new Course();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from course where id=?");
            preparedStatement.setInt(1, courseId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                course.setId(rs.getInt("id"));
                course.setName(rs.getString("name"));
                course.setTeacher(rs.getString("teacher"));
                course.setStudyYear(rs.getInt("studyYear"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return course;
    }


}
