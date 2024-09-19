package ar.edu.utn.frba.dds.ejercicio_02;

import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Table(name = "jugador")
@Entity
public class Jugador {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "apellido")
  private String apellido;

  @Column(name = "fecha_alta")
  private LocalDate fechaAlta;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "personaje_id")
  private Personaje personaje;

  public Jugador() {
    this.fechaAlta = LocalDate.now();
  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}
