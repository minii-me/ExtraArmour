package net.minii.extraarmour.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minii.extraarmour.ExtraArmour;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraArmour.MOD_ID);

    public static final RegistryObject<Item> WaxedPaper = ITEMS.register("waxedpaper", () -> new Item(new Item.Properties()));
    
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
