package net.breakinbad.securitycraft.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;

public class ContainerGeneric extends Container {
	
	public ContainerGeneric(InventoryPlayer inventory, TileEntity te){
		
	}

	public boolean canInteractWith(EntityPlayer playerIn) {
		return true;
	}

}
