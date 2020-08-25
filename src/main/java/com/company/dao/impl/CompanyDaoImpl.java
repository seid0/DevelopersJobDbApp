/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao.impl;

import com.company.entity.Company;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.company.dao.inter.CompanyDaoInter;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author Seid
 */
@Repository
@Transactional
@Qualifier("comdao")
@Component
public class CompanyDaoImpl implements CompanyDaoInter {

    @PersistenceContext
    EntityManager em;
    @Override
    public List<Company> getAll(Integer id, String companyName, String phone) {
        String jpql = "select c from Company c where 1=1";

        Query query = em.createQuery(jpql, Company.class);

        return query.getResultList();
        
    }

    @Override
    public Company getById(int id) {
        Company company = em.find(Company.class, id);
        return company;
    }
    private static BCryptPasswordEncoder crypt = new BCryptPasswordEncoder();

    @Override
    public boolean addCompany(Company company) {
        company.setPassword(crypt.encode(company.getPassword()));
        em.persist(company);
        return true;
    }

    @Override
    public boolean updateCompany(Company company) {
        em.merge(company);
        return true;
    }

    @Override
    public boolean removeCompany(int id) {
        Company company = em.find(Company.class, id);
        return true;
    }

}