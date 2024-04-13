package com.verbiox.ItemGroups;

import com.verbiox.NoGravBlocks;
import com.verbiox.blocks.NoGravGravel;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NO_GRAV_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NoGravBlocks.MOD_ID, "no_grav_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.noGrav"))
                    .icon(() -> new ItemStack(NoGravGravel.NO_GRAV_GRAVEL)).entries((displayContext, entries) -> {
                        entries.add(NoGravGravel.NO_GRAV_GRAVEL);
    }).build());
    public static void registerItemGroups() {
        NoGravBlocks.LOGGER.info("Item groups loaded!");
    }
}
