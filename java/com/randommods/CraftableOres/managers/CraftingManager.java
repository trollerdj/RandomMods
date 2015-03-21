package com.randommods.CraftableOres.managers;

import com.randommods.CraftableOres.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager {

	final static ItemStack DIAMOND_ORE_STACK_STONE = new ItemStack(
			Blocks.diamond_ore, 2);
	final static ItemStack GOLD_ORE_STACK_STONE = new ItemStack(
			Blocks.gold_ore, 2);
	final static ItemStack IRON_ORE_STACK_STONE = new ItemStack(
			Blocks.iron_ore, 2);
	final static ItemStack LAPIS_ORE_STACK_STONE = new ItemStack(
			Blocks.lapis_ore, 2);
	final static ItemStack REDSTONE_ORE_STACK_STONE = new ItemStack(
			Blocks.redstone_ore, 2);
	final static ItemStack EMERALD_ORE_STACK_STONE = new ItemStack(
			Blocks.emerald_ore, 2);
	final static ItemStack COAL_ORE_STACK_STONE = new ItemStack(
			Blocks.coal_ore, 2);
	final static ItemStack NETHER_ORE_STACK = new ItemStack(Blocks.quartz_ore);
	final static ItemStack DIAMOND_ORE_STACK = new ItemStack(Blocks.diamond_ore);
	final static ItemStack GOLD_ORE_STACK = new ItemStack(Blocks.gold_ore);
	final static ItemStack IRON_ORE_STACK = new ItemStack(Blocks.iron_ore);
	final static ItemStack LAPIS_ORE_STACK = new ItemStack(Blocks.lapis_ore);
	final static ItemStack REDSTONE_ORE_STACK = new ItemStack(
			Blocks.redstone_ore);
	final static ItemStack EMERALD_ORE_STACK = new ItemStack(Blocks.emerald_ore);
	final static ItemStack COAL_ORE_STACK = new ItemStack(Blocks.coal_ore);
	final static ItemStack LAPIS_ITEM = new ItemStack(Items.dye, 1, 4);

	public static void addCraftingRecipies() {
		GameRegistry.addRecipe(
				new ItemStack(ModItems.partiallyCompressedCobble), "AAA",
				"AAA", "AAA", 'A', Blocks.cobblestone);
		GameRegistry.addRecipe(new ItemStack(ModItems.compressedCobble), "AAA",
				"AAA", "AAA", 'A', ModItems.partiallyCompressedCobble);
		GameRegistry.addRecipe(DIAMOND_ORE_STACK_STONE, "AAA", "ABA", "AAA",
				'A', ModItems.compressedCobble, 'B', Items.diamond);
		GameRegistry.addRecipe(GOLD_ORE_STACK_STONE, "AAA", "ABA", "AAA", 'A',
				ModItems.compressedCobble, 'B', Items.gold_ingot);
		GameRegistry.addRecipe(IRON_ORE_STACK_STONE, "AAA", "ABA", "AAA", 'A',
				ModItems.compressedCobble, 'B', Items.iron_ingot);
		GameRegistry.addRecipe(LAPIS_ORE_STACK_STONE, "AAA", "ABA", "AAA", 'A',
				ModItems.compressedCobble, 'B', LAPIS_ITEM);
		GameRegistry.addRecipe(REDSTONE_ORE_STACK_STONE, "AAA", "ABA", "AAA",
				'A', ModItems.compressedCobble, 'B', Items.redstone);
		GameRegistry.addRecipe(EMERALD_ORE_STACK_STONE, "AAA", "ABA", "AAA",
				'A', ModItems.compressedCobble, 'B', Items.emerald);
		GameRegistry.addRecipe(COAL_ORE_STACK_STONE, "AAA", "ABA", "AAA", 'A',
				ModItems.compressedCobble, 'B', Items.coal);
		GameRegistry.addRecipe(NETHER_ORE_STACK, "AAA", "ABA", "AAA", 'A',
				Blocks.netherrack, 'B', Items.quartz);
		GameRegistry.addRecipe(DIAMOND_ORE_STACK, "AAA", "ABA", "AAA", 'A',
				Blocks.cobblestone, 'B', Items.diamond);
		GameRegistry.addRecipe(GOLD_ORE_STACK, "AAA", "ABA", "AAA", 'A',
				Blocks.cobblestone, 'B', Items.gold_ingot);
		GameRegistry.addRecipe(IRON_ORE_STACK, "AAA", "ABA", "AAA", 'A',
				Blocks.cobblestone, 'B', Items.iron_ingot);
		GameRegistry.addRecipe(LAPIS_ORE_STACK, "AAA", "ABA", "AAA", 'A',
				Blocks.cobblestone, 'B', LAPIS_ITEM);
		GameRegistry.addRecipe(REDSTONE_ORE_STACK, "AAA", "ABA", "AAA", 'A',
				Blocks.cobblestone, 'B', Items.redstone);
		GameRegistry.addRecipe(EMERALD_ORE_STACK, "AAA", "ABA", "AAA", 'A',
				Blocks.cobblestone, 'B', Items.emerald);
		GameRegistry.addRecipe(COAL_ORE_STACK, "AAA", "ABA", "AAA", 'A',
				Blocks.cobblestone, 'B', Items.coal);
	}

}
