package com.magafin.no_mans_delight.register;

import com.magafin.no_mans_delight.No_mans_delight;
import com.magafin.no_mans_delight.block.LargePieBlock;
import com.magafin.no_mans_delight.block.MuffinBlock;
import com.magafin.no_mans_delight.block.NmdPizzaBlock;
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
    public static final Supplier<Block> PEAR_MUFFIN = BLOCKS.register("pear_muffin",
            () -> new MuffinBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemReg.PEAR_MUFFIN_SLICE));
    public static final Supplier<Block> SWEET_BERRY_MUFFIN = BLOCKS.register("sweet_berry_muffin",
            () -> new MuffinBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemReg.SWEET_BERRY_MUFFIN_SLICE));
    public static final Supplier<Block> GLOW_BERRY_MUFFIN = BLOCKS.register("glow_berry_muffin",
            () -> new MuffinBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE).lightLevel((light) ->  2), ItemReg.GLOW_BERRY_MUFFIN_SLICE));
    public static final Supplier<Block> WALNUT_MUFFIN = BLOCKS.register("walnut_muffin",
            () -> new MuffinBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE).lightLevel((light) ->  2), ItemReg.WALNUT_MUFFIN_SLICE));
    public static final Supplier<Block> HUNTERS_PIZZA = BLOCKS.register("hunters_pizza",
            () -> new NmdPizzaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemReg.HUNTERS_PIZZA_SLICE));
    public static final Supplier<Block> VEGETABLE_PIZZA = BLOCKS.register("vegetable_pizza",
            () -> new NmdPizzaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemReg.VEGETABLE_PIZZA_SLICE));
    public static final Supplier<Block> CHEESE_PIZZA = BLOCKS.register("cheese_pizza",
            () -> new NmdPizzaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemReg.CHEESE_PIZZA_SLICE));
    public static final Supplier<Block> MUSHROOM_LARGE_PIE = BLOCKS.register("mushroom_large_pie",
            () -> new LargePieBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE).noOcclusion().requiresCorrectToolForDrops(), ItemReg.MUSHROOM_LARGE_PIE_SLICE));
}