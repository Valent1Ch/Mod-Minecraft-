package fr.tenvalin.mmav.World;

import fr.tenvalin.mmav.MMAV;
import fr.tenvalin.mmav.World.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MMAV.MODID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadEvent(BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
    }






}
