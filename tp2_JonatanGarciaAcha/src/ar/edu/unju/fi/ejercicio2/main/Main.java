package ar.edu.unju.fi.ejercicio2.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio2.model.Efemeride;
import ar.edu.unju.fi.ejercicio2.model.constantes.Mes;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Efemeride efemeride;
		List<Efemeride> efemerides = new ArrayList<Efemeride>();
		int opc, codigo;

		do {
			System.out.println("-----------------MENU-------------------");
			System.out.println("1 - Crear efemeride");
			System.out.println("2 - Mostrar efemerides");
			System.out.println("3 - Eliminar efemeride");
			System.out.println("4 - Modificar efemeride ");
			System.out.println("5 - SALIR");
			System.out.println("------------------------------------");
			System.out.println("------------------------------------");
			System.out.println(" ");
			System.out.println("Ingrese una Opcion");
			opc = scan.nextInt();

			switch (opc) {
			case 1:
//				efemeride = new Efemeride();
//
//				System.out.print("Ingrese CODIGO: ");
//				efemeride.setCodigo(scan.nextInt());
//				System.out.print("Ingrese MES: ");
//				efemeride.setMes(scan.nextInt());
//				System.out.print("Ingrese DIA: ");
//				efemeride.setDia(scan.nextInt());
//				System.out.print("Ingrese DETALLE: ");
//				efemeride.setDetalle(scan.next());
//				
//				efemerides.add(efemeride);

//				PROUCTOS PRECARGADOS PARA TESTING
				efemerides.add(new Efemeride(1111, Mes.ENERO, 1, "aaaa"));
				efemerides.add(new Efemeride(2222, Mes.FEBRERO, 2, "ssss"));
				efemerides.add(new Efemeride(3333, Mes.MARZO, 3, "dddd"));
				efemerides.add(new Efemeride(4444, Mes.OCTUBRE, 4, "ffff"));
				efemerides.add(new Efemeride(5555, Mes.DICIEMBRE, 5, "gggg"));
				break;
			case 2:
				int j = 1;
				for (Efemeride e : efemerides) {
					System.out.println(">>>>>>>>>EFEMERIDE " + j);
					System.out.println(e.toString());
					;
					j++;
				}
				break;
			case 3:
				System.out.println("OPCION DE ELIMINAR EFEMERIDE, ELIJA UNO DE LOS SIGUIENTES CODIGOS VALIDOS:");
				for (Efemeride e : efemerides) {
					System.out.println("codigo: " + e.getCodigo() + " - " + e.getDetalle());
				}
				System.out.print("Escriba el codigo del producto elegido: ");
				codigo=scan.nextInt();
				Iterator<Efemeride> iterator = efemerides.iterator();
				while (iterator.hasNext()) {
					Efemeride efemeride2 = (Efemeride) iterator.next();
					if (efemeride2.getCodigo() == codigo) {
						iterator.remove();
						System.out.println("EFEMERIDE ELIMINADO CORRECTAMENTE");
						break;
					}else {
						System.out.println("OPCION INCORRECTA VUELVA A INTENTAR");							
					}
					try {
					} catch (Exception e) {
						System.out.println("ERROR - ERROR");
						System.out.println("LA ELIMINACION DEL EFEMERIDE SE HA CANCELADO");
						System.out.println(
								"ERROR - HA INGRESADO UN VALOR INCORRECTO O FUERA DE LOS VALORES VALIDOS - SALIENDO AL MENU PRINCIPAL");
						break;
					}
				}
				break;
			case 4:
				System.out.println("OPCION DE MODIFICAR EFEMERIDE, ELIJA UNO DE LOS SIGUIENTES CODIGOS VALIDOS:");
				for (Efemeride e : efemerides) {
					System.out.println("codigo: " + e.getCodigo() + " - " + e.getDetalle());
				}
				System.out.print("Escriba el codigo del efemeride elegido: ");
				try {
					codigo = scan.nextInt();
					for (int i = 0; i < efemerides.size(); i++) {
						if (codigo == efemerides.get(i).getCodigo()) {

							try {
								System.out.print("INGRESE NUEVO MES (numero del 1 al 12): ");
								efemerides.get(i).setMes(scan.nextInt());// PUEDE GENERAR UN ERROR AL PONER OPCION
																			// INCORRECTA
								System.out.print("INGRESE NUEVO DIA (numero del 1 al 31): ");
								efemerides.get(i).setDia(scan.nextInt());
								System.out.print("INGRESE NUEVO DETALLE: ");
								efemerides.get(i).setDetalle(scan.next());
							} catch (Exception ex) {
								System.out.println("ERROR - ERROR");
								System.out.println("LA MODIFICACION DEL EFEMERIDE SE HA CANCELADO");
								System.out.println(
										"ERROR - HA INGRESADO UN VALOR INCORRECTO O FUERA DE LOS VALORES VALIDOS - SALIENDO AL MENU PRINCIPAL");
								break;
							}
							System.out.println("MODIFICACION EXITOSA");
							break;

						}
					}
				} catch (Exception e) {
					System.out.println("HA INGRESADO UN CODIGO NO VALIDO, VUELVA A INTENTAR LUEGO");
					break;
				}

				break;
			case 5:
				System.out.println("FIN DEL PROGRAMA");
				break;

			default:
				System.out.println("OPCION INCORRECTA");

				break;
			}
		} while (opc != 5);
		
		scan.close();

	}

}
