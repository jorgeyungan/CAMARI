
package ec.org.camariweb.controlador;

import ec.org.camariweb.entidades.clsCliente;
import ec.org.camariweb.funciones.crudCliente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class cCliente {
    private List<clsCliente> lista;
    private clsCliente newcliente;//ingrese un priente nuevo
    private clsCliente selectedcleinte;//cuando seleccione un cliente para borrar o actualizar
    

    private void cargarDatos(){
        lista=crudCliente.findbyAll();
    }
    
    public cCliente() {
        newcliente = new clsCliente();
        cargarDatos();    
    }
    
    private void insertar(){
        if (crudCliente.save(newcliente)) {//guarda el cliente
            newcliente = new clsCliente();//prepara el contructor de un posible nuevo cliente
            cargarDatos();//refresca el datagrid con los cambios (aparrece el nuevo cliente)
            //mostrar un mensaje
        }
        else{
            //mostrar un mensaje de no guardado
        }
    }
    
    private void eliminar(){
        if (crudCliente.delete(selectedcleinte)) {
            newcliente = new clsCliente();//prepara el contructor de un posible nuevo cliente
            cargarDatos();//refresca el data grid
            //mostrar un mensaje
        }
        else{
            //mostrar un mensaje de no guardado
        }
    }
    
    private void actualizar(){
        if (crudCliente.delete(selectedcleinte)) {
            newcliente = new clsCliente();//prepara el contructor de un posible nuevo cliente
            cargarDatos();//refresca el data grid
            //mostrar un mensaje
        }
        else{
            //mostrar un mensaje de no guardado
        }
    }

    public List<clsCliente> getLista() {
        return lista;
    }

    public void setLista(List<clsCliente> lista) {
        this.lista = lista;
    }

    public clsCliente getNewcliente() {
        return newcliente;
    }

    public void setNewcliente(clsCliente newcliente) {
        this.newcliente = newcliente;
    }

    public clsCliente getSelectedcleinte() {
        return selectedcleinte;
    }

    public void setSelectedcleinte(clsCliente selectedcleinte) {
        this.selectedcleinte = selectedcleinte;
    }
    
}
