
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.thefunmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TheFunModModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.ARMORER) {
			trades.get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(TheFunModModItems.METAL_INGOT.get(), 10), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(Items.TOTEM_OF_UNDYING),

					new ItemStack(Items.EMERALD, 17), 10, 5, 0.05f));
		}
	}
}
