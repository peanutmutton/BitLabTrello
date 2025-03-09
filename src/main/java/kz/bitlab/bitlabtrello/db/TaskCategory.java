package kz.bitlab.bitlabtrello.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TaskCategory {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;
    String name;

    public TaskCategory(String name) {
        this.name = name;
    }
}
