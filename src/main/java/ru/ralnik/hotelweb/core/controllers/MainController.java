package ru.ralnik.hotelweb.core.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.ralnik.hotelweb.core.db.entity.RoomTypes;
import ru.ralnik.hotelweb.core.services.RoomTypeService;

import java.util.List;

@Controller
@Slf4j
public class MainController {
    @Autowired
    private RoomTypeService roomTypeService;

    @RequestMapping("/getRoomTypeList")
    public String home() {
        List<RoomTypes> roomTypeList = roomTypeService.getRoomTypeList();
//        ModelAndView mav = new ModelAndView("index");
//        mav.addObject("listCustomer", listCustomer);
        for (RoomTypes roomTypes : roomTypeList) {
            log.debug(roomTypes.toString());
        }
        return "";
    }
}
