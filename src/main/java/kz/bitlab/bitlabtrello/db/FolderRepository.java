package kz.bitlab.bitlabtrello.db;

import org.springframework.data.repository.CrudRepository;

public interface FolderRepository extends CrudRepository<Folder, Long> {

    Folder findById(long id);
}
