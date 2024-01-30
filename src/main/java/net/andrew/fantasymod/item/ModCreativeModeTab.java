package net.andrew.fantasymod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FANTASY_TAB = new CreativeModeTab("fantasytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.DWARF.get());
        }
    };
}
