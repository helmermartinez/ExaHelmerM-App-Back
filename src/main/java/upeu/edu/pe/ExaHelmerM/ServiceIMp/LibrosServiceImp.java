package upeu.edu.pe.ExaHelmerM.ServiceIMp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.ExaHelmerM.Dao.LibroDao;
import upeu.edu.pe.ExaHelmerM.Entity.Libro;
import upeu.edu.pe.ExaHelmerM.Service.LibrosService;

@Service
public class LibrosServiceImp  implements LibrosService{
	@Autowired
	private LibroDao libroDao;
	
	
	@Override
	public List<Libro> listar() {
		// TODO Auto-generated method stub
		return libroDao.listar();
	}

}
