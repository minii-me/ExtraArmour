package net.minii.extraarmour.block;

import java.util.function.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minii.extraarmour.ExtraArmour;
import net.minii.extraarmour.item.ModItems;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraArmour.MOD_ID);

    public static final RegistryObject<Block> WaxedPaperBlock = registerBlock(
                "waxedpaper_block", () -> new Block(Block.Properties.of().
                strength(0.5f).sound(SoundType.BAMBOO_SAPLING)
            )
        );

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> blockObject = BLOCKS.register(name, block);
        registerBlockItem(name, blockObject);
        return blockObject;
    }
    
    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
