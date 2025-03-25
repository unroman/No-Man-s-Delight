package com.magafin.no_mans_delight.register;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.magafin.no_mans_delight.No_mans_delight.MODID;

public class TabReg {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create( Registries.CREATIVE_MODE_TAB,MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NMD_TAB = TABS.register("nmd_tab", () -> CreativeModeTab.builder().icon(() -> ItemReg.APPLE_MUFFIN_ITEM.get().getDefaultInstance()).displayItems((parameters, output) -> {
        output.accept(ItemReg.APPLE_MUFFIN_ITEM.get());

    }).build());
}
