package com.example.project.repository;

public interface DriverRepository extends JpaRepository<Driver, Long> {

    List<Driver> findAllByLastName(String text);

}
