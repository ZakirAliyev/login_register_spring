package edu.cs.loginregister.login_register_app.repository;

import edu.cs.loginregister.login_register_app.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<Human, Long> {
}
