package ashaxolotl.ashaxolotlaxolotlvariant;

import net.minecraft.world.entity.animal.axolotl.Axolotl;

import java.util.Locale;

public enum ModAxolotlVariants {
    ASH(true);

    private final String name;
    private final boolean natural;
    private Axolotl.Variant variant;
    ModAxolotlVariants(boolean natural) {
        this.natural = natural;
        this.name = name().toLowerCase(Locale.ENGLISH);
    }

    public Axolotl.Variant getVariant() {
        return variant;
    }

    public String getName() {
        return this.name;
    }

    public boolean isNatural() {
        return natural;
    }

    public void setVariant(Axolotl.Variant variant) {
        this.variant = variant;
    }

    static {
        Axolotl.Variant.values(); // Ensure class is loaded before the variant is accessed
    }
}