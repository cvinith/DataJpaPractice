package com.Vinith.DataJpaPractice.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Vinith.DataJpaPractice.Model.Aliean;



public interface AlienRepo extends JpaRepository<Aliean, Integer> {
//finding Alien by name	
 public Aliean findByAname(String name);
 //finding List of Alien Greater than given id
 public List<Aliean> findByAidGreaterThan(int aid);
 

 

}
