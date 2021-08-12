package shop.Jarvis.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import shop.Jarvis.app.demo.calculator.entity.Item;
import shop.Jarvis.app.demo.calculator.entity.User;
import shop.Jarvis.app.demo.calculator.repository.ItemRepository;
import shop.Jarvis.app.demo.calculator.repository.UserRepository;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("########## Application START ##########");
		userRepository.deleteAll();
		userRepository.save(new User(1, "a", "Alice", "a@a", "1", new Date()));
		userRepository.save(new User(2,"b", "Bob", "b@b", "1", new Date()));
		userRepository.save(new User(3, "c", "Bob", "c@c", "1",new Date()));
		List<User> users = userRepository.findAll();
		System.out.println("Print All Users");
		for (User u : users) {
			System.out.println(u.toString());
		}
		System.out.println("Print Only Bob");
		for (User u : userRepository.findAllByName("Bob")) {
			System.out.println(u.toString());
		}
		itemRepository.deleteAll();
		itemRepository.save(new Item(1,"갤럭시Z",100,"신제품 2021",new Date()));
		itemRepository.save(new Item(2,"노트북",200,"지문인식",new Date()));
		itemRepository.save(new Item(3,"데스크탑",300,"게이밍",new Date()));

	}
}

