Algoritmo Ejercicio13
	Repetir
		Escribir "Que operación a realizar"
		Escribir "1.suma 2.resta 3.multiplicación 4.division"
		Leer operacion
		Escribir "ingresa el primer numero"
		Leer N1
		Escribir "ingresar el segundo numero"
		Leer N2
		Si operacion=1 Entonces
			N1 <- N1+N2
		SiNo
			Si operacion=2 Entonces
				N1 <- N1-N2
			SiNo
				Si operacio=3 Entonces
					N1 <- N1*N2
				SiNo
					Si operacion=4 Entonces
						Si N2 <> 0 Entonces
							N1 <- N1/N2
						SiNo
							Escribir "no hay division entre 0"
						FinSi
					SiNo
						Escribir "No existe esta operación"
					FinSi
				FinSi
			FinSi
		FinSi
		Si 1<=operacion & operacion<=4 Entonces
			Escribir "Resultado es: ",N1," SALIR (S)" 
		FinSi
		Leer s
	Hasta Que s = "S" | s = "s"
FinAlgoritmo
