import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime

open class Llamada(
val codigo_cliente: Int=0,
val fecha_llamada: String="",
val hora_llamada: String="",
val duracion_llamada: Double=0.0,
var tipo_llamada: Char='N'
) {
    open fun consultarCostoTotalDeUnCliente(nroDeClienteABuscar: Int): Double {
       CallHistoryRepository.get().forEach{
           if (it.codigo_cliente==nroDeClienteABuscar){
              return it.consultarCostoTotalDeUnCliente(nroDeClienteABuscar)
           }

       }
       return 0.0
   }


    fun consultarCostoTotalDeTodosLosClientes(): Double {
        var costoTotal = 0.0
       CallHistoryRepository.get().forEach{
           costoTotal+=it.consultarCostoTotalDeUnCliente(it.codigo_cliente)
       }
       return costoTotal
    }
}
