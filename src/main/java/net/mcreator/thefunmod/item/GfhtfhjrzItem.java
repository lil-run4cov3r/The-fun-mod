
package net.mcreator.thefunmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class GfhtfhjrzItem extends SwordItem {
	public GfhtfhjrzItem() {
		super(new Tier() {
			public int getUses() {
				return 725;
			}

			public float getSpeed() {
				return 13.5f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 11;
			}

			public int getEnchantmentValue() {
				return 32;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -1.1f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
