package com.randommods.CraftableOres.client.render.items;

import com.randommods.CraftableOres.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class ItemRenderRegister {
	public static void registerItemRenderer() {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						ModItems.partiallyCompressedCobble,
						0,
						new ModelResourceLocation(
								"COres:partiallyCompressedCobble", "inventory"));
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						ModItems.compressedCobble,
						0,
						new ModelResourceLocation("COres:compressedCobble",
								"inventory"));
	}

}
