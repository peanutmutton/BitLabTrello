package kz.bitlab.bitlabtrello.db;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "task_categories")
public class TaskCategory {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "folders_to_categories",
            joinColumns = @JoinColumn(name = "taskcategory_id"),
            inverseJoinColumns = @JoinColumn(name = "folder_id")
    )
    private List<Folder> foldersInCategories;

    public TaskCategory(String name) {
        this.name = name;
    }
}
