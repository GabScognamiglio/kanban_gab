package it.gabdev.kanban_gab.repository;

import it.gabdev.kanban_gab.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    User findByUid(String uid);

    boolean existsByUid(String uid);
}
