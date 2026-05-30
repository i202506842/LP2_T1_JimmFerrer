package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_equipo_dental")
@Getter
@Setter
public class EquipoDental {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_equipo")
    private Integer nroEquipo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "costo") 
    private Double costo;   

    @Column(name = "fecha_adquisicion") 
    private java.util.Date fechaAdquisicion;

    @Column(name = "estado")
    private String estado;
  
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dentista")
    private Dentista dentista;

}
