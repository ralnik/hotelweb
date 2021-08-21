package ru.ralnik.hotelweb.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ralnik.hotelweb.core.db.entity.RoomTypes;
import ru.ralnik.hotelweb.core.db.repository.RoomTypesRepository;

import java.util.List;

@Service
public class RoomTypeService {
    @Autowired
    private RoomTypesRepository roomTypesRepository;

    public List<RoomTypes> getRoomTypeList() {
        return roomTypesRepository.findAll();
    }
}
