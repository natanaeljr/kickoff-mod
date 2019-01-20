package natanaeljr.kickoff;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = KickOffMod.MODID, name = KickOffMod.NAME, version = KickOffMod.VERSION,
     acceptedMinecraftVersions = "1.12.2", acceptableSaveVersions = "1.12.2")
public class KickOffMod
{
    public static final String MODID = "kickoff";
    public static final String NAME = "Kick-Off";
    public static final String VERSION = "0.1-alpha";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info(NAME + " pre-initialization phase");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info(NAME + " initialization phase");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        logger.info(NAME + " post-initialization phase");
    }
}
