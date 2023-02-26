package com.legendsofmiddleearth.legendsmod.tabs;

import com.legendsofmiddleearth.legendsmod.init.BlockLoader;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class LegendsTabs extends ItemGroup {

	public static final LegendsTabs LEGENDS = new LegendsTabs(ItemGroup.TABS.length, "legends_tab");

	public LegendsTabs(int p_i1853_1_, String p_i1853_2_) {
		super(p_i1853_1_, p_i1853_2_);
	}

	@Override
	public ItemStack makeIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(BlockLoader.LEGENDSBLOCK.get());
	}

}
