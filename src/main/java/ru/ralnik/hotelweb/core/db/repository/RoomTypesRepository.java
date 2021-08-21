package ru.ralnik.hotelweb.core.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ralnik.hotelweb.core.db.entity.RoomTypes;

@Repository
public interface RoomTypesRepository extends JpaRepository<RoomTypes, Long> {
}
