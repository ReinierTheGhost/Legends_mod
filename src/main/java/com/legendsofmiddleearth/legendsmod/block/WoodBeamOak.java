package com.legendsofmiddleearth.legendsmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WoodBeamOak extends Block {

	public static final String name = "woodbeamoak";
	public static final WoodBeamOak instance = new WoodBeamOak();

	public WoodBeamOak() {
		super(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(5).sound(SoundType.WOOD));

		// TODO Auto-generated constructor stub
	}
}