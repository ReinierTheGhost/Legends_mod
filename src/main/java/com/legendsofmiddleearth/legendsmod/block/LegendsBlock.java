package com.legendsofmiddleearth.legendsmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LegendsBlock extends Block{
	
	public static final String name = "LegendsBlock";
	public static final LegendsBlock instance = new LegendsBlock();


	public LegendsBlock() {
		super(Block.Properties.of(Material.STONE));
		// TODO Auto-generated constructor stub
	}
}
