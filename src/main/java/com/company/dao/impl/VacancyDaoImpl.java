/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao.impl;

import com.company.dao.inter.VacancyDaoInter;
import com.company.entity.Vacancy;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Seid
 */
@Repository
@Qualifier("vacdao")
@Transactional
@Component
public class VacancyDaoImpl implements VacancyDaoInter {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Vacancy> getAllVacancy(Integer id, String salary, String jobName, String city) {
        String jpql = "select v from Vacancy v where 1=1";

        Query query = em.createQuery(jpql, Vacancy.class);

        return query.getResultList();
    }

    @Override
    public Vacancy getById(int id) {
        Vacancy vacancy = em.find(Vacancy.class, id);
        return vacancy;
    }

    @Override
    public boolean addVacancy(Vacancy vacancy) {
        em.persist(vacancy);
        return true;
    }

    @Override
    public boolean removeVacancy(int id) {
        Vacancy vacancy = em.find(Vacancy.class, id);
        return true;
    }

    @Override
    public boolean updateVacancy(Vacancy vacancy) {
        em.merge(vacancy);
        return true;
    }

    @Override
    public List<Vacancy> getAllVacancy(Vacancy vacancy) {
        String jpql = "select v from Vacancy v where 1=1";

        Query query = em.createQuery(jpql, Vacancy.class);
       

        return query.getResultList();
    }

}