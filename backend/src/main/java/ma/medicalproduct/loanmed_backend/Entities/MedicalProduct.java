package ma.medicalproduct.loanmed_backend.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class MedicalProduct
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal dailyRate;
    private String serialNumber;

    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
