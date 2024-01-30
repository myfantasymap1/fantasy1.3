package net.andrew.fantasymod.block;

import net.andrew.fantasymod.FantasyMod;
import net.andrew.fantasymod.item.ModCreativeModeTab;
import net.andrew.fantasymod.item.Moditems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FantasyMod.MOD_ID);

    public static final RegistryObject<Block> DWARF_BLOCK =registryBlock("dwarf_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.FANTASY_TAB);
    public static final RegistryObject<Block> DWARF_STONE =registryBlock("dwarf_stone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.FANTASY_TAB);
    public static final RegistryObject<Block> DWARF_STONE_BRICKS =registryBlock("dwarf_stone_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.FANTASY_TAB);
    public static final RegistryObject<Block> DWARF_GLOWSTONE =registryBlock("dwarf_glowstone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.FANTASY_TAB);
    public static final RegistryObject<Block> DWARF_COBBLESTONE =registryBlock("dwarf_cobblestone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.FANTASY_TAB);



    public static final RegistryObject<Block> DWARF_ORE =registryBlock("dwarf_ore",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.FANTASY_TAB);
    public static final RegistryObject<Block> DWARF_DEEPSLATE_ORE =registryBlock("dwarf_deepslate_ore",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.FANTASY_TAB);
    public static final RegistryObject<Block> DWARF_DEEPSLATE_MITHRIL_ORE =registryBlock("dwarf_deepslate_mithril_ore",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.FANTASY_TAB);



private static <T extends Block>RegistryObject<T>registryBlock(String name, Supplier<T> block, CreativeModeTab tab) {
    RegistryObject<T> toReturn =BLOCKS.register(name,block);
    registryBlockItem(name,toReturn,tab);
    return toReturn;
}
    private static <T extends Block> RegistryObject<Item>registryBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return Moditems.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
