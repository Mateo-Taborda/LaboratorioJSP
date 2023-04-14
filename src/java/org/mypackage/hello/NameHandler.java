/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class NameHandler {
    private String name;
    private String fechaNacimiento;


    public NameHandler(String fechanacimiento) {
        this.fechaNacimiento = fechanacimiento;
    }

  
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public NameHandler() {
       this.name = null;

    }

    /**
     * @return the fechanacimiento
     */
    public String getFechanacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechanacimiento the fechanacimiento to set
     */
    public void setFechanacimiento(String fechanacimiento) {
        this.fechaNacimiento = fechanacimiento;
    }
    public String edad(){
       //2023-04-10
       int año,mes,dia;
       String fecha[] = fechaNacimiento.split("-");
       año = Integer.parseInt(fecha[0]);
       mes = Integer.parseInt(fecha[1]);
       dia = Integer.parseInt(fecha[2]);
       LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
       LocalDate fechaActual = LocalDate.now();
       int edad = Period.between(fechaNacimiento, fechaActual).getYears();

    return String.valueOf(edad);
    }
    public String saludo(){
     Clock clock = Clock.systemDefaultZone();
     LocalTime horaActual = LocalTime.now(clock);
     String mensajeSaludo; 
      int hora = horaActual.getHour();
      if (hora >= 6 && hora < 12) {
        mensajeSaludo = "Buenos días";
    } else if (hora >= 12 && hora < 19) {
        mensajeSaludo = "Buenas tardes";
    } else {
        mensajeSaludo = "Buenas noches";
    }
      return mensajeSaludo;
    }
}
