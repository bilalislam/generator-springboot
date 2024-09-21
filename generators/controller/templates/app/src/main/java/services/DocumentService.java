package <%= packageName %>.services;

import <%= packageName %>.entities.<%= entityName %>;
import <%= packageName %>.exception.<%= entityName %>NotFoundException;
import <%= packageName %>.repositories.<%= entityName %>DocumentRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class <%= entityName %>DocumentService {

    private final <%= entityName %>Repository <%= entityVarName %>Repository;
    public void get(String id) {
        return <%= entityName %>Repository.findById(id)
                .orElseThrow(NotFoundException::new);
    }
}
