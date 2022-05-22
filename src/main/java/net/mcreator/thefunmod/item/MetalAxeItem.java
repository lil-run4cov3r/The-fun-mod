
package net.mcreator.thefunmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.thefunmod.init.TheFunModModItems;

public class MetalAxeItem extends AxeItem {
	public MetalAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2380;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 45f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheFunModModItems.METAL_INGOT.get()));
			}
		}, 1, -1.9f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
