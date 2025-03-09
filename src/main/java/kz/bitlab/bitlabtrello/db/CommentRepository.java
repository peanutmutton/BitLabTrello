package kz.bitlab.bitlabtrello.db;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {


    Comment findById(long id);
}
