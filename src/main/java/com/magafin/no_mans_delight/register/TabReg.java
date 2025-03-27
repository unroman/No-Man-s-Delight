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
        output.accept(ItemReg.PEAR_MUFFIN_ITEM.get());
        output.accept(ItemReg.SWEET_BERRY_ITEM.get());
        output.accept(ItemReg.GLOW_BERRY_ITEM.get());
        output.accept(ItemReg.WALNUT_MUFFIN_ITEM.get());
        output.accept(ItemReg.VENISON_MEDALLIONS.get());
        output.accept(ItemReg.COOKED_VENISON_MEDALLIONS.get());
        output.accept(ItemReg.HORSE_LOIN.get());
        output.accept(ItemReg.COOKED_HORSE_LOIN.get());
        output.accept(ItemReg.SHROOMBURGER.get());
        output.accept(ItemReg.HORSE_SANDWICH.get());
        output.accept(ItemReg.STUFFED_VENISON.get());
        output.accept(ItemReg.VENISON_TART.get());
        output.accept(ItemReg.VENISON_ROULADE.get());
        output.accept(ItemReg.VENISON_ROULADE_BLOCK_ITEM.get());
        output.accept(ItemReg.HONEY_GLAZED_BILLHOOK_BASS.get());
        output.accept(ItemReg.HORSE_STEAK_WITH_FRUITS.get());
        output.accept(ItemReg.MUSHROOMS_WITH_TOMATO.get());
        output.accept(ItemReg.SWEET_FROG_LEGS.get());


    }).build());
}
