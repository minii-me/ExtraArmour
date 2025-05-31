package net.minii.extraarmour.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minii.extraarmour.ExtraArmour;
import net.minii.extraarmour.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtraArmour.MOD_ID);
    
    public static final RegistryObject<CreativeModeTab> EXTRA_ARMOUR_TAB = CREATIVE_MODE_TABS.register("extra_armour_tab",
        () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.WaxedPaper.get()))
            .title(Component.translatable("creative_tab.miniiextraarmour.all"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.WaxedPaper.get());
                output.accept(ModBlocks.WaxedPaperBlock.get());
            })
            .build());
    
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
