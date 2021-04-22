/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repair.gt.edu.umg.ingenieria_software.parcial2.controller;

import repair.gt.edu.umg.ingenieria_software.parcial2.service.WordListService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.service.GnomeSortService;

/**
 *
 * @author Danielmced
 */
@Controller
public class GnomeSortController {
    
    
    @Autowired
    private WordListService wordList;
    
    @Autowired
    private GnomeSortService gnome;
    
    @GetMapping("/gnome")
    @ResponseBody
    public String viewGnomeSort(){
        return Arrays.toString(gnome.gnomeSort(wordList.getWordList()));        
    }
}
