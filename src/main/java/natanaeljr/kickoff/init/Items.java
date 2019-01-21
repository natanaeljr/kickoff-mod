package natanaeljr.kickoff.init;

import natanaeljr.kickoff.KickOffMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

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
        IForgeRegistry<Item> items = event.getRegistry();
        /* Register items */
        items.register(BOX);
    }
}
