package natanaeljr.kickoff.init;

import natanaeljr.kickoff.KickOffMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

/* Automatically register class to MinecraftForge.EVENT_BUS and @Mod class is constructed */
@Mod.EventBusSubscriber(modid = KickOffMod.MODID)
/* Automatically refresh the Items declared within the class */
@GameRegistry.ObjectHolder(KickOffMod.MODID)
public class Items
{
    /* All items */
    public static final Item BOX;

    /* Define the items */
    static {
        BOX = new ItemBlock(Blocks.BOX).setRegistryName(Blocks.BOX.getRegistryName());
    }

    /* Register the items to the GameRegistry */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        KickOffMod.logger.trace("Registering Items...");
        IForgeRegistry<Item> items = event.getRegistry();
        /* Register items */
        items.register(BOX);
    }
}
