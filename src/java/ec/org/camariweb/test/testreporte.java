
package ec.org.camariweb.test;

import ec.org.camariweb.entidades.clsDfacpro;
import ec.org.camariweb.entidades.clsFactura;
import ec.org.camariweb.funciones.clsReportes;
import java.util.ArrayList;

public class testreporte {
    
    //psvm tab tab
public static void main(String[] args) {
    
    ArrayList<clsFactura> factura = new ArrayList<>();
    factura = clsReportes.clientefacturamayormil();
    System.out.print(factura.toString());

    ArrayList<clsFactura> sumacompra = new ArrayList<>();
    sumacompra = clsReportes.sumacompras();
    System.out.print(sumacompra.toString());
    
    ArrayList<clsFactura> numerofac = new ArrayList<>();
    numerofac = clsReportes.numerocompras();
    System.out.print(numerofac.toString());
    
    ArrayList<clsFactura> numerofacytotal = new ArrayList<>();
    numerofacytotal = clsReportes.numerocomprasytotal();
    System.out.print(numerofacytotal.toString());

    ArrayList<clsFactura> clientemayorcompras = new ArrayList<>();
    clientemayorcompras = clsReportes.clientemascompras();
    System.out.print(clientemayorcompras.toString());
    
    ArrayList<clsFactura> clientemenorcompras = new ArrayList<>();
    clientemenorcompras = clsReportes.clientemenoscompras();
    System.out.print(clientemenorcompras.toString());
    
    ArrayList<clsFactura> promediocompras = new ArrayList<>();
    promediocompras = clsReportes.promediocompras();
    System.out.print(promediocompras.toString());
    
    ArrayList<clsDfacpro> productomasvendido = new ArrayList<>();
    productomasvendido = clsReportes.productomasvendido();
    System.out.print(productomasvendido.toString());
    
    ArrayList<clsDfacpro> productomenosvendido = new ArrayList<>();
    productomenosvendido = clsReportes.productomenosvendido();
    System.out.print(productomenosvendido.toString());
    
    ArrayList<clsDfacpro> ventasporproducto = new ArrayList<>();
    ventasporproducto = clsReportes.ventasporproducto();
    System.out.print(ventasporproducto.toString());
    }
    }


