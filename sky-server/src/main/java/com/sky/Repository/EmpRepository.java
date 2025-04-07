package com.sky.Repository;

import com.sky.entity.Employee;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<Employee, Long>, JpaSpecificationExecutor<Employee> {
    boolean existsByusername(String username);
}
