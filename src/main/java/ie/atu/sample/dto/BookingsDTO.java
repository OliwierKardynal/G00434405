package ie.atu.sample.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

public record CreateBookingRequest(
        @NotBlank Long id,
        @NotBlank String name,
        @NotNull @Positive int attendees)
{}

public class BookingsDTO {
}
