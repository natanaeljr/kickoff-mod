package natanaeljr.kickoff.init;

import natanaeljr.kickoff.KickOffMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@GameRegistry.ObjectHolder(KickOffMod.MODID)
public class Blocks
{
    /* All blocks */
    public static final Block BOX;

    /* Define the blocks */
    static {
        BOX = new Block(Material.WOOD).setRegistryName(KickOffMod.MODID, "box").setUnlocalizedName("box");
    }

    /* Register the blocks to the GameRegistry */
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> blocks = event.getRegistry();
        /* Register blocks */
        blocks.register(BOX);
    }
}
