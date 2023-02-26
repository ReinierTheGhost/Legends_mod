package com.legendsofmiddleearth.legendsmod.gui;

import com.legendsofmiddleearth.legendsmod.LegendsMod;
import com.legendsofmiddleearth.legendsmod.container.RingCrafterContainer;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class RingCrafterScreen extends ContainerScreen<RingCrafterContainer> {

	private final ResourceLocation GUI = new ResourceLocation(LegendsMod.MODID, "textures/gui/ring_crafter.png");

	public RingCrafterScreen(RingCrafterContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
		super(screenContainer, inv, titleIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(matrixStack);
		super.render(matrixStack, mouseX, mouseY, partialTicks);
		this.renderLabels(matrixStack, mouseX, mouseY);
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void renderBg(MatrixStack matrixStack, float partialTicks, int x, int y) {
		RenderSystem.color4f(1f, 1f, 1f, 1f);
		this.minecraft.getTextureManager().getTexture(GUI);
		int i = this.getGuiLeft();
		int j = this.getGuiTop();
		this.blit(matrixStack, i, j, 0, 0, this.getXSize(), this.getYSize());
	}

}
