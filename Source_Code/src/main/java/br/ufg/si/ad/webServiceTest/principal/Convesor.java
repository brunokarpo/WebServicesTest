package br.ufg.si.ad.webServiceTest.principal;

import br.ufg.si.ad.webServiceTest.stubs.Currency;
import br.ufg.si.ad.webServiceTest.stubs.CurrencyConvertor;
import br.ufg.si.ad.webServiceTest.stubs.CurrencyConvertorSoap;

public class Convesor {

	public static void main(String[] args) {

		CurrencyConvertor convertor = new CurrencyConvertor();
		CurrencyConvertorSoap port = convertor.getPort(CurrencyConvertorSoap.class);

		System.out.println("Convertendo Reais em Dolares.\n A taxa é de: " + port.conversionRate(Currency.USD, Currency.BRL));

	}

}
