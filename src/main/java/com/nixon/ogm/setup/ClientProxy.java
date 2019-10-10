package com.nixon.ogm.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {
    @Override
    public World GetClientWorld() {
        return Minecraft.getInstance().world;
    }

}
