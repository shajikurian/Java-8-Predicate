/**
 * 
 */
package com.sk.tutorial.predicate;

import static com.sk.tutorial.predicate.PizaHelper.filterPizas;
import static com.sk.tutorial.predicate.PizaHelper.isThickVeg;
import static com.sk.tutorial.predicate.PizaHelper.isThinCrust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Shaji
 *
 */
public class TestPizaPredicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] nv1 = {"beef","mushrooms","onions","peppers"};
		String[] v1 = {"mushrooms","onions","peppers"};
		String[] nv2 = {"mushrooms","onions","peppers","chicken"};
		String[] v2 = {"mushrooms","onions","peppers","pinapple"};
		String[] nv3 = {"mushrooms","onions","peppers","spinach","pepporoni"};
		Piza p1 =  new Piza(1, nv1, 6, "thick");
		Piza p2 =  new Piza(2, nv1, 8, "thin");
		Piza p3 =  new Piza(3, nv2, 12, "thick");
		Piza p4 =  new Piza(4, nv2, 12, "thin");
		Piza p5 =  new Piza(5, v1, 8, "thick");
		Piza p6 =  new Piza(6, v2, 6, "thick");
		Piza p7 =  new Piza(7, v2, 12, "thick");
		Piza p8 =  new Piza(8, nv3, 6, "thick");
		Piza p9 =  new Piza(9, nv1, 6, "thick");
		Piza p10 =  new Piza(10, v1, 6, "thin");
		Piza p11 =  new Piza(11, nv2, 6, "thick");
		Piza p12 =  new Piza(12, v2, 6, "thick");
		Piza p13 =  new Piza(13, nv3, 6, "thick");
		
		List<Piza> pizas = new ArrayList<>();
		pizas.addAll(Arrays.asList(new Piza[] {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13}));
		
		System.out.println("Thick Veg: "+filterPizas(pizas, isThickVeg()));
		System.out.println("Thin: "+filterPizas(pizas, isThinCrust()));
	}

}
