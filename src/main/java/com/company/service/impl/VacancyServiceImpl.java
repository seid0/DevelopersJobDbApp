package com.company.service.impl;

import com.company.dao.inter.VacancyDaoInter;
import com.company.entity.Vacancy;
import com.company.service.inter.VacancyServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VacancyServiceImpl implements VacancyServiceInter {

    @Autowired
    private VacancyDaoInter vacancyDaoInter;

    @Override
    public List<Vacancy> getAllVacancy(Integer id, String salary, String jobName, String city) {
        return vacancyDaoInter.getAllVacancy(id,salary,jobName,city);
    }

    @Override
    public List<Vacancy> getAllVacancy(Vacancy vacancy) {
        return getAllVacancy(vacancy);
    }

    @Override
    public Vacancy getById(int id) {
        return vacancyDaoInter.getById(id);
    }

    @Override
    public boolean addVacancy(Vacancy vacancy ) {
        return vacancyDaoInter.addVacancy(vacancy);
    }

    @Override
    public boolean removeVacancy(int id) {
        return vacancyDaoInter.removeVacancy(id);
    }

    @Override
    public boolean updateVacancy(Vacancy vacancy) {
        return vacancyDaoInter.updateVacancy(vacancy);
    }
}