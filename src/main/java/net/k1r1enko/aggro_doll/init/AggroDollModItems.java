/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.k1r1enko.aggro_doll.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.k1r1enko.aggro_doll.item.AggroDollItem;
import net.k1r1enko.aggro_doll.AggroDollMod;

public class AggroDollModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AggroDollMod.MODID);
	public static final DeferredItem<Item> AGGRO_DOLL;
	static {
		AGGRO_DOLL = REGISTRY.register("aggro_doll", AggroDollItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}