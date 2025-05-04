package com.janko.reenchant;

import com.janko.reenchant.item.ModItemGroups;
import com.janko.reenchant.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReEnchant implements ModInitializer {
	public static final String MOD_ID = "reenchant";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}