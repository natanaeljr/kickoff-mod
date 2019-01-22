package natanaeljr.kickoff.init;

import natanaeljr.kickoff.KickOffMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

/* Automatically register class to MinecraftForge.EVENT_BUS and @Mod class is constructed */
@Mod.EventBusSubscriber(modid = KickOffMod.MODID)
/* Automatically refresh the Block objects declared within the class */
@GameRegistry.ObjectHolder(KickOffMod.MODID)
public class Blocks
{
    /* All blocks */
    public static final Block BOX;

    /* Define the blocks */
    static {
        BOX = new Block(Material.WOOD).setRegistryName(KickOffMod.MODID, "box").setUnlocalizedName(KickOffMod.MODID + "." + "box");
    }

    /* Register the blocks to the GameRegistry */
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        KickOffMod.logger.trace("Registering Blocks...");
        IForgeRegistry<Block> blocks = event.getRegistry();
        /* Register blocks */
        blocks.register(BOX);
    }
}
