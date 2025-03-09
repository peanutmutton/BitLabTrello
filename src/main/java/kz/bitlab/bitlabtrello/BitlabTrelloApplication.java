package kz.bitlab.bitlabtrello;

import kz.bitlab.bitlabtrello.db.Task;
import kz.bitlab.bitlabtrello.db.TaskRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BitlabTrelloApplication {


    private static final Logger log = LoggerFactory.getLogger(BitlabTrelloApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BitlabTrelloApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(TaskRepository repository) {
        return (args) -> {
            //save several tasks
            repository.save(new Task( "feed the fishes", "throw food into the aquarium", 1));
            repository.save(new Task("mow the lawn", "get the lawnmower, turn it on and walk around", 0));

            //fetch all tasks
            log.info("Tasks found with findAll():");
            log.info("=--------------------------");
            repository.findAll().forEach(task -> {
                log.info(task.toString());
            });
            log.info("");

            //fetch an individual task by ID
            Task task = repository.findById(1L);
            log.info("Task found with findById(1L):");
            log.info("-----------------------------");
            log.info(task.toString());
            log.info("");

            //fetch a list of tasks by title
            List<Task> tasks = repository.findByTitle("feed the fishes");
            log.info("Tasks fouund with findByTitle('feed the fishes')");
            log.info("-----------------------------");
            for(Task task1 : tasks ){
                log.info(task1.toString());
                log.info("");
            }


        };
    }

}
