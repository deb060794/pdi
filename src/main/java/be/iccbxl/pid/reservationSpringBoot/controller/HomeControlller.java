package be.iccbxl.pid.reservationSpringBoot.controller;

import be.iccbxl.pid.reservationSpringBoot.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class HomeControlller {
    @Autowired
    ShowService service;
    @GetMapping("/")
    public String index(Model model) {

            List<Show> shows = service.getAll();

            model.addAttribute("shows",shows);
            model.addAttribute("title", "Liste des spectacles");
            return "index";
        }

    }
