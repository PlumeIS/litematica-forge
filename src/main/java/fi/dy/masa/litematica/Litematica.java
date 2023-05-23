package fi.dy.masa.litematica;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fi.dy.masa.malilib.event.InitializationHandler;


@Mod("litematica")
public class Litematica
{
    public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);

    public Litematica()
    {
        InitializationHandler.getInstance().registerInitializationHandler(new InitHandler());
    }
}
