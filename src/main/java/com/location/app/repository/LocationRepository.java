package com.location.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.location.app.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {

}
