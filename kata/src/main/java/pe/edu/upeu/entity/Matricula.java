package pe.edu.upeu.entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "matriculas")
public class Matricula {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="id")
	private long id;
	
	@Column (name="fecha_mat")
	@Temporal(TemporalType.DATE)
	private Date fecha_mat;
	@Column(name="horas")
	private int horas;
	@Column (name="nivel")
	private String nivel;
	@ManyToOne
	@JoinColumn(name = "alumnos_id", nullable = false)
	private Alumno alumnos;
	@ManyToOne
	@JoinColumn(name = "empleados_id", nullable = false)
	private Empleado empleados;
	@ManyToOne
	@JoinColumn(name = "grados_id", nullable = false)
	private Grado grados;


}
