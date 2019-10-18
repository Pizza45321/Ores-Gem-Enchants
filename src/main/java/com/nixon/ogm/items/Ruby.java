package com.nixon.ogm.items;

import com.nixon.ogm.OreGemEnchants;
import net.minecraft.item.Item;

public class Ruby extends Item {
    public Ruby() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(OreGemEnchants.setup.itemGroup));
        setRegistryName("ruby");
    }
}
