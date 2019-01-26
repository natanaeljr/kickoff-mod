package natanaeljr.kickoff.init;

import natanaeljr.kickoff.KickOffMod;
import natanaeljr.kickoff.block.BlockBox;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * KickOff Blocks Manager
 */
/* Automatically register class to MinecraftForge.EVENT_BUS when @Mod class is constructed */
@Mod.EventBusSubscriber(modid = KickOffMod.MODID)
/* Automatically refresh the Block objects declared within the class */
@GameRegistry.ObjectHolder(KickOffMod.MODID)
public class Blocks
{
    /* All blocks */
    public static final Block BOX;

    /* Define the blocks */
    static {
        BOX = new BlockBox(Material.WOOD).setRegistryName(KickOffMod.MODID, "box")
                                         .setUnlocalizedName(KickOffMod.MODID + "." + "box")
                                         .setCreativeTab(CreativeTabs.DECORATIONS);
    }

    /**
     * Register the blocks to the GameRegistry
     */
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        KickOffMod.logger.trace("Registering Blocks...");
        IForgeRegistry<Block> blocks = event.getRegistry();
        /* Register blocks */
        blocks.register(BOX);
    }

    /**
     * Register block models to ModelLoader
     */
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event)
    {
        KickOffMod.logger.trace("Registering all Block Models...");
        /*
         * Note: Blocks have default state mappers that maps `IBlockState`s
         * to default `ModelResourceLocation`s automatically.
         */
    }
}
