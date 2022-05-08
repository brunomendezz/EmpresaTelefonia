class ClientManager {
    fun darDeAltaCliente(nombre:String,apellido:String): Boolean {
        return ClientRepository.darDeAltaCliente(nombre,apellido)
    }

    fun obtenerListaDeClientes(): MutableList<Cliente> {
        return ClientRepository.get()

    }

}