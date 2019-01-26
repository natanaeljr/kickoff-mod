package natanaeljr.kickoff.init;

import natanaeljr.kickoff.KickOffMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * KickOff Items Manager
 */
/* Automatically register class to MinecraftForge.EVENT_BUS when @Mod class is constructed */
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

    /**
     * Register the items to the GameRegistry
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        KickOffMod.logger.trace("Registering Items...");
        IForgeRegistry<Item> items = event.getRegistry();
        /* Register items */
        items.register(BOX);
    }

    /**
     * Register item models to ModelLoader
     */
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event)
    {
        KickOffMod.logger.trace("Registering all Items Models...");
        /*
         * Note: Unlike blocks, which automatically have a default IStateMapper that works without
         * any extra registration, items must be registered to their models manually.
         */
        ModelLoader.setCustomModelResourceLocation(BOX, 0,
                new ModelResourceLocation(KickOffMod.prefixNamespace("box"), "inventory"));
    }
}
