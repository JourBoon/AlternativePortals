package fr.alternativeportals.mod.proxy;

import fr.alternativeportals.mod.events.PlayerFogEvent;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
		MinecraftForge.EVENT_BUS.register(new PlayerFogEvent());
	}
}
