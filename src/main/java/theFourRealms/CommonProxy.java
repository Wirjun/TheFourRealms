package theFourRealms;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import theFourRealms.block.ModBlocks;
import theFourRealms.item.ModItems;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    ModItems.init();
    ModBlocks.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}