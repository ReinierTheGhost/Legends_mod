package com.legendsofmiddleearth.legendsmod.init;

import com.legendsofmiddleearth.legendsmod.LegendsMod;
import com.legendsofmiddleearth.legendsmod.block.BigFlowerpotLegends;
import com.legendsofmiddleearth.legendsmod.block.LegendsBlock;
import com.legendsofmiddleearth.legendsmod.block.RingCrafter;
import com.legendsofmiddleearth.legendsmod.block.WoodBeamOak;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockLoader {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			LegendsMod.MODID);
	
	public static final RegistryObject<Block> LEGENDSBLOCK = BLOCKS.register("legendsblock", LegendsBlock::new);

	public static final RegistryObject<Block> WOODBEAMOAK = BLOCKS.register("woodbeamoak", WoodBeamOak::new);

	public static final RegistryObject<Block> BIGFLOWERPOT_LEGENDS = BLOCKS.register("bigflowerpot_legends", BigFlowerpotLegends::new);
	
	public static final RegistryObject<Block> RING_CRAFTER_AIRRUNE = BLOCKS.register("ring_crafter_airrune", RingCrafter::new);
}
