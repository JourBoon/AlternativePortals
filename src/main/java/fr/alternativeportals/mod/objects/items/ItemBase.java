package fr.alternativeportals.mod.objects.items;

import fr.alternativeportals.mod.AlternativePortals;
import fr.alternativeportals.mod.init.ItemInit;
import fr.alternativeportals.mod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		AlternativePortals.proxy.registerItemRenderer(this, 0, "inventory");
	}


}
