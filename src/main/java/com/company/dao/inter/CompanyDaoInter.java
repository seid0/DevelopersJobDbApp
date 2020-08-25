/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao.inter;

import com.company.entity.Company;

import java.util.List;

/**
 *
 * @author Seid
 */
public interface CompanyDaoInter {

    public List<Company> getAll(Integer id, String companyName, String phone);
        
    public Company getById(int id);

    public boolean addCompany(Company company);

    public boolean updateCompany(Company company);

    public boolean removeCompany(int id);
    
    
}