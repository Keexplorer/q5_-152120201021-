package q5.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import q5.example.demo.Entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test,Long> {
}
