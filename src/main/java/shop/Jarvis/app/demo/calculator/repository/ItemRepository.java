package shop.Jarvis.app.demo.calculator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import shop.Jarvis.app.demo.calculator.entity.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, Long> {
}
