package com.magafin.no_mans_delight.register;

import com.magafin.no_mans_delight.No_mans_delight;
import com.magafin.no_mans_delight.block.StuffedShelfMushroomBlock;
import com.magafin.no_mans_delight.block.VenisonRouladeBlock;
import com.magafin.no_mans_delight.common.block.CocoaPuddingBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import vectorwing.farmersdelight.common.block.FeastBlock;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import com.farcr.nomansland.common.registry.blocks.NMLBlocks;

import java.util.function.Supplier;

public class BlockReg {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, No_mans_delight.MODID);

    public static final Supplier<Block> VENISON_ROULADE_BLOCK = BLOCKS.register("venison_roulade_block",
            () -> new VenisonRouladeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), com.magafin.no_mans_delight.register.ItemReg.VENISON_ROULADE, true));
    public static final Supplier<Block> STUFFED_SHELF_MUSHROOM_BLOCK = BLOCKS.register("stuffed_shelf_mushroom_block",
            () -> new StuffedShelfMushroomBlock(BlockBehaviour.Properties.ofFullCopy(NMLBlocks.SHELF_MUSHROOM_BLOCK.get()), com.magafin.no_mans_delight.register.ItemReg.STUFFED_SHELF_MUSHROOM, false));
    public static final Supplier<Block> COCOA_PUDDING_BLOCK = BLOCKS.register("cocoa_pudding_block",
            () -> new CocoaPuddingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), com.magafin.no_mans_delight.register.ItemReg.COCOA_PUDDING, false));
}