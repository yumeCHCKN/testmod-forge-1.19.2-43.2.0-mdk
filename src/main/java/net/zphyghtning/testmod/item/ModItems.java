package net.zphyghtning.testmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.zphyghtning.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public class final DeferredRegister<Item> ITEMS *
        DeferredRegister.create(ForgeRegistries.ITEMS,TestMod.MOD_ID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

//    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
//            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
