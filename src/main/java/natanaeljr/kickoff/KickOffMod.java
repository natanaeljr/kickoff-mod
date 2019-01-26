package natanaeljr.kickoff;

import natanaeljr.kickoff.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**
 * KickOff Mod main class
 */
@Mod(modid = KickOffMod.MODID, name = KickOffMod.NAME, version = KickOffMod.VERSION,
     acceptedMinecraftVersions = "1.12.2", acceptableSaveVersions = "1.12.2")
public class KickOffMod
{
    /* Constants */
    public static final String MODID = "kickoff";
    public static final String NAME = "Kick-Off";
    public static final String VERSION = "0.1-alpha";

    /* Instance */
    @Mod.Instance
    public static KickOffMod INSTANCE;

    /* Static fields */
    public static Logger logger;

    /**
     * KickOff proxy, based on the physical side
     */
    @SidedProxy(clientSide = "natanaeljr.kickoff.proxy.ClientProxy",
                serverSide = "natanaeljr.kickoff.proxy.ServerProxy")
    public static CommonProxy proxy;

    /**
     * Mod pre-initialization phase
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("pre-initialization phase");
        proxy.preInit(event);
    }

    /**
     * Mod Initialization phase
     */
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("initialization phase");
        proxy.init(event);
    }

    /**
     * Mod post-initialization phase
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        logger.info("post-initialization phase");
        proxy.postInit(event);
    }

    /**
     * Prefix a given string with the Mod Namespace (MODID)
     */
    public static String prefixNamespace(String value)
    {
        return KickOffMod.MODID + ":" + value;
    }
}
