package sk.macuska.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.macuska.shop.model.TShirt;

@Repository
public interface TShirtRepository extends JpaRepository<TShirt, Integer> {

}
