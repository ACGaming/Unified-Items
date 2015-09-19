/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.material;

import java.util.ArrayList;

public enum MaterialType {
	GENERIC(true, true, true, false, true),
	METAL(false, true, true, false, true),
	CRAFTING(false, true, true, false, true),
	GEM(true, true, false, true, true),
	DUST(false, true, false, false, false),
	INGOT(false, false, true, false, false),
	BLOCK(false, false, false, false, true);
	
	ArrayList<String> types;
	
	MaterialType(boolean o, boolean d, boolean i, boolean g, boolean b) {
		ArrayList<String> temp = new ArrayList<String>();
		if(o == true) {
			temp.add("ore");
		}
		if(d == true) {
			temp.add("dust");
		}
		if(i == true) {
			temp.add("ingot");
		}
		if(g == true) {
			temp.add("gem");
		}
		if(b == true) {
			temp.add("block");
		}
		types = temp;
	}
}