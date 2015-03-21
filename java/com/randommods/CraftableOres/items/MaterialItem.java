package com.randommods.CraftableOres.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MaterialItem extends Item{
	public MaterialItem(String unlocalizedName){
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
}
