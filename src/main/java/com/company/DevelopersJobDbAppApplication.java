package com.company;

import com.company.dao.inter.UserDaoInter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import com.company.dao.inter.VacancyDaoInter;
import com.company.entity.User;
import com.company.entity.Vacancy;

@SpringBootApplication
@EnableCaching
public class DevelopersJobDbAppApplication {

//    @Autowired
//    private CompanyDaoInter companyDaoInter;

     @Autowired
     private UserDaoInter userDaoInter;
    public static void main(String[] args) {
        SpringApplication.run(DevelopersJobDbAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        CommandLineRunner clr = new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {
                List<User> user = userDaoInter.getAll(null, null);

                System.out.println("list size=" + user.size());
            }
        };
        return clr;

    }
}
