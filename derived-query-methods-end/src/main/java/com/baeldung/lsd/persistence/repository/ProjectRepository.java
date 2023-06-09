package com.baeldung.lsd.persistence.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.baeldung.lsd.persistence.model.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    Optional<Project> findByCodeEquals(String code);

    int countByName(String name);
}
