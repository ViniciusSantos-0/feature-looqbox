package com.looqbok.feature.repository;

import com.looqbok.feature.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends MongoRepository<Project, Long> {

    @Override
    Optional<Project> findById(Long aLong);

    @Override
    Page<Project> findAll(Pageable pageable);
}
