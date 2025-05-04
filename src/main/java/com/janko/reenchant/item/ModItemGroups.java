package com.janko.reenchant.item;

import com.janko.reenchant.ReEnchant;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup REENCHANT = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ReEnchant.MOD_ID, "reenchant"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ENCHANTING_SPARKS))
                    .displayName(Text.translatable("itemgroup.reenchant"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ENCHANTING_SPARKS);

                        entries.add(ModItems.RENEWAL_TOME);
                        entries.add(ModItems.REVERSAL_TOME);

                        entries.add(ModItems.SLOT_RUNE);
                        entries.add(ModItems.PROTECTION_RUNE);
                        entries.add(ModItems.POWER_RUNE);

                        entries.add(ModItems.SWORD_BOOK);
                        entries.add(ModItems.PICKAXE_BOOK);
                        entries.add(ModItems.AXE_BOOK);
                        entries.add(ModItems.SHOVEL_BOOK);
                        entries.add(ModItems.HOE_BOOK);
                        entries.add(ModItems.SHEARS_BOOK);
                        entries.add(ModItems.FISHING_ROD_BOOK);
                        entries.add(ModItems.MACE_BOOK);
                        entries.add(ModItems.TRIDENT_BOOK);
                        entries.add(ModItems.BOW_BOOK);
                        entries.add(ModItems.CROSSBOW_BOOK);
                        entries.add(ModItems.HELMET_BOOK);
                        entries.add(ModItems.CHESTPLATE_BOOK);
                        entries.add(ModItems.LEGGINGS_BOOK);
                        entries.add(ModItems.BOOTS_BOOK);
                    }).build());

    public static void registerItemGroups() {
        ReEnchant.LOGGER.info("Registering Item Groups for " + ReEnchant.MOD_ID);
    }
}
