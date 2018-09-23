package it.quix.puma.pumaspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.quix.puma.pumaspring.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

}
