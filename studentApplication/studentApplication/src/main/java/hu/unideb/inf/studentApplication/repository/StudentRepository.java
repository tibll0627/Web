package hu.unideb.inf.studentApplication.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.unideb.inf.studentApplication.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findById(long id);

    List<Student> findByName(String name);

    List<Student> findByNameContaining(String name);

    List<Student> findByEmail(String email);

    List<Student> findByEmailContaining(String email);
}
