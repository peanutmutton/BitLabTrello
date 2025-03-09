package kz.bitlab.bitlabtrello.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Task")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Override
    public String toString() {
        return String.format(
                "Task[id=%d, title='%s', description='%s']",
                id, title, description
        );
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

 String title;

String description; // TEXT

 int status; // 0 - todo, 1 - intest, 2 - done, 3 - failed

    public Task(String title, String description, int status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    // Folders folder; // Many To One
}
