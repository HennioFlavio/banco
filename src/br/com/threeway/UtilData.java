package br.com.threeway;

import java.util.Calendar;
import java.util.Date;

public class UtilData {
	
	static int DOMINGO = Calendar.SUNDAY;
	
	static int SEGUNDA = Calendar.MONDAY;
	
	static int TERCA = Calendar.TUESDAY;
	
	static int QUARTA = Calendar.WEDNESDAY;
	
	static int QUINTA = Calendar.THURSDAY;
	
	static int SEXTA = Calendar.FRIDAY;
	
	static int SABADO = Calendar.SATURDAY;
	
	
	static int JANEIRO = Calendar.JANUARY;
	static int FEVEREIRO = Calendar.FEBRUARY;
	static int MARÇO = Calendar.MARCH;
	static int ABRIL = Calendar.APRIL;

	
	static int DiaDoMes = Calendar.DAY_OF_MONTH;
	
	static int DiaDaSemana = Calendar.DAY_OF_WEEK;
	
	
	static {
		System.out.println("Entrando no bloco estático. ");
		Date data = Calendar.getInstance().getTime();
		System.out.println("saindo do método estático data = " + agora(data));
	}

	static String agora(Date data){
		return new java.text.SimpleDateFormat("dd/MM/yyy HH:mm").format(data);
	}
	
	String DDMMAAAAHHMM(Date data){
		return new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(data);
	}

}
