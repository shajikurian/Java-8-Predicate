package com.sk.tutorial.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PizaHelper {

	public static Predicate<Piza> isThinCrust(){
		return p -> p.getCrust().equalsIgnoreCase("thin");
	}
	
	public static Predicate<Piza> isThickVeg(){
		return p -> p.getCrust().equalsIgnoreCase("thick") && p.isVeg();
	}
	
	public static List<Piza> filterPizas(List<Piza> pizas, Predicate<Piza> predicate){
		return pizas.stream().filter(predicate).collect(Collectors.toList());
	}
}
