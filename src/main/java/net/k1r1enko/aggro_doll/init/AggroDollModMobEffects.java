/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.k1r1enko.aggro_doll.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.k1r1enko.aggro_doll.potion.AggroMobEffect;
import net.k1r1enko.aggro_doll.AggroDollMod;

public class AggroDollModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AggroDollMod.MODID);
	public static final RegistryObject<MobEffect> AGGRO = REGISTRY.register("aggro", () -> new AggroMobEffect());
}