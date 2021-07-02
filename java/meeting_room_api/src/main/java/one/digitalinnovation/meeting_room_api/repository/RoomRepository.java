package one.digitalinnovation.meeting_room_api.repository;

import one.digitalinnovation.meeting_room_api.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
