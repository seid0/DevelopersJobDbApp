package com.company.service.inter;

import com.company.entity.Vacancy;

import java.util.List;

public interface VacancyServiceInter {
    public List<Vacancy> getAllVacancy(Integer id, String salary, String jobName, String city);

    public List<Vacancy> getAllVacancy(Vacancy vacancy);

    public Vacancy getById(int id);

    public boolean addVacancy(Vacancy vacancy);

    public boolean removeVacancy(int id);

    public boolean updateVacancy(Vacancy vacancy);
}