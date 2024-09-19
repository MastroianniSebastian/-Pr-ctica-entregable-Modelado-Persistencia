package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@DiscriminatorValue("L")
public class Ladron extends Personaje{

  @Column(name = "nivel_siniestro")
  private Integer nivelSiniestro;
  @Column(name = "tiene_navaja")
  private Boolean tieneNavaja;

  public void atacar(Personaje personaje) {
 //TODO
  }
}
