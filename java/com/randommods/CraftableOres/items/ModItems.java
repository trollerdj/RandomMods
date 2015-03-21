package com.randommods.CraftableOres.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	public static Item partiallyCompressedCobble;
	public static Item compressedCobble;

	public static void createItems() {
		GameRegistry.registerItem(partiallyCompressedCobble = new MaterialItem(
				"partiallyCompressedCobble"), "partiallycompressedCobble");
		GameRegistry.registerItem(compressedCobble = new MaterialItem(
				"compressedCobble"), "compressedCobble");
	}
}
