package com.magafin.no_mans_delight.register;

import com.magafin.no_mans_delight.No_mans_delight;
import com.magafin.no_mans_delight.block.MuffinBlock;
import com.magafin.no_mans_delight.block.VenisonRouladeBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class BlockReg {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, No_mans_delight.MODID);

    public static final Supplier<Block> VENISON_ROULADE_BLOCK = BLOCKS.register("venison_roulade_block",
            () -> new VenisonRouladeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemReg.VENISON_ROULADE, true));
    public static final Supplier<Block> APPLE_MUFFIN = BLOCKS.register("apple_muffin",
            () -> new MuffinBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemReg.APPLE_MUFFIN_SLICE));
}