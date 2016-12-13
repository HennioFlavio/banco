package br.com.threeway;

import java.util.Date;

public class ExemploMetodoEstatico {

	
	public static void main(String[] args) {
		Date data = new Date();

		System.out.println(UtilData.agora(data));

		UtilData idata = new UtilData();
		System.out.println(idata.agora(data));

		System.out.println(idata.DDMMAAAAHHMM(data));
		UtilData.DDMMAAAAHHMM(data);


	}

}
