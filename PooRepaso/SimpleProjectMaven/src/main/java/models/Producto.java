package models;

public abstract class Producto {
	
	private int id;
	private String nombre;
	private String marca;
	private Integer codigo;
	private Double precio;
	public Producto() {
		
	}
	public Producto(int id, String nombre, String marca, Integer codigo, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.codigo = codigo;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", codigo=" + codigo + ", precio="
				+ precio + "]";
		
	}
	

	

}
