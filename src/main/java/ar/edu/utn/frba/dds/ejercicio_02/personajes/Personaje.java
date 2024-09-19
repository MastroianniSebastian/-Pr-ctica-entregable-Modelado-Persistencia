package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_personaje",length = 1)
@Table(name = "personaje")
public abstract class Personaje {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Getter
  @Transient
  private List<ElementoDefensor> elementos;

  @Getter @Setter
  @Column(name = "estamina")
  private Integer estamina;

  @Column(name = "puntos_de_vida")
  @Getter @Setter
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}
