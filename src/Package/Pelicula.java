package Package;

import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("54516c5b-692e-4fcd-a132-4323c419282e")
public class Pelicula {
    @objid ("e25e12f5-8cbe-4b05-bbd4-11d1e0f9ae52")
    private int titulo;

    @objid ("db054946-3c5d-477e-9b26-3f48a04c7a55")
    private Date añoProduccion;

    @objid ("ad4bbf45-708f-4382-aa49-05e6ecf408f9")
    private String genero;

    @objid ("1dd2ca7c-f33b-4b5e-b37c-5a8b4bb397f2")
    private String pais;

    @objid ("144115ae-02ba-4650-b870-3dd0a9cafa57")
    private String stock;

    @objid ("6d191c8a-780e-4ec0-8a42-d64e8c8ded97")
    private int codigo;

    @objid ("35533520-1a9a-4203-910a-cbb65e4d9344")
    public String compararCodigo(final String CodPel) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("0e90e056-2a25-4328-91bb-f668c95fc433")
    public void disminuirStock(final String unidades) {
    }

    @objid ("516d202b-41b9-4c22-896b-ed75534ffb1a")
    public void aunmentarStock(final int unidades) {
    }

    @objid ("c38bd954-f19e-47bd-bf1b-dcad8d5ef2b3")
    public int getStock() {
        // TODO Auto-generated return
        return 0;
    }

}
