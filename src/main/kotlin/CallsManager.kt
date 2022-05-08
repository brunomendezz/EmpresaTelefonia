class CallsManager {
    fun costoDeLlamada(nroDeClienteABuscar: Int): Double {
     return CallHistoryRepository.costoDeLlamada(nroDeClienteABuscar)
    }

    fun costoTotalDeLosClientes(): Double{
        return CallHistoryRepository.costoTotalDeLosClientes()
    }

}