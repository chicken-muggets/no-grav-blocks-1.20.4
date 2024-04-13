package com.verbiox;

import com.verbiox.ItemGroups.ModItemGroups;
import com.verbiox.blocks.NoGravGravel;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoGravBlocks implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("no-grav-blocks");
    public static final String MOD_ID = "nogravblocksverbiox";

	@Override
	public void onInitialize() {
		NoGravGravel.registerModItems();
		LOGGER.info("loaded NoGravGravel");
		ModItemGroups.registerItemGroups();
		LOGGER.info("loaded ModItemGroups");

		LOGGER.info("loaded NoGravBlocks");
	}
}