public class biblioteca {
    private String titulo;
    private String autor;
    private String editorial;
    private int ano_publicacion;
    private int paginas;

    public void setTitulo(String titulo) {
            this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setAnoPublicacion(int ano_publicacion) {
        this.ano_publicacion = ano_publicacion;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void greet(){
        System.out.println(" Su libro es: " + this.titulo);
        System.out.println(" El autor es: " + this.autor);
        System.out.println(" El editorial es: " + this.editorial);
        System.out.println(" El año de publicacion es: " + this.ano_publicacion);
        System.out.println(" El numero de paginas es:  " + this.paginas);

    }
}
