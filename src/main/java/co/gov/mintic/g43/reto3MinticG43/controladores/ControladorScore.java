/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package co.gov.mintic.g43.reto3MinticG43.controladores;

import co.gov.mintic.g43.reto3MinticG43.entidades.Score;
import co.gov.mintic.g43.reto3MinticG43.servicios.ScoreServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Lineth
 */
@RestController
@RequestMapping("/api")
public class ControladorScore {
    @Autowired
    ScoreServicio scoreServicio;
            
    @GetMapping("/Score/all")
    public List<Score> buscartodo() {
        return scoreServicio.buscarTodoScore();
    }
    
    @GetMapping("/Score/{id}")
    public Score get(@PathVariable("id") Long id) {
        return scoreServicio.buscarpoidScore(id);
    }
    
    @PostMapping("/Score/save")
    public ResponseEntity post(@RequestBody Score score) {
        scoreServicio.guardarScore(score);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/Score/update")
    public ResponseEntity put(@RequestBody Score score) {
        scoreServicio.guardarScore(score);
        return ResponseEntity.status(201).build();
    }
    
    
    @DeleteMapping("/Score/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) {
        scoreServicio.eliminaridScore(id);
        return ResponseEntity.status(204).build();
    }
}
