package me.dio.domain.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import me.dio.domain.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
