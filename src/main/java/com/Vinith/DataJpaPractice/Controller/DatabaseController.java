package com.Vinith.DataJpaPractice.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Vinith.DataJpaPractice.Model.Aliean;
import com.Vinith.DataJpaPractice.Repository.AlienRepo;

@RestController
public class DatabaseController {
    @Autowired
	AlienRepo repo;
    
    @GetMapping("aliens")
    public List<Aliean> getAliens(){
    	return repo.findAll();
    }
    
    @GetMapping("aliens/{aid}")
    public Optional<Aliean> getAlien(@PathVariable("aid") int aid){
    	return repo.findById(aid);
    }
    
    @PostMapping("aliens")
    public Aliean addAliean(@RequestBody Aliean alien) {
    	repo.save(alien);
    	return alien;
    }
    
    @PutMapping("aliens")
    public Aliean updateAliean(@RequestBody Aliean alien) {
    	repo.save(alien);
    	return alien;
    }
    
    @DeleteMapping("aliens/{aid}")
    public String deleteAliean(@PathVariable("aid") int aid) {
    	repo.deleteById(aid);
    	return "deleted";
    }
    
	
	
}
