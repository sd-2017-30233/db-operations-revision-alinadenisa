package main.dao;

import main.DBUtil;
import main.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by iliesalinadenisa on 14/03/2017.
 */
public class StudentDao {
    private Connection connection ;

    public StudentDao() {
        connection = DBUtil.getConnection();
        System.out.println("Conexiunea :" + connection);
    }

    public void addStudent(Student student) {
        try {
            PreparedStatement statement =
                    connection.prepareStatement("insert into student(name,birthdate,address) values (?, ?, ?)");
            statement.setString(1, student.getName());
            statement.setDate(2, student.getBirthdate());
            statement.setString(3, student.getAddress());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(Student student){
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update student set name=?, birthdate=?, address=?" +
                            "where id=?");
            // Parameters start with 1
            preparedStatement.setString(1, student.getName());
            preparedStatement.setDate(2, student.getBirthdate());
            preparedStatement.setString(3, student.getAddress());
            preparedStatement.setInt(4, student.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int studentId){
            try {
                PreparedStatement preparedStatement = connection
                        .prepareStatement("delete from student where id=?");
                // Parameters start with 1
                preparedStatement.setInt(1, studentId);
                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    public Student getStudentById(int studentId) {
        Student user = new Student();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from student where id=?");
            preparedStatement.setInt(1, studentId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setBirthdate(rs.getDate("birthdate"));
                user.setAddress(rs.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}






