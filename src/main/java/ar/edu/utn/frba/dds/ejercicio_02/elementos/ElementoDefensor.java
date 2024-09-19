package ar.edu.utn.frba.dds.ejercicio_02.elementos;

import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;

import javax.persistence.*;

@Entity
@Table(name = "elemento_defensor")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class ElementoDefensor {
  @Id
  @GeneratedValue
  private long id;

  public abstract void defenderA(Personaje personaje);

}

