
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
  try {
   opcion = readln()!!.toInt()
   if (opcion != 1 && opcion!=2 && opcion!=3 && opcion!=0  ){
    println("INGRESE UNA OPCION VALIDA.")
    println()
   }

  when (opcion) {
   1 -> {
    println("INGRESE EL NOMBRE DEL USUARIO")
    try {
     var nombre = readln()!!.toString()
     check(nombre.length>=3)

     println("INGRESE EL APELLIDO DEL USUARIO")
     var apellido = readln()!!.toString()
     check(apellido.length>=3)

     if (ClientManager().darDeAltaCliente(nombre, apellido)) {
      println("EL USUARIO SE HA AGREGADO CORRECTAMENTE")
     } else {
      println("NO SE HA PODIDO AGREGAR EL USUARIO , INTENTELO DE NUVO")
     }
    }catch (e:Exception){
     println("ERROR!! $e INGRESAR NOMBRE O APELLIDO VALIDO")
    }
   }

   2 -> {

    var listaDeClientes = ClientManager().obtenerListaDeClientes()
    println("------------------")
    println("LISTA DE CLIENTES")
    println("-------------------")

    listaDeClientes.forEach {
     println("CODIGO: ${it.codigo_cliente}, NOMBRE = ${it.nombre_cliente}, APELLIDO = ${it.apellido_cliente}, FECHA DE ALTA = ${it.fecha_de_alta_cliente} ")
    }
    println("INGRESE EL NUMERO DE CLIENTE QUE DESEA BUSCAR")
    var nroDeClienteABuscar = readln()!!.toInt()
    if (nroDeClienteABuscar !in 0..listaDeClientes.size) {
     println("EL NUMERO DE CLIENTE QUE INGRESO NO ESTA REGISTRADO, INGRESE UN NUMERO VALIDO")
    } else {
     println("EL COSTO DEL CLIENTE ES = $ ${CallsManager().costoDeLlamada(nroDeClienteABuscar)}")
     println()
    }
   }
    3 ->{
     println("EL COSTO TOTAL DE LOS CLIENTES ES DE $ ${CallsManager().costoTotalDeLosClientes()}")
    }

    }
  }catch (e:NumberFormatException){
e.message
println("ERROR!!! $e USTED HA INGRESADO UN VALOR QUE NO ESTA DENTRO DE LOS PARAMETROS, INTENTELO DE NUEVO:")
   println()

  }

   }
 println("GRACIAS VUELVAS PRONTOS")

  }





