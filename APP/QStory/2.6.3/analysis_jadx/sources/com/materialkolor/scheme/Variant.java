package com.materialkolor.scheme;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/materialkolor/scheme/Variant;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "MONOCHROME", "NEUTRAL", "TONAL_SPOT", "VIBRANT", "EXPRESSIVE", "FIDELITY", "CONTENT", "RAINBOW", "FRUIT_SALAD", "material-color-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Variant {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ Variant[] $VALUES;
    public static final Variant MONOCHROME = new Variant("MONOCHROME", 0);
    public static final Variant NEUTRAL = new Variant("NEUTRAL", 1);
    public static final Variant TONAL_SPOT = new Variant("TONAL_SPOT", 2);
    public static final Variant VIBRANT = new Variant("VIBRANT", 3);
    public static final Variant EXPRESSIVE = new Variant("EXPRESSIVE", 4);
    public static final Variant FIDELITY = new Variant("FIDELITY", 5);
    public static final Variant CONTENT = new Variant("CONTENT", 6);
    public static final Variant RAINBOW = new Variant("RAINBOW", 7);
    public static final Variant FRUIT_SALAD = new Variant("FRUIT_SALAD", 8);

    private static final /* synthetic */ Variant[] $values() {
        return new Variant[]{MONOCHROME, NEUTRAL, TONAL_SPOT, VIBRANT, EXPRESSIVE, FIDELITY, CONTENT, RAINBOW, FRUIT_SALAD};
    }

    static {
        Variant[] variantArr$values = $values();
        $VALUES = variantArr$values;
        $ENTRIES = AbstractC4364.m8866(variantArr$values);
    }

    private Variant(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static Variant valueOf(String str) {
        return (Variant) Enum.valueOf(Variant.class, str);
    }

    public static Variant[] values() {
        return (Variant[]) $VALUES.clone();
    }
}
