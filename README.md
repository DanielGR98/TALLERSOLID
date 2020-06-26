# TALLERSOLID
Este taller consiste en determinar mediante la corrección del codigo del programa dado
los principios SOLID 
## Partes que se modificaron en el codigo dado.
1.	Clases Helado y Pastel. Tienen mucha similitud, se debería crear una clase padre llamada Postre.
2.	Clases Procesos.OperacionesAderezo y Postre. ¿Es necesaria la clase OperacionesAderezo?. Se puede incluir dentro de postre un método para agregar un aderezo y para quitar un aderezo.
3.	Métodos calcularPrecioFinal() y  showPrecioFinal() están muy relacionados, deben estar en otra clase por si cambia la fórmula de cálculo. La clase nueva debe llamarse Procesos.ManejadorDePrecio.
4.	Enum Adicionales.Aderezo es muy estático, debe convertirse en clase abstract con un atributo nombre y un método abstracto setNombre para que cada tipo de aderezo sea una subclase de Aderezo e implemente dicho método. También, sobrescriba el método toString() en la clase Aderezo, para que devuelva el nombre del aderezo en mayúsculas.
5.	Paquete Leche y la clase Procesos.ManejadorDeLeche. En el main descomente las instrucciones para realizar el cambio del tipo de leche utilizada en cada postre, luego analice como solucionar el error generado en la clase Leche.LecheDeslactosada.
6.	Cambie el main por el siguiente código y ajuste según su propia implementación.

## Explicacion de las violaciones de los Pricipios *SOLID* en cada parte del codigo corregido.
1)
2)
3) En el punto 3 violaba el princiop *SRP* (Single Responsibility Principle) ya que las clases Pastel y Helado tenian metodos que necesitaban ser modificados, es decir tenian tareas que no dependian de ellas. Para ellos se procedio a crear otra clsase que tenga la unica responsabilidad de hacer los calculos, y quitar esta responsabilidad a las clases antes mencionadas.
4) En el punto 4 viola el principio *OCP* (Open/Closed Principle) porque los aderezos estaban definidos, es decir cerrada a modificaciones y si se queria añadir uno nuevo aderezo se debia definir desde el principio, para solucionar se procedio a cambiar a *abstract* la clase para poder extender las de mas clases de ella.
5) En el punto 5 viola el principio *LSP* (Liskov subtitution principle) ya que la clase heredada generaba una exepcion.
