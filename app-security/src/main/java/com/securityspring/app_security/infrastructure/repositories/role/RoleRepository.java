package com.securityspring.app_security.infrastructure.repositories.role;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.securityspring.app_security.domain.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
    Optional<Role> findByName(String name);
}
