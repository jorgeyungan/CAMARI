/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.camariweb.controlador;


import ec.org.camariweb.entidades.clsFactura;
import ec.org.camariweb.funciones.crudFactura;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class cFacturas {
    private List<clsFactura> lista;
    private clsFactura newfactura;//ingrese un priente nuevo
    private clsFactura selectedfactura;//cuando seleccione un cliente para borrar o actualizar
    

    public cFacturas() {
        newfactura = new clsFactura();
        cargardatos();
    }
    private void cargardatos(){
        lista = crudFactura.findbyAll();
    }
    private void insertar(){
        if (crudFactura.save(newfactura)) {//guarda el cliente
            newfactura = new clsFactura();//prepara el contructor de un posible nuevo cliente
            cargardatos();//refresca el datagrid con los cambios (aparrece el nuevo cliente)
            //mostrar un mensaje
        }
        else{
            //mostrar un mensaje de no guardado
        }
    }
    
    private void eliminar(){
        if (crudFactura.delete(selectedfactura)) {
            newfactura = new clsFactura();//prepara el contructor de un posible nuevo cliente
            cargardatos();//refresca el data grid
            //mostrar un mensaje
        }
        else{
            //mostrar un mensaje de no guardado
        }
    }
    
    private void actualizar(){
        if (crudFactura.delete(selectedfactura)) {
            newfactura = new clsFactura();//prepara el contructor de un posible nuevo cliente
            cargardatos();//refresca el data grid
            //mostrar un mensaje
        }
        else{
            //mostrar un mensaje de no guardado
        }
    }

    public List<clsFactura> getLista() {
        return lista;
    }

    public void setLista(List<clsFactura> lista) {
        this.lista = lista;
    }

    public clsFactura getNewfactura() {
        return newfactura;
    }

    public void setNewfactura(clsFactura newfactura) {
        this.newfactura = newfactura;
    }

    public clsFactura getSelectedfactura() {
        return selectedfactura;
    }

    public void setSelectedfactura(clsFactura selectedfactura) {
        this.selectedfactura = selectedfactura;
    }
    

    
}
