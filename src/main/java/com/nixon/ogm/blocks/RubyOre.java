package com.nixon.ogm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyOre extends Block {

    public RubyOre() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(2.0f)
                .sound(SoundType.METAL)
                .lightValue(10)
        );
        setRegistryName("rubyore");
    }
}
