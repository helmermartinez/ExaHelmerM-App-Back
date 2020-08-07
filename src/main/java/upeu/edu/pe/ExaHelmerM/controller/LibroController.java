package upeu.edu.pe.ExaHelmerM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.ExaHelmerM.Entity.Libro;
import upeu.edu.pe.ExaHelmerM.Service.LibrosService;

@RestController
public class LibroController {

	@Autowired
	private LibrosService librosService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/libro")
	public List<Libro> listarL(){
		return librosService.listar();
	}
}
