public class ControladorVolumen {  
    private int nivel;  
  
    public ControladorVolumen(int vol) {  
        if (vol < 0 || vol > 100) {  
            System.out.println("Inicializando volumen con valor inválido: " + vol);  
            nivel = 50;  
            System.out.println("Volumen ajustado a valor por defecto: 50");  
        } else {  
            nivel = vol;  
        }  
    }  
  
    public void subirVolumen(int cantidad) {  
        System.out.println("Intentando subir volumen en " + cantidad + "...");  
        if (nivel + cantidad > 100) {  
            System.out.println("Operación no realizada: volumen máximo permitido es 100");  
            return;  
        }  
        nivel = nivel + cantidad;  
        mostrarEstado();  
    }  
  
    public void bajarVolumen(int cantidad) {  
        System.out.println("Bajando volumen en " + cantidad + "...");  
        nivel -= cantidad;  
        mostrarEstado();  
    }  
  
    public int getNivel() {  
        return nivel;  
    }  
  
    public void mostrarEstado() {  
        System.out.println("Volumen actual: " + nivel);  
    }  
  
    public static void main(String[] args) {  
        ControladorVolumen r = new ControladorVolumen(150);  
        r.subirVolumen(60);  
        r.bajarVolumen(20);  
        r.mostrarEstado();  
    }  
}

