package br.com.threeway;

public class ExemploVariavelEstatica {
	
	public static void main(String[] args){
		
		System.out.println("Dia da semana " + UtilData.DOMINGO);
		System.out.println("Dia da semana " + UtilData.SEGUNDA);
		System.out.println("Dia da semana " + UtilData.QUARTA);
		System.out.println("Dia da semana " + UtilData.SABADO);

		//UtilData data = new UtilData();
		System.out.println("Mes do ano " + UtilData.JANEIRO);
		System.out.println("Mes do ano " + UtilData.FEVEREIRO);
		System.out.println("Mes do ano " + UtilData.ABRIL);
		System.out.println("Mes do ano " + UtilData.MARÇO);

		
		System.out.println("Dia da Semana " + UtilData.DiaDaSemana);
		UtilData.DiaDaSemana = 3;
		System.out.println("Mudou Dia Da Semana" + UtilData.DiaDaSemana);
		
		//UtilData data2 = new UtilData();
		System.out.println("instancia 1 Dia do Mes " + UtilData.DiaDoMes);
		System.out.println("instancia 2 Dia do Mes " + UtilData.DiaDoMes);
		UtilData.DiaDoMes = 20;
		
		System.out.println("instancia 1 Mudou Dia do Mes " + UtilData.DiaDoMes);
		System.out.println("instancia 2 Mudou Dia do mês " + UtilData.DiaDoMes);

	}

}
