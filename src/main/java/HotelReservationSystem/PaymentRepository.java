package HotelReservationSystem;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaymentRepository extends PagingAndSortingRepository<Payment, Long>{

    Payment findByReservationId(Long reservationId);
}