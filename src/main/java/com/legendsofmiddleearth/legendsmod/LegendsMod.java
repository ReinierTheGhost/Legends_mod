package com.legendsofmiddleearth.legendsmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.legendsofmiddleearth.legendsmod.init.BlockLoader;
import com.legendsofmiddleearth.legendsmod.init.ContainerLoader;
import com.legendsofmiddleearth.legendsmod.init.ItemLoader;
import com.legendsofmiddleearth.legendsmod.init.TileEntityLoader;
import com.legendsofmiddleearth.legendsmod.tabs.LegendsTabs;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("legendsmod")
@Mod.EventBusSubscriber(modid = LegendsMod.MODID, bus = Bus.MOD)
public class LegendsMod {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "legendsmod";

	public LegendsMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		BlockLoader.BLOCKS.register(bus);
		
		ItemLoader.ITEMS.register(bus);
		
		TileEntityLoader.TILEENTITY_TYPES.register(bus);
		
		ContainerLoader.CONTAINERS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);

	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		BlockLoader.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(LegendsTabs.LEGENDS))
					.setRegistryName(block.getRegistryName()));
		});

	}
}
