
fun main(args: Array<String>) {

mostrarMenu()

}

private fun mostrarMenu() {
 var opcion = 1
 while (opcion != 0) {
  println("MENU DE OPCIONES")
  println(
   "OPCION 1: DAR DE ALTA CLIENTES " +
           "\nOPCION 2: CONSULTAR COSTO TOTAL DE UN CLIENTE." +
           "\nOPCION 3: CONSULTAR COSTO TOTAL DE TODOS LOS CLIENTES." +
           "\nOPCION 0: SALIR" +
           "\nELIJA UNA OPCION:"
  )
  opcion = readln()!!.toInt()

  when (opcion) {
   1 -> {
    println("INGRESE EL NOMBRE DEL USUARIO")
    var nombre = readln()!!.toString()

    println("INGRESE EL APELLIDO DEL USUARIO")
    var apellido = readln()!!.toString()

    if (ClientManager().darDeAltaCliente(nombre, apellido)){
     println("EL USUARIO SE HA AGREGADO CORRECTAMENTE")
    }else{
     println("NO SE HA PODIDO AGREGAR EL USUARIO , INTENTELO DE NUVO")
    }
   }

   2 -> {

    var listaDeClientes = ClientManager().obtenerListaDeClientes()
    println("------------------")
    println("LISTA DE CLIENTES")
    println("-------------------")
    listaDeClientes.forEach{
     println("CODIGO: ${it.codigo_cliente}, NOMBRE = ${it.nombre_cliente}, APELLIDO = ${it.apellido_cliente}, FECHA DE ALTA = ${it.fecha_de_alta_cliente} ")
    }
    println("INGRESE EL NUMERO DE CLIENTE QUE DESEA BUSCAR")
    var nroDeClienteABuscar = readln()!!.toInt()

    println("EL COSTO DEL CLIENTE ES = $ ${CallsManager().costoDeLlamada(nroDeClienteABuscar)}")
    println()
     }
   3 ->{
    println("EL COSTO TOTAL DE LOS CLIENTES ES DE $ ${CallsManager().costoTotalDeLosClientes()}")
   }

    }

   }
 println("GRACIAS VUELVAS PRONTOS")

  }


