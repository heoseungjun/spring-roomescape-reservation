package roomescape.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roomescape.model.ReservationTime;
import roomescape.repository.ReservationRepository;
import roomescape.repository.ReservationTimeRepository;

import java.util.List;

@Service
public class ReservationTimeService {

    private final ReservationTimeRepository reservationTimeRepository;

    @Autowired
    public ReservationTimeService(ReservationTimeRepository reservationTimeRepository) {
        this.reservationTimeRepository = reservationTimeRepository;
    }

    public Long addReservationTime(ReservationTime reservationTime) {
        return reservationTimeRepository.save(reservationTime);
    }

    public List<ReservationTime> lookUpReservationTime() {
        return reservationTimeRepository.readAll();
    }

    public void deleteReservationTime(Long id) {
        reservationTimeRepository.deleteById(id);
    }
}
