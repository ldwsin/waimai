package com.sky.Specification;

import com.sky.entity.Employee;
import org.springframework.data.jpa.domain.Specification;

public class empSpecification {
    public static Specification<Employee> nameContaion(String name){
        return (root, query, criteriaBuilder) -> {
            if (name != null){
                return criteriaBuilder.like(root.get("name"),"%"+name+"%");
            }
            return null;
        };
    }
}
