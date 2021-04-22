/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Danielmced
 */
@Service
public class WordListService {
    
    public String[] getWordList(){
        String[] lista = {"casa", "perro", "patito", "pelota", "computadora", "curso", "carrera", "carro", "elefante"};
        return lista;
    }
    
}
