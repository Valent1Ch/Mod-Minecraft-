package fr.tenvalin.mmav.World.gen;

import fr.tenvalin.mmav.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {

    SKULK(Lazy.of(ModBlocks.SKULK_ORE),4,25,50);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;


    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;


    }

    public Lazy<Block> getBlock() {
        return block;
    }
    public int getMaxVeinSize() {
        return maxVeinSize;
    }
    public int getMinHeight() {
        return minHeight;
    }
    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType getOreType(Block block) {
        for (OreType type : OreType.values()) {
            if (block == type.getBlock().get()) {
                return type;
            }
        }
        return null;
    }

}
