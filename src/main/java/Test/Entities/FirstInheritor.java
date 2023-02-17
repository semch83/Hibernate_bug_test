package Test.Entities;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Type;


@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
@Data
@DiscriminatorValue("FIRST")
public class FirstInheritor extends Mother {
    @Type(JsonType.class)
    private Content content;
}
