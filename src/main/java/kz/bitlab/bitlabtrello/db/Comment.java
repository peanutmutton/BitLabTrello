package kz.bitlab.bitlabtrello.db;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String comment;

    @ManyToOne
    @JoinColumn(name = "task_id")
    Task task;

    public Comment(String comment, Task task) {
        this.comment = comment;
        this.task = task;
    }
}
