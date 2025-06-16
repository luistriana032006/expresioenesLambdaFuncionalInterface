package com.expressioneslambda.interfazfuncional.interfazFuncional.biblioteca.model;

public class Libro {

 private String nombreLibro;
 private String nombreAutor;
 private String generoLiterario;
  private int numeroDePaginas;


  public Libro(String nombreLibro, String nombreAutor, String generoLiterario, int numeroDePaginas){
    this.nombreLibro= nombreLibro;
    this.generoLiterario= generoLiterario;
    this.nombreAutor =nombreAutor;
    this.numeroDePaginas = numeroDePaginas;
  }


  public String getNombreLibro() {
    return nombreLibro;
  }


  public void setNombreLibro(String nombreLibro) {
    this.nombreLibro = nombreLibro;
  }


  public String getNombreAutor() {
    return nombreAutor;
  }


  public void setNombreAutor(String nombreAutor) {
    this.nombreAutor = nombreAutor;
  }


  public String getGeneroLiterario() {
    return generoLiterario;
  }


  public void setGeneroLiterario(String generoLiterario) {
    this.generoLiterario = generoLiterario;
  }


  public int getNumeroDePaginas() {
    return numeroDePaginas;
  }


  public void setNumeroDePaginas(int numeroDePaginas) {
    this.numeroDePaginas = numeroDePaginas;
  }


  @Override
  public String toString() {
    return "libro [nombreLibro=" + nombreLibro + ", nombreAutor=" + nombreAutor + ", generoLiterario=" + generoLiterario
            + ", numeroDePaginas=" + numeroDePaginas + "]";
  }

  
}
