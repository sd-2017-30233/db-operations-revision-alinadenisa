package main.model;

/**
 * Created by iliesalinadenisa on 14/03/2017.
 */
public class Course {
    private int id;
    private String name;
    private String teacher;
    private int studyYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }
    @Override
    public String toString() {
        return "Course : id=" + id + ", name=" + name
                + ", teacher=" + teacher + ", studyYear="
                + studyYear ;
    }
}
