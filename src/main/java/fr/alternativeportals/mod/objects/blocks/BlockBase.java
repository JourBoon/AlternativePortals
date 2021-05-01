package fr.alternativeportals.mod.objects.blocks;

import fr.alternativeportals.mod.AlternativePortals;
import fr.alternativeportals.mod.init.BlockInit;
import fr.alternativeportals.mod.init.ItemInit;
import fr.alternativeportals.mod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material material) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}
	
	@Override
	public void registerModels() {
		AlternativePortals.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getBlockLayer() {
			return BlockRenderLayer.CUTOUT_MIPPED;
	
	}
}
