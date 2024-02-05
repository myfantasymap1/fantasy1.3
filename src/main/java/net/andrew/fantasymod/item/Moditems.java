package net.andrew.fantasymod.item;

import net.andrew.fantasymod.FantasyMod;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraftforge.registries.ForgeRegistries.BLOCKS;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FantasyMod.MOD_ID);

    public static final RegistryObject<Item> DWARF =ITEMS.register("dwarf",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.DWARF)));
    public static final RegistryObject<Item>RAW_DWARF =ITEMS.register("raw_dwarf",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.DWARF)));
    public static final RegistryObject<Item> ELF=ITEMS.register("elf",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.ELF)));
    public static final RegistryObject<Item> ORC=ITEMS.register("orc",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.ORE)));
    public static final RegistryObject<Item> TROLL=ITEMS.register("troll",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.TROLL)));
    public static final RegistryObject<Item> MORDOR=ITEMS.register("mordor",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.MORDOR)));
    public static final RegistryObject<Item> IRONDWARF=ITEMS.register("irondwarf",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.IRONDWARF)));
    public static final RegistryObject<Item> HIGHELF=ITEMS.register("highelf",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.HIGHELF)));









    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
