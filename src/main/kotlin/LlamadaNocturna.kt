class LlamadaNocturna(codigo_cliente: Int, fecha_llamada: String, hora_llamada: String, duracion_llamada: Double, tipo_llamada: Char):Llamada(codigo_cliente,fecha_llamada,hora_llamada,duracion_llamada,tipo_llamada) {

    override fun consultarCostoTotalDeUnCliente(nroDeClienteABuscar: Int): Double {
        var costoTotalDelCliente=0.0
        CallHistoryRepository.get().forEach {

            if (it.codigo_cliente == nroDeClienteABuscar) {
                when (it.tipo_llamada) {
                    'L' -> {
                        costoTotalDelCliente = (0.02 * it.duracion_llamada)
                    }
                    'I' -> {
                       costoTotalDelCliente= (it.duracion_llamada* 0.04)
                    }
                }
            }
        }
        return costoTotalDelCliente
    }

}