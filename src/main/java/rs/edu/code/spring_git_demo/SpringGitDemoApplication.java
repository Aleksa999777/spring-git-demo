package rs.edu.code.spring_git_demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class SpringGitDemoApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringGitDemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Runnable runnableObject = () -> System.out.println("Executing runnable in thread!: " + Thread.currentThread().getName());
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(runnableObject);
		


	}
}
