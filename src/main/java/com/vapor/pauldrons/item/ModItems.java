package com.vapor.pauldrons.item;

import com.vapor.pauldrons.Pauldrons;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Pauldrons.MODID);

    public static final DeferredItem<Item> ITEMGODSBLOOD = ITEMS.register("godsblood",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus)  {
        ITEMS.register(eventBus);

    }
}
