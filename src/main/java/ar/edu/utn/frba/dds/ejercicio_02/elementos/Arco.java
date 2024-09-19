package ar.edu.utn.frba.dds.ejercicio_02.elementos;

import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Arco")
public class Arco extends ElementoDefensor{

  @Override
  public void defenderA(Personaje personaje) {

  }
}
