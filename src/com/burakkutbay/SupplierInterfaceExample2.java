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
public class SupplierInterfaceExample2 {

	public static void main(String[] args) {
		Supplier<User> userSupplier1=()->new User(1,"Burak");
		printUser(userSupplier1);
	}

	public static void printUser(Supplier<User> userSupplier){
		System.out.println(userSupplier.get());
		System.out.println(userSupplier.get().getName());
		System.out.println(userSupplier.get().getId());
	}
}
