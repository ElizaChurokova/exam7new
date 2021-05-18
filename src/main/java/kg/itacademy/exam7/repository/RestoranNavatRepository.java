package kg.itacademy.exam7.repository;

import kg.itacademy.exam7.entity.RestoranNavat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestoranNavatRepository extends JpaRepository<RestoranNavat, Long> {
}
