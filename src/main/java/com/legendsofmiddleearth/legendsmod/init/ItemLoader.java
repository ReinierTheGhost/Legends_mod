package com.legendsofmiddleearth.legendsmod.init;

import com.legendsofmiddleearth.legendsmod.LegendsMod;
import com.legendsofmiddleearth.legendsmod.tabs.LegendsTabs;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemLoader {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			LegendsMod.MODID);
	//runes
	public static final RegistryObject<Item> RUNE_ARCANE = ITEMS.register("rune_arcane",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	public static final RegistryObject<Item> RUNE_SKY = ITEMS.register("rune_sky",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	public static final RegistryObject<Item> RUNE_FIRE = ITEMS.register("rune_fire",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	public static final RegistryObject<Item> RUNE_NATURE = ITEMS.register("rune_nature",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	public static final RegistryObject<Item> RUNE_WATER = ITEMS.register("rune_water",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	
	//rings
	public static final RegistryObject<Item> RING_BASE_SILVER = ITEMS.register("ring_base_silver",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	public static final RegistryObject<Item> RING_BASE_GOLD = ITEMS.register("ring_base_gold",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	public static final RegistryObject<Item> RING_MASTERY_AIR = ITEMS.register("ring_mastery_air",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	public static final RegistryObject<Item> RING_MASTERY_fire = ITEMS.register("ring_mastery_fire",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	public static final RegistryObject<Item> RING_MASTERY_EARTH = ITEMS.register("ring_mastery_earth",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	public static final RegistryObject<Item> RING_ELEMENTAL = ITEMS.register("ring_elemental",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	public static final RegistryObject<Item> RING_AIR = ITEMS.register("ring_air",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	public static final RegistryObject<Item> RING_EARTH = ITEMS.register("ring_earth",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
	public static final RegistryObject<Item> RING_FIRE = ITEMS.register("ring_fire",
			() -> new Item(new Item.Properties().tab(LegendsTabs.LEGENDS)));
}
