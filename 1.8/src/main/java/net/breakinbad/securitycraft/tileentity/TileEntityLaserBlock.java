package net.breakinbad.securitycraft.tileentity;

import net.breakinbad.securitycraft.api.CustomizableSCTE;
import net.breakinbad.securitycraft.main.Utils.ModuleUtils;
import net.breakinbad.securitycraft.main.mod_SecurityCraft;
import net.breakinbad.securitycraft.misc.EnumCustomModules;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class TileEntityLaserBlock extends CustomizableSCTE {
	
	public void onModuleInserted(ItemStack stack, EnumCustomModules module){
		ModuleUtils.checkInAllDirsAndInsertModule(worldObj, pos, mod_SecurityCraft.LaserBlock, mod_SecurityCraft.configHandler.laserBlockRange, stack, true);
	}
	
	public void onModuleRemoved(ItemStack stack, EnumCustomModules module){
		ModuleUtils.checkInAllDirsAndRemoveModule(worldObj, pos, mod_SecurityCraft.LaserBlock, mod_SecurityCraft.configHandler.laserBlockRange, module, true);
	}

	public EnumCustomModules[] getCustomizableOptions() {
		return new EnumCustomModules[]{EnumCustomModules.HARMING, EnumCustomModules.WHITELIST};
	}

	public String[] getOptionDescriptions() {
		return new String[]{EnumChatFormatting.UNDERLINE + "Harming module:" + EnumChatFormatting.RESET + "\n\nAdding a harming module to a laser block will cause players to take damage if they step through the lasers.", EnumChatFormatting.UNDERLINE + "Whitelist module:" + EnumChatFormatting.RESET + "\n\nAdding a whitelist module to a laser block will allow players to walk through the lasers without emitting a redstone signal."};
	}

}
