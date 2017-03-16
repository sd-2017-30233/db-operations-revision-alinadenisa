package main.model;

/**
 * Created by iliesalinadenisa on 15/03/2017.
 */
public class Enrollment {
    private int id;
    private int idStudent;
    private int idCourse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }
}
