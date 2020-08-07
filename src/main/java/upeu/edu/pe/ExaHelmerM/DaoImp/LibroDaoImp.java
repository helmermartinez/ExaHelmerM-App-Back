package upeu.edu.pe.ExaHelmerM.DaoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.ExaHelmerM.Dao.LibroDao;
import upeu.edu.pe.ExaHelmerM.Entity.Libro;

@Repository
public class LibroDaoImp implements LibroDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<Libro> listar() {

		String sql = "select * from libros";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Libro.class));
	}

}
