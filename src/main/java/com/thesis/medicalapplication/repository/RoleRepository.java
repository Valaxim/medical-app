package com.thesis.medicalapplication.repository;

import com.thesis.medicalapplication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByRoleDescription(String roleDescription);
}
