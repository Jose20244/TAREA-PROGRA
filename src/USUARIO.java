
    public class USUARIO {
        private String nombre;
        private String apellido;
        private String correo;
        private int edad;
        private int nit;

        public void setnombre(String nombre) {
            this.nombre = nombre;
        }
        public void setapellido(String apellido) {
            this.apellido = apellido;
        }
        public void setcorreo(String correo) {
            this.correo = correo;
        }
        public void setedad(int edad) {
            this.edad = edad;
        }
        public void setnit(int nit) {
            this.nit   = nit;
        }

        public void greet(){
            System.out.println(" Nombre: " + this.nombre);
            System.out.println(" Apellido: " + this.apellido);
            System.out.println(" El correo es: " + this.correo);
            System.out.println(" Edad: " + this.edad);
            System.out.println(" El numero de dpi es:  " + this.nit);

        }

}
