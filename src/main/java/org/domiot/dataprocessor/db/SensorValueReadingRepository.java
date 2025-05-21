package org.domiot.dataprocessor.db;

import org.lankheet.domiot.entities.SensorValueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorValueReadingRepository extends JpaRepository<SensorValueEntity, Long> {
}
