package com.kurv.additionalrecipes;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(AdditionalRecipes.MOD_ID)
public class AdditionalRecipes {
    public static final String MOD_ID = "kurvsadditionalrecipes";
    public static final Logger LOGGER = LogUtils.getLogger();
    public AdditionalRecipes(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {   }

    // Add a block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) { }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Does something when the server starts
        LOGGER.info("Hey there! The server has loaded.");
    }
}
