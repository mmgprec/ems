package com.empsys.ems.manager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empsys.ems.employee.Employee;

@Repository
public interface ManagerRepository extends JpaRepository<Employee, Integer> {}
