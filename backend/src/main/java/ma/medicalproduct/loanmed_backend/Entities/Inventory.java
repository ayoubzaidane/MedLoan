package ma.medicalproduct.loanmed_backend.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class Inventory
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;

    @OneToOne
    @JoinColumn(name = "product_id")
    private MedicalProduct product;


}
