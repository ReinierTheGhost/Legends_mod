package com.legendsofmiddleearth.legendsmod.tileentity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.legendsofmiddleearth.legendsmod.init.TileEntityLoader;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class RingCrafterTileEntity extends TileEntity {

	public static int slots = 1;

	protected NonNullList<ItemStack> items = NonNullList.withSize(slots, ItemStack.EMPTY);

	private final ItemStackHandler itemHandler = createHandler();
	private final LazyOptional<IItemHandler> handler = LazyOptional.of(() -> itemHandler);

	protected RingCrafterTileEntity(TileEntityType<?> typeIn) {
		super(typeIn);
		// TODO Auto-generated constructor stub
	}

	public RingCrafterTileEntity() {
		this(TileEntityLoader.RING_CRAFTER_TILE.get());
	}

	@Override
	public void load(BlockState state, CompoundNBT nbt) {
		itemHandler.deserializeNBT(nbt.getCompound("inv"));
		super.load(state, nbt);
	}

	@Override
	public CompoundNBT save(CompoundNBT compount) {
		compount.put("inv", itemHandler.serializeNBT());
		return super.save(compount);
	}

	private ItemStackHandler createHandler() {
		// TODO Auto-generated method stub
		return new ItemStackHandler(10) {
			@Override
			protected void onContentsChanged(int slot) {
				setChanged();
			}

			@Override
			public int getSlotLimit(int slot) {
				// TODO Auto-generated method stub
				return slots;
			}
		};
	}

	@Nonnull
	@Override
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
		if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
			return handler.cast();
		}
		return super.getCapability(cap, side);
	}
}
