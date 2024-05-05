package ar.edu.unju.fi.ejercicio1.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Producto;
import ar.edu.unju.fi.ejercicio1.model.constantes.Categoria;
import ar.edu.unju.fi.ejercicio1.model.constantes.OrigenFabricacion;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Producto producto;
		List<Producto> productos = new ArrayList<Producto>();
		int opc;

		System.out.println(OrigenFabricacion.ARGENTINA);
		System.out.println(OrigenFabricacion.CHINA.ordinal());
		System.out.println(OrigenFabricacion.BRASIL.ordinal());
		System.out.println(OrigenFabricacion.URUGUAY.ordinal());

		System.out.println(Categoria.TELEFONIA.ordinal());
		System.out.println(Categoria.INFORMATICA.ordinal());
		System.out.println(Categoria.ELECTROHOGAR.ordinal());
		System.out.println(Categoria.HERRAMIENTAS.ordinal());
		do {
			System.out.println("-----------------MENU-------------------");
			System.out.println("1 - Crear Producto");
			System.out.println("2 - Mostrar Productos");
			System.out.println("3 - Modificar producto ");
			System.out.println("4 - SALIR");
			System.out.println("------------------------------------");
			System.out.println("------------------------------------");
			System.out.println(" ");
			System.out.println("Ingrese una Opcion");
			opc = scan.nextInt();

			switch (opc) {
			case 1:
				producto = new Producto();

				System.out.print("Ingrese CODIGO: ");
				producto.setCodigo(scan.nextInt());
				System.out.print("Ingrese DESCRIPCION: ");
				producto.setDescripcion(scan.next());
				System.out.print("Ingrese PRECIO: ");
				producto.setPrecioUnitario(scan.nextFloat());
				System.out.print("Ingrese una de las siguientes opciones para el ORIGEN: ");
				System.out.print("-----------Opcion 0 - Argentina: ");
				System.out.print("-----------Opcion 1 - China: ");
				System.out.print("-----------Opcion 2 - Brasil: ");
				System.out.print("-----------Opcion 3 - Uruguay: ");
				try {
					producto.setOrigen(scan.nextInt());// PUEDE GENERAR UN ERROR AL PONER OPCION INCORRECTA
				} catch (Exception e) {
					producto = null;
					System.out.println("ERROR - ERROR");
					System.out.println("SE HA CANCELADO LA CREACION DEL PRODUCTO");
					System.out.println(
							"ERROR - HA INGRESADO UN VALOR FUERA DE LOS VALORES VALIDOS - SALIENDO AL MENU PRINCIPAL");
					break;
				}
				System.out.print("Ingrese una de las siguientes opciones para la CATEGORIA: ");
				System.out.print("-----------Opcion 0 - Telefonia: ");
				System.out.print("-----------Opcion 1 - Informatica: ");
				System.out.print("-----------Opcion 2 - Electrohogar: ");
				System.out.print("-----------Opcion 3 - Herramientas: ");
				try {
					producto.setCategoria(scan.nextInt());// PUEDE GENERAR UN ERROR AL PONER OPCION INCORRECTA
				} catch (Exception e) {
					producto = null;
					System.out.println("ERROR - ERROR");
					System.out.println("SE HA CANCELADO LA CREACION DEL PRODUCTO");
					System.out.println(
							"ERROR - HA INGRESADO UN VALOR FUERA DE LOS VALORES VALIDOS - SALIENDO AL MENU PRINCIPAL");
					break;				}
				productos.add(producto);

//				PROUCTOS PRECARGADOS PARA TESTING
//				productos.add(new Producto(1111, "aaaa", 100, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR));
//				productos.add(new Producto(2222, "ssss", 200, OrigenFabricacion.BRASIL, Categoria.HERRAMIENTAS));
//				productos.add(new Producto(3333, "dddd", 300, OrigenFabricacion.CHINA, Categoria.INFORMATICA));
//				productos.add(new Producto(4444, "ffff", 400, OrigenFabricacion.URUGUAY, Categoria.TELEFONIA));
//				productos.add(new Producto(5555, "gggg", 500, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR));
				break;
			case 2:
				int j = 1;
				for (Producto p : productos) {
					System.out.println(">>>>>>>>>PRODUCTO " + j);
					System.out.println(p.toString());
					;
					j++;
				}
				break;
			case 3:
				int codigo, k = 1;
				System.out.println("OPCION DE MODIFICAR PRODUCTO, ELIJA UN PRODUCTO DE LOS SIGUIENTES:");
				for (Producto p : productos) {
					System.out.println("producto " + k + " " + p.getCodigo() + " - " + p.getDescripcion());
					k++;
				}
				System.out.print("Escriba el codigo del producto elegido: ");
				try {
					codigo = scan.nextInt();
					for (int i = 0; i < productos.size(); i++) {
						if (codigo == productos.get(i).getCodigo()) {
							System.out.print("INGRESE NUEVA DESCRIPCION: ");
							productos.get(i).setDescripcion(scan.next());
							System.out.print("INGRESE NUEVO PRECIO: ");
							productos.get(i).setPrecioUnitario(scan.nextFloat());

							System.out.println("INGRESE NUEVO ORIGEN (opciones abajo): ");
							System.out.println("-----------Opcion 0 - Argentina: ");
							System.out.println("-----------Opcion 1 - China: ");
							System.out.println("-----------Opcion 2 - Brasil: ");
							System.out.println("-----------Opcion 3 - Uruguay: ");
							try {
								productos.get(i).setOrigen(scan.nextInt());// PUEDE GENERAR UN ERROR AL PONER OPCION
																			// INCORRECTA
							} catch (Exception ex) {
								System.out.println("ERROR - ERROR");
								System.out.println("LA MODIFICACION DEL ORIGEN SE HA CANCELADO");
								System.out.println(
										"ERROR - HA INGRESADO UN VALOR FUERA DE LOS VALORES VALIDOS - SALIENDO AL MENU PRINCIPAL");
								break;
							}
							System.out.println("INGRESE NUEVA CATEGORIA (opciones abajo): ");
							System.out.println("-----------Opcion 0 - Telefonia: ");
							System.out.println("-----------Opcion 1 - Informatica: ");
							System.out.println("-----------Opcion 2 - Electrohogar: ");
							System.out.println("-----------Opcion 3 - Herramientas: ");
							try {
								productos.get(i).setCategoria(scan.nextInt());// PUEDE GENERAR UN ERROR AL PONER OPCION
																				// INCORRECTA
							} catch (Exception ex) {
								System.out.println("ERROR - ERROR");
								System.out.println("LA MODIFICACION DE LA CATEGORIA SE HA CANCELADO");
								System.out.println(
										"ERROR - HA INGRESADO UN VALOR FUERA DE LOS VALORES VALIDOS - SALIENDO AL MENU PRINCIPAL");
								break;
							}
//							descripcion
//							precio
//							origen
//							categoria
							System.out.println("MODIFICACION EXITOSA");

						}
					}
				} catch (Exception e) {
					System.out.println("HA INGRESADO UN CODIGO NO VALIDO, VUELVA A INTENTAR LUEGO");
					break;
				}

				break;
			case 4:
				System.out.println("FIN DEL PROGRAMA");
				break;

			default:
				System.out.println("OPCION INCORRECTA");

				break;
			}
		} while (opc != 4);

	}

}
