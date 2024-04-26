package Package;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1c1f97da-7019-48d0-aa4f-6bd34ed0ee30")
public class Videoclub {
    @objid ("5523ef76-ec5e-43fc-b2d0-d2912417acc4")
    public List<Pelicula> pelicula = new ArrayList<Pelicula> ();

    @objid ("cf9fad35-fa89-4441-a31c-6a3393f39d3d")
    public void alquilar(final int pelicula) {
    }

    @objid ("d499cbd8-4fa6-458d-adb5-f2038f7d09a1")
    public void devolver(final int pelicula) {
    }

}
