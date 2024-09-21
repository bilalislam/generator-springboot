package <%= packageName %>.entities;

import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("<%= tableName %>")
public class <%= entityName %>Document {

    @Id
    private String id;

    @Version
    private Long version;

    @Field(name = "created_date")
    @CreatedDate
    private Date createdDate;

    @Field(name = "last_modified_date")
    @LastModifiedDate
    private Date lastModifiedDate;
}
