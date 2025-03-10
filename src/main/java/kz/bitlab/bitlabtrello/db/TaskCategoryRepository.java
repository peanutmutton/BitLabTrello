package kz.bitlab.bitlabtrello.db;

import org.springframework.data.repository.CrudRepository;

public interface TaskCategoryRepository extends CrudRepository<TaskCategory, Long> {

    TaskCategory findById(long id);
}
