package com.janko.reenchant.item;

import com.janko.reenchant.ReEnchant;
import com.janko.reenchant.item.custom.CustomBookItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item ENCHANTING_SPARKS = registerItem("enchanting_sparks", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

    public static final Item RENEWAL_TOME = registerItem("renewal_tome", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item REVERSAL_TOME = registerItem("reversal_tome", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

    public static final Item SLOT_RUNE = registerItem("slot_rune", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item PROTECTION_RUNE = registerItem("protection_rune", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item POWER_RUNE = registerItem("power_rune", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

    public static final Item SWORD_BOOK = registerItem("sword_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item PICKAXE_BOOK = registerItem("pickaxe_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item AXE_BOOK = registerItem("axe_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item SHOVEL_BOOK = registerItem("shovel_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item HOE_BOOK = registerItem("hoe_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item SHEARS_BOOK = registerItem("shears_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item FISHING_ROD_BOOK = registerItem("fishing_rod_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item MACE_BOOK = registerItem("mace_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item TRIDENT_BOOK = registerItem("trident_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item BOW_BOOK = registerItem("bow_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item CROSSBOW_BOOK = registerItem("crossbow_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item HELMET_BOOK = registerItem("helmet_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item CHESTPLATE_BOOK = registerItem("chestplate_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item LEGGINGS_BOOK = registerItem("leggings_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item BOOTS_BOOK = registerItem("boots_book", new CustomBookItem(new Item.Settings().rarity(Rarity.UNCOMMON)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ReEnchant.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ReEnchant.LOGGER.info("Registering Mod Items for " + ReEnchant.MOD_ID);
    }
}
