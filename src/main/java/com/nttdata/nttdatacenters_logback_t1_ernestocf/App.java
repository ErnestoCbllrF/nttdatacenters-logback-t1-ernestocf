package com.nttdata.nttdatacenters_logback_t1_ernestocf;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App 
{
	private static final Logger LOG=LoggerFactory.getLogger(App.class);
	/**
	 * Main
	 * @author Ernesto Caballero
	 * @param args
	 */
    public static void main( String[] args )
    {
    	LOG.info("Inicio del método");
    	

		// Generación de número aleatorio.
		final int maxNumber = 100000000;
		final Random r = new Random();
		int randomNum = r.nextInt(maxNumber);
		LOG.debug("Número: {}",randomNum);

		// Verifica si es el número es valido para el dni
		validateDNINumber(randomNum);

		// Iteración hasta N.
		for (int i = 0; i <= 5000; i++) {
			LOG.info("Iteración número: {}", i);
		}

		LOG.info("Fin del método");
       }
    
    /**
     * validateDNINumber: El número minimo para que el DNI sea valido
     * es que empiece por 1, con lo cuál será el 10000000
     * @author Ernesto Caballero
     * @param entryNum
     */
    private static void validateDNINumber(final int entryNum) {
		LOG.info("TRAZA INICIO");

		if (entryNum >= 0 && entryNum <= 9999999) {
			LOG.warn("Numero generado al usuario {} invalido para DNI.", entryNum);
		}

		else {
			LOG.info("Numero generado al usuario {} valido para crear o modificar DNI.", entryNum);
		}

		LOG.info("TRAZA FIN");
	}
}
