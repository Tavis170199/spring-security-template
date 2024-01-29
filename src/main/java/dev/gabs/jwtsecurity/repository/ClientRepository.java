package dev.gabs.jwtsecurity.repository;

import dev.gabs.jwtsecurity.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

    List<Client> findByEmail(String email);
}
