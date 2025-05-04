package com.janko.reenchant;

import com.janko.reenchant.data.ModItemTagProvider;
import com.janko.reenchant.data.ModLangProvider;
import com.janko.reenchant.data.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ReEnchantDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLangProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
