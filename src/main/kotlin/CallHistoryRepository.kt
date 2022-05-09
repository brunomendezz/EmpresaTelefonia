object CallHistoryRepository{
    private var callsHistory : MutableList<Llamada> = mutableListOf()

    init {
        callsHistory.add(LlamadaFinDeSemana(0, "2022-01-01", "10:30", 351.2, 'L'))
        callsHistory.add(LlamadaNocturna(1, "2021-11-12", "22:30", 132.0, 'L'))
        callsHistory.add(LlamadaRegular(2, "2022-04-25", "18:09", 1402.3, 'I'))
        callsHistory.add(LlamadaRegular(3, "2022-03-10", "02:11", 105.5, 'L'))
        callsHistory.add(LlamadaRegular(4, "2021-02-12", "02:11", 105.5, 'L'))
    }

    fun get() : MutableList<Llamada> {
        return callsHistory
    }
    //COSTO DE LLAMADA SEGUN CLIENTE A BUSCAR

   fun costoDeLlamada(nroDeClienteABuscar:Int):Double{
      return Llamada().consultarCostoTotalDeUnCliente(nroDeClienteABuscar)
    }

//COSTO DE LLAMADA DE TODOS LOS CLIENTES (ACUMULADOS)
    fun costoTotalDeLosClientes():Double {
    return Llamada().consultarCostoTotalDeTodosLosClientes()
    }


}

