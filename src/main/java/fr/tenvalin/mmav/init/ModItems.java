package fr.tenvalin.mmav.init;

import fr.tenvalin.mmav.MMAV;
import fr.tenvalin.mmav.utils.CustomArmorMaterials;
import fr.tenvalin.mmav.utils.CustomItemTiers;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;




public class ModItems {


        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MMAV.MODID);
        public static final RegistryObject<Item> BATON_MAGIQUE = ITEMS.register("baton_magique", () -> new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));

        public static final RegistryObject<Item> SKULK_IRON = ITEMS.register("skulk_iron",() -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MATERIALS)));
        public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot",() -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MATERIALS)));
        public static final RegistryObject<Item> FIRE_DIAMOND = ITEMS.register("fire_diamond",() -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MATERIALS)));

        public static final RegistryObject<Item> FIRE_SWORD = ITEMS.register("fire_sword",() -> new SwordItem(CustomItemTiers.FIRE_DIAMOND,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
        public static final RegistryObject<Item> FIRE_PICKAXE = ITEMS.register("fire_pickaxe",() -> new PickaxeItem(CustomItemTiers.FIRE_DIAMOND,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
        public static final RegistryObject<Item> FIRE_AXE = ITEMS.register("fire_axe",() -> new AxeItem(CustomItemTiers.FIRE_DIAMOND,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
        public static final RegistryObject<Item> FIRE_HOE = ITEMS.register("fire_hoe",() -> new HoeItem(CustomItemTiers.FIRE_DIAMOND,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
        public static final RegistryObject<Item> FIRE_SHOVEL = ITEMS.register("fire_shovel",() -> new ShovelItem(CustomItemTiers.FIRE_DIAMOND,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));


        public static final RegistryObject<Item> SKULK_SWORD = ITEMS.register("skulk_sword",() -> new SwordItem(CustomItemTiers.SKULK,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
        public static final RegistryObject<Item> SKULK_PICKAXE = ITEMS.register("skulk_pickaxe",() -> new PickaxeItem(CustomItemTiers.SKULK,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
        public static final RegistryObject<Item> SKULK_AXE = ITEMS.register("skulk_axe",() -> new AxeItem(CustomItemTiers.SKULK,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
        public static final RegistryObject<Item> SKULK_HOE = ITEMS.register("skulk_hoe",() -> new HoeItem(CustomItemTiers.SKULK,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
        public static final RegistryObject<Item> SKULK_SHOVEL = ITEMS.register("skulk_shovel",() -> new ShovelItem(CustomItemTiers.SKULK,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));


        public static final RegistryObject<Item> SKULK_HELMET = ITEMS.register("skulk_helmet", () -> new ArmorItem(CustomArmorMaterials.SKULK_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
        public static final RegistryObject<Item> SKULK_CHESTPLATE = ITEMS.register("skulk_chestplate", () -> new ArmorItem(CustomArmorMaterials.SKULK_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
        public static final RegistryObject<Item> SKULK_LEGGINGS = ITEMS.register("skulk_leggings", () -> new ArmorItem(CustomArmorMaterials.SKULK_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
        public static final RegistryObject<Item> SKULK_BOOTS = ITEMS.register("skulk_boots", () -> new ArmorItem(CustomArmorMaterials.SKULK_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));








        public static final RegistryObject<Item> SILICON_SWORD = ITEMS.register("silicon_sword",() -> new SwordItem(CustomItemTiers.SILICON,0, -2.4f,new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));




//    public static final RegistryObject<Item> PIOCHE_SKULK = ITEMS.register("Pioche_en_SKULK",() -> new PickaxeItem(CustomItemTiers.SKULK), 0,-2,4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS));
//    public static final RegistryObject<Item> HACHE_SKULK = ITEMS.register("Hache_en_SKULK",() -> new AxeItem(CustomItemTiers.SILICON), 0,-2,4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS));



}


