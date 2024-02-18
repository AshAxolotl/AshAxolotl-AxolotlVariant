package ashaxolotl.ashaxolotlaxolotlvariant.registries;

import ashaxolotl.ashaxolotlaxolotlvariant.AshAxolotlAxolotlVariantMod;
import ashaxolotl.ashaxolotlaxolotlvariant.ModAxolotlVariants;
import fabric.io.github.akashiikun.mavapi.v1.api.ModdedAxolotlVariant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.axolotl.Axolotl;

public class ModVariants {
    public static void register() {
        LoadVariants();
    }

    public static void LoadVariants()
    {
        for(ModAxolotlVariants variant: ModAxolotlVariants.values()) {
            ModdedAxolotlVariant.Builder builder = ModdedAxolotlVariant.register(new ResourceLocation(AshAxolotlAxolotlVariantMod.MOD_ID, variant.getName()));

            if (variant.isNatural()) {
                builder.natural();
            }
            Axolotl.Variant build = builder.build();
            variant.setVariant(build);
        }

        AshAxolotlAxolotlVariantMod.LOGGER.info("Loading " + ModAxolotlVariants.values().length + " Axolotl Variants");
    }
}
