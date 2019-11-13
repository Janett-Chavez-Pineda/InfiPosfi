package infiposfi;
import javax.swing.JOptionPane;
public class InfiPosfi {
    public static void main(String[] args) throws Exception {
        int res, a;
        PVector objPilaEnteros = new PVector();

        do {
            res = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona lo que deseas hacer\n"
                    + "1)Insertar en la Pila\n"
                    + "2)Quitar De La Pila\n"
                    + "3)Cima de la Pila\n"
                    + "4)La Pila esta Vacia\n"
                    + "5)Limpiar la Pila\n"
                    + "6)Limpiar la Pila\n"
                    + "7)Salir"));
            switch (res) {
                case 1:
                    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor"));
                    objPilaEnteros.insertar(a);
                    break;
                case 2:
                    objPilaEnteros.quitar();
                    break;
                case 3:
                    objPilaEnteros.cimaPila();
                    break;
                case 4:
                    objPilaEnteros.pilaVacia();
                    break;
                case 5:
                    objPilaEnteros.limpiarPila();
                    break;
                case 6:
                    objPilaEnteros.mostrarPila();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (true);

    }

}
