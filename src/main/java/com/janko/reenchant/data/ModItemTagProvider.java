package com.janko.reenchant.data;

import com.janko.reenchant.item.ModItems;
import com.janko.reenchant.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add(ModItems.SWORD_BOOK);

        getOrCreateTagBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .add(ModItems.SWORD_BOOK)
                .add(ModItems.AXE_BOOK);

        getOrCreateTagBuilder(ItemTags.MACE_ENCHANTABLE)
                .add(ModItems.MACE_BOOK);

        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(ModItems.MACE_BOOK);

        getOrCreateTagBuilder(ItemTags.TRIDENT_ENCHANTABLE)
                .add(ModItems.TRIDENT_BOOK);

        getOrCreateTagBuilder(ItemTags.BOW_ENCHANTABLE)
                .add(ModItems.BOW_BOOK);

        getOrCreateTagBuilder(ItemTags.CROSSBOW_ENCHANTABLE)
                .add(ModItems.CROSSBOW_BOOK);

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.PICKAXE_BOOK)
                .add(ModItems.AXE_BOOK)
                .add(ModItems.SHOVEL_BOOK)
                .add(ModItems.HOE_BOOK)
                .add(ModItems.SHEARS_BOOK);

        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(ModItems.PICKAXE_BOOK)
                .add(ModItems.AXE_BOOK)
                .add(ModItems.SHOVEL_BOOK)
                .add(ModItems.HOE_BOOK);

        getOrCreateTagBuilder(ItemTags.FISHING_ENCHANTABLE)
                .add(ModItems.FISHING_ROD_BOOK);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.HELMET_BOOK)
                .add(ModItems.CHESTPLATE_BOOK)
                .add(ModItems.LEGGINGS_BOOK)
                .add(ModItems.BOOTS_BOOK);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.HELMET_BOOK);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.CHESTPLATE_BOOK);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.LEGGINGS_BOOK);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.BOOTS_BOOK);

        getOrCreateTagBuilder(ModTags.Items.TOMES)
                .add(ModItems.RENEWAL_TOME)
                .add(ModItems.REVERSAL_TOME);

        getOrCreateTagBuilder(ModTags.Items.RUNES)
                .add(ModItems.SLOT_RUNE)
                .add(ModItems.PROTECTION_RUNE)
                .add(ModItems.PROTECTION_RUNE);

        getOrCreateTagBuilder(ModTags.Items.BOOKS)
                .add(ModItems.SWORD_BOOK)
                .add(ModItems.PICKAXE_BOOK)
                .add(ModItems.AXE_BOOK)
                .add(ModItems.SHOVEL_BOOK)
                .add(ModItems.HOE_BOOK)
                .add(ModItems.SHEARS_BOOK)
                .add(ModItems.FISHING_ROD_BOOK)
                .add(ModItems.MACE_BOOK)
                .add(ModItems.TRIDENT_BOOK)
                .add(ModItems.BOW_BOOK)
                .add(ModItems.CROSSBOW_BOOK)
                .add(ModItems.HELMET_BOOK)
                .add(ModItems.CHESTPLATE_BOOK)
                .add(ModItems.LEGGINGS_BOOK)
                .add(ModItems.BOOTS_BOOK);

        getOrCreateTagBuilder(ItemTags.BOOKSHELF_BOOKS)
                .addOptionalTag(ModTags.Items.BOOKS);
    }
}
