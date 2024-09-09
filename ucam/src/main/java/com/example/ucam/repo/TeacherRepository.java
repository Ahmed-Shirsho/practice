package com.example.ucam.repo;

import com.example.ucam.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {

    Optional<Teacher> findByUsername(Long aLong);
}
