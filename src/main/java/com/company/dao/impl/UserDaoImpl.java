/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.UserDaoInter;
import com.company.entity.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Seid
 */
@Repository
public class UserDaoImpl extends AbstractDao implements UserDaoInter {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<User> getAll(String name, String surname) {
        String jpql = "select u from USER where 1=1";
        Query query = em.createNamedQuery(jpql, User.class);
        return query.getResultList();
    }

    @Override
    public User getById(int id) {
        User u = em.find(User.class, id);
        return u;
    }
    private static BCryptPasswordEncoder crypt = new BCryptPasswordEncoder();

    @Override
    public boolean addUser(User u) {
        u.setPassword(crypt.encode(u.getPassword()));
        em.persist(u);
        return true;
    }

    @Override
    public boolean updateUser(User u) {
        em.merge(u);
        return true;

    }

    @Override
    public boolean removeUser(int id) {
        User u = em.find(User.class, id);
        em.remove(id);
        return true;
    }

   

}
