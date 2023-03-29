package be.iccbxl.pid.reservationSpringBoot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="artists")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "The firstname must not be empty.")
    @Size(min=2, max=60, message = "The firstname must be between 2 and 60 characters long.")
    private String firstname;
    @NotEmpty(message = "The lastname must not be empty.")
    @Size(min=2, max=60, message = "The firstname must be between 2 and 60 characters long.")
    private String lastname;
}
