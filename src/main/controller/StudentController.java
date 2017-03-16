package main.controller;

import main.dao.StudentDao;

/**
 * Created by iliesalinadenisa on 14/03/2017.
 */
public class StudentController {
    private StudentDao dao ;

    public StudentController(){
        super();
        dao = new StudentDao();
    }

    public void execute(){
    }
}
