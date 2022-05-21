
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefunmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.thefunmod.item.GfhtfhjrzItem;
import net.mcreator.thefunmod.TheFunModMod;

public class TheFunModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheFunModMod.MODID);
	public static final RegistryObject<Item> GFHTFHJRZ = REGISTRY.register("gfhtfhjrz", () -> new GfhtfhjrzItem());
}
