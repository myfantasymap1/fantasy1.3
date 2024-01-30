package net.andrew.fantasymod.item;


import net.andrew.fantasymod.FantasyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FantasyMod.MOD_ID);

    public static final RegistryObject<Item> DWARF = ITEMS.register("dwarf",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.FANTASY_TAB)));
    public static final RegistryObject<Item> RAW_DWARF = ITEMS.register("raw_dwarf",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.FANTASY_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
