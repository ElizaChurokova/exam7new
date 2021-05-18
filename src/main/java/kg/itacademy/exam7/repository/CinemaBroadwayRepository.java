package kg.itacademy.exam7.repository;

import kg.itacademy.exam7.entity.CinemaBroadway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaBroadwayRepository extends JpaRepository<CinemaBroadway, Long> {
}
