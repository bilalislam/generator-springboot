package <%= packageName %>.repositories;
import <%= packageName %>.entities.<%= entityName %>;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface <%= entityName %>Repository extends MongoRepository<<%= entityName %>Document, String> {
 
    Optional<<%= entityName %>Document> findByExternalId(String externalId);
}
