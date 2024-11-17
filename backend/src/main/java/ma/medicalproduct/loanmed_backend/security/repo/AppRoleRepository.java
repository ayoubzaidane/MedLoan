package ma.medicalproduct.loanmed_backend.security.repo;

import ma.medicalproduct.loanmed_backend.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,String>
{
    AppRole findByRole(String role);
}
