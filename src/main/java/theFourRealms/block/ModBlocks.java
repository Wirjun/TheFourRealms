package theFourRealms.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

    public static Block PlatinOre;

    public static final void init() {
    	GameRegistry.registerBlock(PlatinOre = new BasicBlock("PlatinOre", Material.iron), "PlatinOre");
    	  
    }

}