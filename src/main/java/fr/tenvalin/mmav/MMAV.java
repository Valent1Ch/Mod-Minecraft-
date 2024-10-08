package fr.tenvalin.mmav;

import fr.tenvalin.mmav.init.ModBlocks;
import fr.tenvalin.mmav.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MMAV.MODID)
public class MMAV {

    public static final String MODID = "mmav";

    public MMAV() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);

        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);

    }

    private void setup(FMLCommonSetupEvent event) {
        // Configuration commune
    }

    private void clientSetup(FMLClientSetupEvent event) {
        // Enregistrer les renderers ici si nécessaire
    }
}
