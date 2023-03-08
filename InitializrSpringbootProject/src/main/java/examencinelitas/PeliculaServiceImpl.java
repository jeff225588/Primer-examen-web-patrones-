
package examencinelitas;

import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class PeliculaServiceImpl implements PeliculaService {

    private final PeliculaRepository peliculaRepository;
    private final SalaRepository salaRepository;

    public PeliculaServiceImpl(PeliculaRepository peliculaRepository, SalaRepository salaRepository) {
        this.peliculaRepository = peliculaRepository;
        this.salaRepository = salaRepository;
    }

    @Override
    public List<Pelicula> getPeliculas() {
        return peliculaRepository.findAll();
    }

    @Override
    public Pelicula getPelicula(Long id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public Pelicula crearPelicula(Pelicula pelicula) {
        Sala sala = salaRepository.findById(pelicula.getSala().getId()).orElse(null);
        
        return null;
    }

    @Override
    public void eliminarPelicula(Long id) {
        peliculaRepository.deleteById(id);
    }

}