package com.legendsofmiddleearth.legendsmod.block;

import javax.annotation.Nullable;

import com.legendsofmiddleearth.legendsmod.container.RingCrafterContainer;
import com.legendsofmiddleearth.legendsmod.init.TileEntityLoader;
import com.legendsofmiddleearth.legendsmod.tileentity.RingCrafterTileEntity;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class RingCrafter extends Block {

	public RingCrafter() {
		super(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(15f));
	}

	@Override
	public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn,
			BlockRayTraceResult hit) {
		if (!worldIn.isClientSide) {
			TileEntity tileEntity = worldIn.getBlockEntity(pos);
			if (tileEntity instanceof RingCrafterTileEntity) {
				INamedContainerProvider containerProvider = createContainerProvider(worldIn, pos);

				NetworkHooks.openGui(((ServerPlayerEntity) player), containerProvider, tileEntity.getBlockPos());
			}
		}
		return ActionResultType.SUCCESS;
	}

	private INamedContainerProvider createContainerProvider(World worldIn, BlockPos pos) {
		return new INamedContainerProvider() {
			@Override
			public ITextComponent getDisplayName() {
				return new TranslationTextComponent("screen.ring_crafter");
			}

			@Nullable
			@Override
			public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
				return new RingCrafterContainer(i, worldIn, pos, playerInventory, playerEntity);
			}
		};
	}

	@Nullable
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityLoader.RING_CRAFTER_TILE.get().create();
	}
}
