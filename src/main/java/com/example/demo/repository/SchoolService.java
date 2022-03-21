package com.example.demo.repository;

import com.example.demo.dao.SchoolDao;
import com.example.demo.model.School;

import java.util.List;

public interface SchoolService {

    List<School> getSchools();

    School getSchool(int id);




}
