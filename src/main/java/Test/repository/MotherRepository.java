package Test.repository;

import Test.Entities.Mother;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherRepository extends JpaRepository<Mother, Integer>{
}
