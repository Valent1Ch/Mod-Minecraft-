package fr.tenvalin.mmav.World.gen;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.function.Supplier;

public class ModOreGeneration {

    public static void generateOres(final BiomeLoadingEvent event) {
        for (OreType ore : OreType.values()) {
            OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241882_a, // Utilisation du champ privé
                    ore.getBlock().get().getDefaultState(), ore.getMaxVeinSize());

            // Configuration du placement du minerai
            ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.field_242908_m.configure(
                    new TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));

            ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreFeatureConfig, configuredPlacement);

            // Ajout de la caractéristique au biome
            addFeatureToBiome(event, GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
        }
    }

    private static ConfiguredFeature<?, ?> registerOreFeature(OreType ore, OreFeatureConfig oreFeatureConfig, ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement) {
        return Registry.register(WorldGenRegistries.field_243653_e, ore.getBlock().get().getRegistryName(),
                Feature.ORE.withConfiguration(oreFeatureConfig).withPlacement(configuredPlacement)
                        .func_242728_a().func_242731_b(ore.getMaxVeinSize())); // Assurez-vous que ces méthodes sont disponibles
    }

    private static void addFeatureToBiome(BiomeLoadingEvent event, GenerationStage.Decoration stage, ConfiguredFeature<?, ?> feature) {
        // Créer un Supplier pour la ConfiguredFeature
        Supplier<ConfiguredFeature<?, ?>> featureSupplier = () -> feature;

        // Accéder à la liste des caractéristiques pour l'étape de génération spécifiée
        List<Supplier<ConfiguredFeature<?, ?>>> features = event.getGeneration().getFeatures(stage);
        features.add(featureSupplier);
    }
}
