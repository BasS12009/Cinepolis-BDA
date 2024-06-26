/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;


import java.util.Date;
import java.util.List;

/**
 *
 * @author diana
 */
public class FuncionDTO {
     private Long id;
    private Date fecha;
    private double horaInicio;
    private List<PeliculaDTO> peliculas;

    public FuncionDTO() {
    }

    public FuncionDTO(Long id, Date fecha, double horaInicio, List<PeliculaDTO> peliculas) {
        this.id = id;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.peliculas = peliculas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(double horaInicio) {
        this.horaInicio = horaInicio;
    }

    public List<PeliculaDTO> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<PeliculaDTO> peliculas) {
        this.peliculas = peliculas;
    }
    
    
    
}
