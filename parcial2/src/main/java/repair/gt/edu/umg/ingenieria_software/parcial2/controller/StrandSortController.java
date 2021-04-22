/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repair.gt.edu.umg.ingenieria_software.parcial2.controller;

import repair.gt.edu.umg.ingenieria_software.parcial2.service.WordListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Danielmced
 */
@Controller
public class StrandSortController {
    
    @Autowired
    private WordListService wordList;
    
    @GetMapping("/strand")
    @ResponseBody
    public String viewStrandSort(){
        return "pendiente";
    }
    
}
