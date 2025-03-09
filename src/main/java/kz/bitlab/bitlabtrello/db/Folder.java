package kz.bitlab.bitlabtrello.db;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Folder {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

    @ManyToMany
    List<TaskCategory> categories;
}
