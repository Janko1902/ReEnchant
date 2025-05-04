package com.janko.reenchant.util;

import com.janko.reenchant.ReEnchant;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> TOMES = createTag("tomes");
        public static final TagKey<Item> RUNES = createTag("runes");
        public static final TagKey<Item> BOOKS = createTag("books");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ReEnchant.MOD_ID, name));
        }
    }
}
