package com.nixon.ogm.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {
    @Override
    public World GetClientWorld() {
        throw new IllegalStateException("Only run this on the client");
    }

    @Override
    public void init() {

    }
}
