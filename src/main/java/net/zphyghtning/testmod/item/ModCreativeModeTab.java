package net.zphyghtning.testmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TEST_TAB = new CreativeModeTab("testtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEST_ITEM.get());
        }
    };

//    c static final CreativeModeTab TEST_TAB = new CreativeModeTab("testtab") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModItems.TEST_ITEM.get());
//        }
//    };
}
