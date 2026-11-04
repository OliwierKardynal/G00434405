package ie.atu.sample.service;

import ie.atu.sample.dto.CreateBookingRequest;
import ie.atu.sample.model.Booking;
import ie.atu.sample.repository.BookingRepository;
import ie.atu.sample.repository.RoomRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class bookingsService {
    private final BookingRepository bookingRepository;
    private final RoomRepository roomRepository;
    public bookingsService(BookingRepository bookingRepository, RoomRepository roomRepository) {}
    public BookingRepository getBookingRepository() {
        return bookingRepository;
    }

    public bookingsService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
        this.bookingRepository.deleteAll();
    }
}
public List<Bookings> getAll(){
    return repository.findAll();}

public Booking create Booking(CreateBookingRequest request){
    Booking booking = BookingRepository
            .findById(request.id()). orElseThrow())-> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Booking Not Found");
    Booking booking = new Booking();
    Booking.setName(request.name()){
        return booking.save(booking);
    }
    Booking.setId(request.id()) {
        return booking.save(booking);
    }
    Booking.setAttendees(request.attendees()) {
        return booking.save(booking);
    }
}

