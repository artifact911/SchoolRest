package com.example.demo.dao;

import com.example.demo.model.Pupil;
import com.example.demo.model.School;

import java.util.List;

public interface SchoolDao {

    List<School> getSchools();

    School getSchool(int id);

    List<Pupil> addPupil(int idSchool, Pupil pupil);

    List<Pupil> delPupil(int idSchool, int idPupil);



}
