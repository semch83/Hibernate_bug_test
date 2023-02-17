package Test.Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class Content {
    private String text;
}
