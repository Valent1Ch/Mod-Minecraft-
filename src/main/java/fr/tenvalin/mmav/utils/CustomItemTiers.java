package fr.tenvalin.mmav.utils;

import fr.tenvalin.mmav.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum CustomItemTiers implements IItemTier {
    SKULK(4,420,6f,10f, 20, new LazyValue<>(() ->{return Ingredient.fromItems(ModItems.SKULK_IRON.get());})),
    SILICON(2,420 ,420 , 4f, 20, new LazyValue<>(() ->{return Ingredient.fromItems(ModItems.SILICON_INGOT.get());})),
    FIRE_DIAMOND(5,420 ,420 , 15f, 20, new LazyValue<>(() ->{return Ingredient.fromItems(ModItems.SILICON_INGOT.get());}));



    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    CustomItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, LazyValue<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
