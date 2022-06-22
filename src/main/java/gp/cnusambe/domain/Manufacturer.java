package gp.cnusambe.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Manufacturer {
    @Id
    @Column(length = 10, nullable = false, unique = true)
    private String manufacturer;
}
