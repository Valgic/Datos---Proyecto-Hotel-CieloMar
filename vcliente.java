/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.sql.Date;

/**
 *
 * @author GRUPO GESTION Y CALIDAD DE SOFTWARE 2020
 */
public class vcliente extends vpersona{
    private String codigo_cliente;

    public vcliente() {
    }

    public vcliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

   

   
    
}
