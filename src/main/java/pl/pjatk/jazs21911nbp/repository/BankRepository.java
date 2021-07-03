package pl.pjatk.jazs21911nbp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.jazs21911nbp.model.Root;
@Repository
public interface BankRepository extends JpaRepository<Root, Long> {
}
