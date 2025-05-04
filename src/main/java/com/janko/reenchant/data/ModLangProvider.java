package com.janko.reenchant.data;

import com.janko.reenchant.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLangProvider extends FabricLanguageProvider {
    public ModLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemgroup.reenchant", "ReEnchant");

        translationBuilder.add(ModItems.ENCHANTING_SPARKS, "Sparks o' Enchanting");

        translationBuilder.add(ModItems.RENEWAL_TOME, "Tome of Renewal");
        translationBuilder.add(ModItems.REVERSAL_TOME, "Tome of Reversal");

        translationBuilder.add(ModItems.SLOT_RUNE, "Slot Rune");
        translationBuilder.add(ModItems.PROTECTION_RUNE, "Protection Rune");
        translationBuilder.add(ModItems.POWER_RUNE, "Power Rune");

        translationBuilder.add(ModItems.SWORD_BOOK, "Book of Swords");
        translationBuilder.add(ModItems.PICKAXE_BOOK, "Book of Pickaxes");
        translationBuilder.add(ModItems.AXE_BOOK, "Book of Axes");
        translationBuilder.add(ModItems.SHOVEL_BOOK, "Book of Shovels");
        translationBuilder.add(ModItems.HOE_BOOK, "Book of Hoes");
        translationBuilder.add(ModItems.SHEARS_BOOK, "Book of Shears");
        translationBuilder.add(ModItems.FISHING_ROD_BOOK, "Book of Fishing Rods");
        translationBuilder.add(ModItems.MACE_BOOK, "Book of Maces");
        translationBuilder.add(ModItems.TRIDENT_BOOK, "Book of Tridents");
        translationBuilder.add(ModItems.BOW_BOOK, "Book of Bows");
        translationBuilder.add(ModItems.CROSSBOW_BOOK, "Book of Crossbows");
        translationBuilder.add(ModItems.HELMET_BOOK, "Book of Helmets");
        translationBuilder.add(ModItems.CHESTPLATE_BOOK, "Book of Chestplates");
        translationBuilder.add(ModItems.LEGGINGS_BOOK, "Book of Leggings");
        translationBuilder.add(ModItems.BOOTS_BOOK, "Book of Boots");
    }
}
