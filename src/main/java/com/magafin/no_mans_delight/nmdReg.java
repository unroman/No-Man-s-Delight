package com.magafin.no_mans_delight;

import com.magafin.no_mans_delight.block.VenisonRouladeBlock;
import com.magafin.no_mans_delight.food_values.FoodValues;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import java.util.function.Supplier;

import static com.magafin.no_mans_delight.No_mans_delight.MODID;
import static com.magafin.no_mans_delight.nmdRegBlock.*;
import static vectorwing.farmersdelight.common.registry.ModItems.basicItem;

public class nmdReg {
    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food);
    }
    public static Item.Properties bigFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).stacksTo(32);
    }
    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }
    public static final DeferredRegister.Blocks BLOCK = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, MODID);

    public static final DeferredItem<Item> STUFFED_VENISON = ITEMS.register("stuffed_venison", registryName ->
            new ConsumableItem(bowlFoodItem(FoodValues.STUFFED_VENISON), true));
    public static final DeferredItem<Item> HONEY_GLAZED_BILLHOOK_BASS = ITEMS.register("honey_glazed_billhook_bass", registryName ->
            new ConsumableItem(bowlFoodItem(FoodValues.HONEY_GLAZED_BILLHOOK_BASS), true));
    public static final DeferredItem<Item> HORSE_STEAK_WITH_FRUITS = ITEMS.register("horse_steak_with_fruits", registryName ->
            new ConsumableItem(bowlFoodItem(FoodValues.HORSE_STEAK_WITH_FRUITS), true));
    public static final DeferredItem<Item> MUSHROOMS_WITH_TOMATO = ITEMS.register("mushrooms_with_tomato", registryName ->
            new ConsumableItem(bowlFoodItem(FoodValues.MUSHROOMS_WITH_TOMATO), true));
    public static final DeferredItem<Item> SWEET_FROG_LEGS = ITEMS.register("sweet_frog_legs", registryName ->
            new ConsumableItem(bowlFoodItem(FoodValues.SWEET_FROG_LEGS), true));
    public static final DeferredItem<Item> VENISON_TART = ITEMS.register("venison_tart", registryName ->
            new ConsumableItem(bowlFoodItem(FoodValues.VENISON_TART), true));
    public static final DeferredItem<Item> SHROOMBURGER = ITEMS.register("shroomburger", registryName ->
            new ConsumableItem(foodItem(FoodValues.SHROOMBURGER), false));
    public static final DeferredItem<Item> HORSE_SANDWICH = ITEMS.register("horse_sandwich", registryName ->
            new ConsumableItem(bigFoodItem(FoodValues.HORSE_SANDWICH), false));
    public static final DeferredItem<Item> HORSE_LOIN = ITEMS.register("horse_loin", registryName ->
            new ConsumableItem(foodItem(FoodValues.HORSE_LOIN), false));
    public static final DeferredItem<Item> COOKED_HORSE_LOIN = ITEMS.register("cooked_horse_loin", registryName ->
            new ConsumableItem(foodItem(FoodValues.COOKED_HORSE_LOIN), false));
    public static final DeferredItem<Item> VENISON_MEDALLIONS = ITEMS.register("venison_medallions", registryName ->
            new ConsumableItem(foodItem(FoodValues.VENISON_MEDALLIONS), false));
    public static final DeferredItem<Item> COOKED_VENISON_MEDALLIONS = ITEMS.register("cooked_venison_medallions", registryName ->
            new ConsumableItem(foodItem(FoodValues.COOKED_VENISON_MEDALLIONS), false));
    public static final DeferredItem<Item> VENISON_ROULADE = ITEMS.register("plated_venison_roulade", registryName ->
            new ConsumableItem(foodItem(FoodValues.VENISON_ROULADE).craftRemainder(Items.BOWL), true));
    public static final DeferredItem<Item> VENISON_ROULADE_BLOCK_ITEM = ITEMS.register("venison_roulade_block",()->
            new BlockItem((Block)nmdRegBlock.VENISON_ROULADE_BLOCK.get(), basicItem().stacksTo(1)));
    public static final DeferredItem<Item> APPLE_MUFFIN_SLICE = ITEMS.register("apple_muffin_slice", registryName ->
            new ConsumableItem(foodItem(FoodValues.APPLE_MUFFIN_SLICE), false));
    public static final DeferredItem<Item> APPLE_MUFFIN_ITEM = ITEMS.register("apple_muffin_block",()->
            new BlockItem((Block)nmdRegBlock.APPLE_MUFFIN.get(), basicItem().stacksTo(1)));
}


