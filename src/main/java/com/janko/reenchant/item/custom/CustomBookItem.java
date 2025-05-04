package com.janko.reenchant.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CustomBookItem extends Item {
    public CustomBookItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return stack.getCount() == 1;
    }

    @Override
    public int getEnchantability() {
        return 1;
    }
}
