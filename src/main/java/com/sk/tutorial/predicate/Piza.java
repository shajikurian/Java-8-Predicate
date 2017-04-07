/**
 * 
 */
package com.sk.tutorial.predicate;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shaji
 *
 */
public class Piza {
	private Integer id;
	private List<String> topings;
	private Integer size;
	private String crust;
	
	public Piza(Integer id, String[] topings, Integer size, String crest) {
		super();
		this.id = id;
		this.topings = Arrays.asList(topings);
		this.size = size;
		this.crust = crest;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piza [id=").append(id).append(", topings=").append(topings).append(", size=").append(size).append(", crust=").append(crust).append("]");
		return builder.toString();
	}

	public final Integer getId() {
		return id;
	}

	public final List<String> getTopings() {
		return topings;
	}

	public final Integer getSize() {
		return size;
	}

	public final String getCrust() {
		return crust;
	}

	public boolean isVeg() {
		String[] nonVegTopings = {"beef","bacon","chicken","ham","pepporoni","sausage"};
		for (int i = 0; i < nonVegTopings.length; i++) {
			if(topings.contains(nonVegTopings[i])) {
				return false;
			}
		}
		return true;
	}
	
}
