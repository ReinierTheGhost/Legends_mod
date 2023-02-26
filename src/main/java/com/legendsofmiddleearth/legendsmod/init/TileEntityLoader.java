package com.legendsofmiddleearth.legendsmod.init;

import com.legendsofmiddleearth.legendsmod.LegendsMod;
import com.legendsofmiddleearth.legendsmod.tileentity.RingCrafterTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityLoader {

	public static final DeferredRegister<TileEntityType<?>> TILEENTITY_TYPES = DeferredRegister
			.create(ForgeRegistries.TILE_ENTITIES, LegendsMod.MODID);

	public static final RegistryObject<TileEntityType<RingCrafterTileEntity>> RING_CRAFTER_TILE = TILEENTITY_TYPES
			.register("ring_crafter", () -> TileEntityType.Builder
					.of(RingCrafterTileEntity::new, BlockLoader.RING_CRAFTER_AIRRUNE.get()).build(null));

}
