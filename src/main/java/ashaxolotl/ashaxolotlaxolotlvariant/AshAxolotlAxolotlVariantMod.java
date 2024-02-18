package ashaxolotl.ashaxolotlaxolotlvariant;

import ashaxolotl.ashaxolotlaxolotlvariant.registries.ModVariants;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AshAxolotlAxolotlVariantMod implements ModInitializer {
	public static final String MOD_ID = "ashaxolotl-axolotlvariant";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModVariants.register();
	}
}

// /summon minecraft:axolotl ~ ~ ~ {Variant:"ashaxolotl-axolotlvariant:ash"}