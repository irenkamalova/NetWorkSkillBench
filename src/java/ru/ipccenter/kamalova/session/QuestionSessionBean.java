/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.ipccenter.kamalova.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import ru.ipccenter.kamalova.entities.Questions;

/**
 *
 * @author днс
 */
@Stateless
public class QuestionSessionBean {
    
    private EntityManager em;
    
    public Questions find(Object id) {
        return (Questions) em.createNamedQuery("Questions.findByQuestionId").setParameter("questionId", id).getSingleResult();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
