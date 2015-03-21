package com.randommods.CraftableOres;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.randommods.CraftableOres.items.ModItems;
import com.randommods.CraftableOres.proxies.CommonProxy;

@Mod(modid = BaseMod.MODID, name = BaseMod.MODNAME, version = BaseMod.VERSION)
public class BaseMod {

	public static final String MODID = "COres";
	public static final String MODNAME = "Craftable Ores";
	public static final String VERSION = "1.0.0";

	@SidedProxy(clientSide = "com.randommods.CraftableOres.proxies.ClientProxy", serverSide = "com.randommods.CraftableOres.proxies.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		System.out.println("CraftableOres: PREINIT");
		this.proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		System.out.println("CraftableOres: INIT");
		this.proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		this.proxy.postInit(e);
		System.out.println("CraftableOres: POSTINIT");
	}
}