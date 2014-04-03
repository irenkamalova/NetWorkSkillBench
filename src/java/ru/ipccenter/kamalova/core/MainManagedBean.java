/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.ipccenter.kamalova.core;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import ru.ipccenter.kamalova.entities.Questions;
import ru.ipccenter.kamalova.session.QuestionSessionBean;

/**
 *
 * @author днс
 */
@Named(value = "mainManagedBean")
@SessionScoped
public class MainManagedBean implements Serializable {

    @EJB
    private QuestionSessionBean qsb;
    
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Questions getQuestionById() {
        return qsb.find(id);
    }

    public MainManagedBean() {
    }
    
}
