package net.andrew.fantasymod.item;

import net.andrew.fantasymod.FantasyMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FantasyMod.MOD_ID);


    public static final RegistryObject<Item> DWARF =ITEMS.register("dwarf",
            ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ELF =ITEMS.register("elf",
            ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ORC =ITEMS.register("orc",
            ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));




    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
