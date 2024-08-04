package fr.tenvalin.mmav.init;



import fr.tenvalin.mmav.MMAV;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MMAV.MODID);


    public static final RegistryObject<Block> SKULK_ORE = createBlock("skulk_ore",() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(3).func_235861_h_() ));
    public static final RegistryObject<Block> SILICON_BLOCK = createBlock("silicon_block",() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(1).func_235861_h_().slipperiness(1f).sound(SoundType.SLIME) ));


    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier) {

        RegistryObject<Block> block = BLOCKS.register(name , supplier);
        ModItems.ITEMS.register(name,() -> new BlockItem(block.get(),new Item.Properties()));
        return block;
    }

}