package fr.alternativeportals.mod.events;

import java.awt.Color;

import net.minecraft.block.material.Material;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogColors;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogDensity;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class PlayerFogEvent {
	
	@SideOnly(Side.CLIENT)
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(FogDensity event)
    {
		if (event.getEntity().isInsideOfMaterial(Material.AIR))
		{
			
			event.setDensity(0.1F);
		} 
		else
		{
			event.setDensity(0.2F);
		}
  
		event.setCanceled(true); // must cancel event for event handler to take effect
    }

    
    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public static void onEvent(FogColors event){
    	
    	if (event.getEntity().getEntityWorld().isDaytime()) {
    		Color theColor = Color.GRAY;
    		event.setRed(theColor.getRed());
    		event.setGreen(theColor.getGreen());
    		event.setBlue(theColor.getBlue());
    	} else {
    		Color theColor = Color.BLACK;
    		event.setRed(theColor.getRed());
    		event.setGreen(theColor.getGreen());
    		event.setBlue(theColor.getBlue());
    	}
    	
    	if (event.getEntity().getEntityWorld().isRaining()) {
    		Color theColor = Color.DARK_GRAY;
    		event.setRed(theColor.getRed());
    		event.setGreen(theColor.getGreen());
    		event.setBlue(theColor.getBlue());
    		
    	}
    	
    	if (event.getEntity().getEntityWorld().isThundering()) {
    		Color theColor = Color.DARK_GRAY;
    		event.setRed(theColor.getRed());
    		event.setGreen(theColor.getGreen());
    		event.setBlue(theColor.getBlue());
    		
    	}
    	
    	if (event.getEntity().isInsideOfMaterial(Material.AIR))
    	{
    		Color theColor = Color.GRAY;
    		event.setRed(theColor.getRed());
    		event.setGreen(theColor.getGreen());
    		event.setBlue(theColor.getBlue());
    	}   
    	
    	if (event.getEntity().isInsideOfMaterial(Material.WATER))
    	{
    		Color theColor = Color.BLACK;
    		event.setRed(theColor.getRed());
    		event.setGreen(theColor.getGreen());
    		event.setBlue(theColor.getBlue());
    	}  
    }

}
