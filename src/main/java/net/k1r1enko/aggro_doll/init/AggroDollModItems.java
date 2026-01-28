/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.k1r1enko.aggro_doll.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.k1r1enko.aggro_doll.item.AggroDollItem;
import net.k1r1enko.aggro_doll.AggroDollMod;

public class AggroDollModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AggroDollMod.MODID);
	public static final RegistryObject<Item> AGGRO_DOLL;
	static {
		AGGRO_DOLL = REGISTRY.register("aggro_doll", AggroDollItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}