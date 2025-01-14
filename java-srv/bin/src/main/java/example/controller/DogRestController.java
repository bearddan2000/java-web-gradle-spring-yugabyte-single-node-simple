package example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.PostConstruct;
import java.util.*;

import example.model.Dog;
import example.repository.*;

@RestController
public class DogRestController {

	@Autowired
	private DogRepository dogRepository;

	@PostConstruct
	private void init()
	{
	    List<Dog> list = new ArrayList<Dog>() {{
		    add(new Dog(1, "Am Bulldog", "White"));
		    add(new Dog(2, "Foxhound", "Red"));
		    add(new Dog(3, "Gr Shepard", "Black"));
			}};
			dogRepository.saveAll(list);
	}

	@RequestMapping(path="/dogs", method=RequestMethod.GET)
	public Iterable<Dog> getAllDogs(){
		return dogRepository.findAll();
	}
}