
package examencinelitas;

import java.util.List;

public interface PeliculaService {

    List<Pelicula> getPeliculas();

    Pelicula getPelicula(Long id);

    Pelicula crearPelicula(Pelicula pelicula);

    void eliminarPelicula(Long id);

}