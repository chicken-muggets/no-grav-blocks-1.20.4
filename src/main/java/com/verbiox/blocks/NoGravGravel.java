package com.verbiox.blocks;

import com.verbiox.NoGravBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NoGravGravel {

    public static final Block NO_GRAV_GRAVEL = registerBlock("no_grav_gravel", new Block(FabricBlockSettings.copy(Blocks.GRAVEL)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NoGravBlocks.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NoGravBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModItems() {
        NoGravBlocks.LOGGER.info("NoGravBlocks loaded!");
    }
}
