import java.time.LocalDate

class Cliente(
     val codigo_cliente: Int=0,
     val nombre_cliente: String="",
     val apellido_cliente: String="",
     val fecha_de_alta_cliente: String= LocalDate.now().toString() ) {


    // SI EL CLIENTE FUE DADO DE HACE MENOS DE 6 MESES ES NUEVO(TRUE) SI NO LO ES (FALSE)

     fun consultarFechaDeAltaDelCliente(nroDeClienteABuscar: Int): Boolean {

         var listaDeClientes = ClientRepository.get()
         var fechaActual = LocalDate.now()

         listaDeClientes.forEach() {
             if (it.codigo_cliente == nroDeClienteABuscar) {
                 var fecha = LocalDate.parse(it.fecha_de_alta_cliente)
                 if (fecha in fechaActual.minusMonths(6)..fechaActual) {
                     return true
                 }
             }
         }
         return false
     }

}