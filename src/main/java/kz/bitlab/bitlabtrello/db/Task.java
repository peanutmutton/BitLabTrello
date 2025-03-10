package kz.bitlab.bitlabtrello.db;

import jakarta.persistence.*;
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
    private Long id;

    private String title;

    private String description; // TEXT

    private int status; // 0 - todo, 1 - intest, 2 - done, 3 - failed

    public Task(String title, String description, int status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    @ManyToOne
    private Folder folder; // Many To One
}
