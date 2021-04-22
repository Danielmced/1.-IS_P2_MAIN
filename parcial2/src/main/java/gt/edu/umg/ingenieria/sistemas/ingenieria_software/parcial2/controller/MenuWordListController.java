/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Danielmced
 */
@Controller
public class MenuWordListController {

    @GetMapping("/menu")    
    public String viewSortMenu(Model model){
        return "menu";
    }
}
