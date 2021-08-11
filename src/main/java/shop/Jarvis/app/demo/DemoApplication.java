package shop.Jarvis.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shop.Jarvis.app.demo.calculator.entity.User;
import shop.Jarvis.app.demo.calculator.repository.UserRepository;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		userRepository.save(new User("aa","장영실","aa@","1"));
		userRepository.save(new User("bb","장영실","bb@","1"));
		userRepository.save(new User("cc","전우치","cc@","1"));

		List<User> users = userRepository.findAll();
		for(User u: users){
			System.out.println(u.toString());
		}
		System.out.println("장영실만 출력");
		for(User u:userRepository.findAllByName("장영실")){
			System.out.println(u.toString());
		}
	}
}

