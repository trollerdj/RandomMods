package com.randommods.CraftableOres.proxies;

import com.randommods.CraftableOres.items.ModItems;
import com.randommods.CraftableOres.managers.CraftingManager;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	System.out.println("CraftableOres: Common Proxy PREINIT");
    	ModItems.createItems();
    }

    public void init(FMLInitializationEvent e) {
    	System.out.println("CraftableOres: Common Proxy INIT");
    	CraftingManager.addCraftingRecipies();
    }

    public void postInit(FMLPostInitializationEvent e) {
    	System.out.println("CraftableOres: Common Proxy POSTINIT");
    }
}