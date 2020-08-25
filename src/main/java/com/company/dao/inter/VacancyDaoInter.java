/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao.inter;

import com.company.entity.Vacancy;

import java.util.List;

/**
 *
 * @author Seid
 */
public interface VacancyDaoInter {

    public List<Vacancy> getAllVacancy(Integer id, String salary, String jobName, String city);
   
    public List<Vacancy> getAllVacancy(Vacancy vacancy);

    public Vacancy getById(int id);

    public boolean addVacancy(Vacancy vacancy);

    public boolean removeVacancy(int id);

    public boolean updateVacancy(Vacancy vacancy);

}