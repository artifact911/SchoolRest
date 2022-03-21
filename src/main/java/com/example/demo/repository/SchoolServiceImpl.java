package com.example.demo.repository;

import com.example.demo.dao.SchoolDao;
import com.example.demo.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService{

    private final SchoolDao schoolDao;

    @Autowired
    public SchoolServiceImpl(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    @Override
    public List<School> getSchools() {
        return schoolDao.getSchools();
    }

    @Override
    public School getSchool(int id) {
        return schoolDao.getSchool(id);
    }
}
