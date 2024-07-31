public class prestamos {

    private String usuprestamo;

    private String fecha_prestamo;
    private String fecha_devolucion;

    public void setUsuprestamo(String usuprestamo) {
        this.usuprestamo = usuprestamo;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }
    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public void greet(){
        System.out.println(" El usurario presto el libro: " + this.usuprestamo);
        System.out.println(" La fecha para devolver el libro es: " + this.fecha_devolucion);
        System.out.println(" La fecha del prestamo es:  " + this.fecha_prestamo);

    }




}
