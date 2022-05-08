object ClientRepository {
   private  var clients : MutableList<Cliente> = mutableListOf()

    init {
        clients.add(Cliente(1, "Mark", "Odduy", "2021-01-01"))
        clients.add(Cliente(2, "John", "Jackson", "2022-04-15"))
        clients.add(Cliente(3, "Elizabeth", "Larrson", "2022-01-01"))
        clients.add(Cliente(4, "Stefany", "Kroscen", "2020-01-22"))
    }

    fun get() : MutableList<Cliente> {

        return clients
    }

//REGISTRAR UN NUEVO CLIENTE
    fun darDeAltaCliente(nombre:String,apellido:String): Boolean {
 var codigoDeCliente = clients.size+1
 var nuevoCliente= Cliente(codigoDeCliente,nombre,apellido)
        return clients.add(nuevoCliente)
    }

    // DEVUELVE SI EL CLIENTE ES NUEVO O NO

    fun saberSiElClienteEsNuevo(nroDeClienteABuscar:Int):Boolean{
        return Cliente().consultarFechaDeAltaDelCliente(nroDeClienteABuscar)
    }
}