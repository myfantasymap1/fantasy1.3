package net.andrew.fantasymod.item;

import net.andrew.fantasymod.FantasyMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DWARF = new CreativeModeTab("Dwarf") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.DWARF.get());

        }
    };
    public static final CreativeModeTab ELF = new CreativeModeTab("Elf") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.ELF.get());

        }
    };
    public static final CreativeModeTab ORE = new CreativeModeTab("Orc") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.ORC.get());

        }
    };
    public static final CreativeModeTab MORDOR = new CreativeModeTab("Mordor") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.MORDOR.get());
        }
    };
    public static final CreativeModeTab TROLL = new CreativeModeTab("Troll") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.TROLL.get());
        }
    };
    public static final CreativeModeTab IRONDWARF = new CreativeModeTab("IRONEDWARF") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.IRONDWARF.get());
        }
    };
    public static final CreativeModeTab HIGHELF = new CreativeModeTab("HIGHELF") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.HIGHELF.get());
        }
    };
}







