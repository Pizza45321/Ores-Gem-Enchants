package com.nixon.ogm.setup;

import com.nixon.ogm.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
    public void init() {

    }
    public ItemGroup itemGroup = new ItemGroup("ogm") {
        @Override
        public ItemStack createIcon() {
               return new ItemStack(ModBlocks.RubyOre);
        }
    };

}
