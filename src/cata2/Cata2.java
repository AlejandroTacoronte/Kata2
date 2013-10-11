//  Metodo de clase y de objeto
//  Trabajar coon las colecciones
//  Probar el final
//  Buscar el número más frecuente y las apariciones que haya tenido
// ctrl-shift-n nuevo proyecto
// ctrl-n nuevo archivo
// ctrl-w cerrar ventana
// ctrl-r renombrar
// ctrl-s guardar
// ctrl-shift copiar linea
// alt-shift mover lineas
// ctrl-flecha mover de palabra en palabra
// shift-flechas selecctionar por teclado
// f6 ejecutar
// ctrl-f5 guardar y ejecutar
// f8 y f8 (stepvoer y stepinto (depuracion))
// ctrl-space ver los metodos
// sout-tab (system.out....)
// fori-tab
// fore-tab
// alt-shift-f formatear 
// alt-flechas sigiente punto donde aparece la variable
package cata2;

public class Cata2 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        String[] elements = {"ale","s","t","q","s","ale","ale","t","t"};
        counElement counter = new counElement(elements);
        counter.count();
        String[] elements2 = {"ale","s","t","q","s","ale","ale"};
        counter.setElement(elements2);
        counter.count();
    }
}
