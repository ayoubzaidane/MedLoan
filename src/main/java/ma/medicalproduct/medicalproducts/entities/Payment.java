package ma.medicalproduct.medicalproducts.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate paymentdate;
    private double amount;
    @Enumerated(EnumType.STRING)
    private paymentMethode paymentMethode;
}
