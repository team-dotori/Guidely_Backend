package dotori.guidely.domain.declaration.repository;

import dotori.guidely.domain.declaration.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LocationRepository extends JpaRepository<Location,Long> {
    Optional<Location> findByLatitudeAndLongitude(double latitude,double longitude);

}
