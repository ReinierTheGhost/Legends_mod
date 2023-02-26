package com.legendsofmiddleearth.legendsmod.init;

import com.legendsofmiddleearth.legendsmod.LegendsMod;
import com.legendsofmiddleearth.legendsmod.container.RingCrafterContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerLoader {

	public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister
			.create(ForgeRegistries.CONTAINERS, LegendsMod.MODID);

	public static final RegistryObject<ContainerType<RingCrafterContainer>> RING_CRAFTER_CONTAINER = CONTAINERS
			.register("ring_crafter", () -> IForgeContainerType.create(((windowId, inv, data) -> {
				BlockPos pos = data.readBlockPos();
				World world = inv.player.getCommandSenderWorld();
				return new RingCrafterContainer(windowId, world, pos, inv, inv.player);
			})));
	
	public static void register(IEventBus eventBus) {
		CONTAINERS.register(eventBus);
	}
}
