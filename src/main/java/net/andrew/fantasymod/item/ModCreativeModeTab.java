package net.andrew.fantasymod.item;

import net.andrew.fantasymod.FantasyMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FANTASY_TAB = new CreativeModeTab("dwarftab") {
        @Override public
        ItemStack makeIcon() {
            return new ItemStack(Moditems.DWARF.get());

        }
    };
    public static final CreativeModeTab FANTASY_TAB1 = new CreativeModeTab("elftab1") {
        @Override public
        ItemStack makeIcon() {
            return new ItemStack(Moditems.ELF.get());

        }
    };

    public static final CreativeModeTab FANTASY_TAB2 = new CreativeModeTab("orctab2") {
        @Override public
        ItemStack makeIcon() {
            return new ItemStack(Moditems.ORC.get());

        }
    };
}