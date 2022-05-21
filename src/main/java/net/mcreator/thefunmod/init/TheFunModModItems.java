
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefunmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thefunmod.item.MetalSwordItem;
import net.mcreator.thefunmod.item.MetalShovelItem;
import net.mcreator.thefunmod.item.MetalPickaxeItem;
import net.mcreator.thefunmod.item.MetalIngotItem;
import net.mcreator.thefunmod.item.MetalHoeItem;
import net.mcreator.thefunmod.item.MetalAxeItem;
import net.mcreator.thefunmod.item.GfhtfhjrzItem;
import net.mcreator.thefunmod.TheFunModMod;

public class TheFunModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheFunModMod.MODID);
	public static final RegistryObject<Item> GFHTFHJRZ = REGISTRY.register("gfhtfhjrz", () -> new GfhtfhjrzItem());
	public static final RegistryObject<Item> METAL_INGOT = REGISTRY.register("metal_ingot", () -> new MetalIngotItem());
	public static final RegistryObject<Item> METAL_ORE = block(TheFunModModBlocks.METAL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> METAL_BLOCK = block(TheFunModModBlocks.METAL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> METAL_PICKAXE = REGISTRY.register("metal_pickaxe", () -> new MetalPickaxeItem());
	public static final RegistryObject<Item> METAL_AXE = REGISTRY.register("metal_axe", () -> new MetalAxeItem());
	public static final RegistryObject<Item> METAL_SWORD = REGISTRY.register("metal_sword", () -> new MetalSwordItem());
	public static final RegistryObject<Item> METAL_SHOVEL = REGISTRY.register("metal_shovel", () -> new MetalShovelItem());
	public static final RegistryObject<Item> METAL_HOE = REGISTRY.register("metal_hoe", () -> new MetalHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
