package ma.medicalproduct.medicalproducts.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate orderDate;
    private Boolean isRenatale;
    private LocalDate DateRentalestarte;
    private LocalDate DateRentaleEnd;


}
