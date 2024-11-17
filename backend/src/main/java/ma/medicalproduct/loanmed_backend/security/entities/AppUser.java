package ma.medicalproduct.loanmed_backend.security.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class AppUser
{
    @Id
    private String userId;

    @Column(unique = true)
    private String username;

    private String password;
    private String email;

    @ManyToMany(fetch= FetchType.EAGER)
    private List<AppRole> roles;
}
