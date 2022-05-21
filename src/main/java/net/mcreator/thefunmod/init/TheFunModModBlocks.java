
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefunmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thefunmod.block.MetalOreBlock;
import net.mcreator.thefunmod.block.MetalBlockBlock;
import net.mcreator.thefunmod.TheFunModMod;

public class TheFunModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheFunModMod.MODID);
	public static final RegistryObject<Block> METAL_ORE = REGISTRY.register("metal_ore", () -> new MetalOreBlock());
	public static final RegistryObject<Block> METAL_BLOCK = REGISTRY.register("metal_block", () -> new MetalBlockBlock());
}
