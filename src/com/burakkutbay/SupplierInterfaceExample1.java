package com.burakkutbay;

import java.util.function.Supplier;

/**
 * Created by burakkutbay on 30.03.2021.
 *
 * Fonksiyonel Arayüzler'de Supplier Kullanımı
 * get() metotu vardır. Abstract Sınıftır.
 * get () metotu  herhangi bir parametre almaz
 * get() metotdunun dönüş tipi Object'tir.
 *
 *
 * Nesneler için "şablonlar" oluşturmamız gerektiğinde kullanılabilir.
 * Genellikle Stream API'de  nesneler ve Lambda ifadesi oluşturmak için kullanılır.
 *
 */
public class SupplierInterfaceExample1 {
	public static void main(String[] args) {

		Supplier<String> name1=new Supplier<String>() {
			@Override
			public String get() {
				return new String("Burak KUTBAY");
			}
		};
		System.out.println( name1.get());

		Supplier<String> name2=()-> new String("Neşe KUTBAY");
		System.out.println(name2.get());

		Supplier<String> name3=()-> "Diksi KUTBAY";
		System.out.println(name3.get());

	}
}
