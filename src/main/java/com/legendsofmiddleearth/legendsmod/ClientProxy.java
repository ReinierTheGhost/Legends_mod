package com.legendsofmiddleearth.legendsmod;

import com.legendsofmiddleearth.legendsmod.gui.RingCrafterScreen;
import com.legendsofmiddleearth.legendsmod.init.ContainerLoader;

import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = LegendsMod.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientProxy {
	
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		ScreenManager.register(ContainerLoader.RING_CRAFTER_CONTAINER.get(), RingCrafterScreen::new);
	}

}
