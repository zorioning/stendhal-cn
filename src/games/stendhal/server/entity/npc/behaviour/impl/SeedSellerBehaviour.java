/* $Id$ */
/***************************************************************************
 *                   (C) Copyright 2003-2010 - Stendhal                    *
 ***************************************************************************
 ***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/
package games.stendhal.server.entity.npc.behaviour.impl;

import java.util.HashMap;
import java.util.Map;

import games.stendhal.server.core.engine.SingletonRepository;
import games.stendhal.server.entity.item.Item;
import games.stendhal.server.entity.item.StackableItem;

public class SeedSellerBehaviour extends SellerBehaviour {

	private static Map<String, Integer> pricelist = new HashMap<String, Integer>();
	static {
        /*
         * flower names should be one word, no blank characters
         */
		pricelist.put("紫丁香 种子", 10);
		pricelist.put("雏菊 种子", 20);
		pricelist.put("马蹄莲 球茎", 15);
		pricelist.put("三色堇 种子", 10);
	}

	public SeedSellerBehaviour() {
		this(pricelist);
	}

	public SeedSellerBehaviour(final Map<String, Integer> priceList) {
		super(priceList);
	}

	@Override
	public Item getAskedItem(final String askedItem) {
		final String[] tokens = askedItem.split(" ");
		final StackableItem item = (StackableItem) SingletonRepository.getEntityManager().getItem(tokens[1]);
		item.setInfoString(tokens[0]);
		return item;
	}
}
