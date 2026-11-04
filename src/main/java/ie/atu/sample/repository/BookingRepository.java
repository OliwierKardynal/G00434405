package ie.atu.sample.repository;

import ie.atu.sample.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
@Query("""
SELECT B
FROM Booking B
JOIN B.booking_id c
WHERE LOWER(c.booking_id)=LOWER(:organizer_name)
ORDER BY b.organizer_name ASC 
""")

@Query("""
SELECT B
FROM Booking B
JOIN B.booking_id c
WHERE B.attendees
ORDER BY b.attendees ASC 
""")