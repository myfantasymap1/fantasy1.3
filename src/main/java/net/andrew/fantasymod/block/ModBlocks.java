package net.andrew.fantasymod.block;

import net.andrew.fantasymod.FantasyMod;
import net.andrew.fantasymod.item.ModCreativeModeTab;
import net.andrew.fantasymod.item.Moditems;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.Tag;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.extensions.IForgeBlockEntity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FantasyMod.MOD_ID);

    public static final RegistryObject<Block> DWARF_BLOCK =registryBlock("dwarf_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> DWARF_STONE =registryBlock("dwarf_stone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> DWARF_STONE_BRICKS =registryBlock("dwarf_stone_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> DWARF_GLOWSTONE =registryBlock("dwarf_glowstone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> DWARF_COBBLESTONE =registryBlock("dwarf_cobblestone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> DWARF_DEEPSLATE_MITHRIL_ORE =registryBlock("dwarf_deepslate_mithril_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> DWARF_DEEPSLATE_ORE =registryBlock("dwarf_deepslate_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> ELF_STONE =registryBlock("elf_stone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.ELF);
    public static final RegistryObject<Block> DWARF_PILLAR =registryBlock("dwarf_pillar",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> DWARF_MITHRIL_PILLAR =registryBlock("dwarf_mithril_pillar",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> DWARF_GATE_STONE =registryBlock("dwarf_gate_stone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> DWARF_HALL =registryBlock("dwarf_hall",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> IRON_DWARF_PILLAR =registryBlock("iron_dwarf_pillar",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.IRONDWARF);
    public static final RegistryObject<Block> DWARF_silver_stone =registryBlock("dwarf_silver_stone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> DWARF_STONE_ONE =registryBlock("dwarf_stone_one",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> DWARF_limestone=registryBlock("dwarf_limestone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> DWARF_PILLAR_ONE=registryBlock("dwarf_pillar_one",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> MORDOR_WALL=registryBlock("mordor_wall",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.MORDOR);
    public static final RegistryObject<Block> MORDOR_STONE=registryBlock("mordor_stone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.MORDOR);
    public static final RegistryObject<Block> MORDOR_BLACKSTONE=registryBlock("mordor_blackstone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.MORDOR);
    public static final RegistryObject<Block> MORDOR_BRICKSTONE=registryBlock("mordor_brickstone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.MORDOR);
    public static final RegistryObject<Block> MORDOR_black=registryBlock("mordor_black",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.MORDOR);
    public static final RegistryObject<Block> MORDOR_PATH=registryBlock("mordor_path",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.MORDOR);
    public static final RegistryObject<Block> MORDOR_limestone=registryBlock("mordor_limestone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.MORDOR);
    public static final RegistryObject<Block> MORDOR_EVIL_PILLAR=registryBlock("mordor_evil_pillar",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.MORDOR);
    public static final RegistryObject<Block> MORDOR_STONE_TWO=registryBlock("mordor_stone_two",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.MORDOR);;
    public static final RegistryObject<Block> ELF_COBBLESTONE=registryBlock("elf_cobblestone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.ELF);
    public static final RegistryObject<Block> FIRST_AGE_STONE=registryBlock("first_age_stone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> SECOND_DWARF_STONE=registryBlock("second_dwarf_stone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block>DWARF_SECOND=registryBlock("dwarf_second",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block>EVIL_DWARF_STONE=registryBlock("evil_dwarf_stone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.MORDOR);
    public static final RegistryObject<Block>MORDOR_EVIL_STONE=registryBlock("mordor_evil_stone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops()), ModCreativeModeTab.MORDOR);
    public static final RegistryObject<Block>DWARF_METAL=registryBlock("dwarf_metal",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block>DWARF_REDSTONE=registryBlock("dwarf_redstone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block>DWARForge_stone=registryBlock("dwarforge_stone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block>DWARForge_stoneone=registryBlock("dwarforge_stoneone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block>dwarfblack_stone=registryBlock("dwarfblack_stone",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block>dwarforge_pillar=registryBlock("dwarforge_pillar",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)), ModCreativeModeTab.DWARF);
    public static final RegistryObject<TorchBlock> ELF_TORCH = registryBlock("elf_torch",
            () -> new TorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH), ParticleTypes.FLAME), ModCreativeModeTab.ELF);
    public static final RegistryObject<TorchBlock> ELF_TORCH_WALL = registryBlock("elf_torch_wall",
            () -> new TorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH), ParticleTypes.FLAME), ModCreativeModeTab.ELF);
    public static final RegistryObject<TorchBlock> dwarf_TORCH = registryBlock("dwarf_torch",
            () -> new TorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH), ParticleTypes.FLAME), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block>DWARF_BRICK=registryBlock("dwarf_brick",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)), ModCreativeModeTab.DWARF);






    public static final RegistryObject<Block> DWARF_ORE =registryBlock("dwarf_ore",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.DWARF);
    public static final RegistryObject<Block> ELF_ORE =registryBlock("elf_ore",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5F).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.ELF);

;








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
