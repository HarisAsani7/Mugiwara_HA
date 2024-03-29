/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.acrm.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rocks.process.acrm.data.domain.Coach;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {
	Coach findByEmail(String email);
	Coach findByEmailAndIdNot(String email, Long agentId);
}
