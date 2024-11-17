package ma.medicalproduct.loanmed_backend.security.repo;

import ma.medicalproduct.loanmed_backend.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String>
{
    AppUser findByUsername(String username);


}
