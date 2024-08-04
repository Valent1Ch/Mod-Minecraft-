package fr.tenvalin.mmav.init;

import fr.tenvalin.mmav.MMAV;
import fr.tenvalin.mmav.utils.CustomItemTiers;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;




public class ModItems {


        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MMAV.MODID);
        public static final RegistryObject<Item> BATON_MAGIQUE = ITEMS.register("baton_magique", () -> new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));

        public static final RegistryObject<Item> SKULK_IRON = ITEMS.register("skulk_iron",() -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MATERIALS)));
        public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot",() -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MATERIALS)));





        public static final RegistryObject<Item> SKULK_SWORD = ITEMS.register("skulk_sword",() -> new SwordItem(CustomItemTiers.SKULK,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
        public static final RegistryObject<Item> SKULK_PICKAXE = ITEMS.register("skulk_pickaxe",() -> new SwordItem(CustomItemTiers.SKULK,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
        public static final RegistryObject<Item> SKULK_AXE = ITEMS.register("skulk_axe",() -> new SwordItem(CustomItemTiers.SKULK,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
        public static final RegistryObject<Item> SKULK_HOE = ITEMS.register("skulk_hoe",() -> new SwordItem(CustomItemTiers.SKULK,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
        public static final RegistryObject<Item> SKULK_SHOVEL = ITEMS.register("skulk_shovel",() -> new SwordItem(CustomItemTiers.SKULK,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));





        public static final RegistryObject<Item> SILICON_SWORD = ITEMS.register("silicon_sword",() -> new SwordItem(CustomItemTiers.SILICON,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));




//    public static final RegistryObject<Item> PIOCHE_SKULK = ITEMS.register("Pioche_en_SKULK",() -> new PickaxeItem(CustomItemTiers.SKULK), 0,-2,4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS));
//    public static final RegistryObject<Item> HACHE_SKULK = ITEMS.register("Hache_en_SKULK",() -> new AxeItem(CustomItemTiers.SILICON), 0,-2,4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS));



}


