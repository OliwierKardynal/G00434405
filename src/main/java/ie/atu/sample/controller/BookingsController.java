package ie.atu.sample.controller;

import ie.atu.sample.model.Room;
import ie.atu.sample.repository.BookingRepository;
import ie.atu.sample.repository.RoomRepository;
import jakarta.validation.Valid;
import org.apache.catalina.connector.Request;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingsController {
    private final BookingRepository bookingRepository;

    public BookingsController(BookingRepository bookingRepositoryRepository) {
        this.bookingRepository = bookingRepositoryRepository;
    }

    @GetMapping
    public List<Bookings> getAll(){
        return BookingService.bookings;
    }
    @PostMapping
    @ResponseStatus.CREATED(public Bookings create @Valid @RequestBody Create Booking Request request;){
        return bookingRepository.getBookingsByBooking_id;
    }

}
