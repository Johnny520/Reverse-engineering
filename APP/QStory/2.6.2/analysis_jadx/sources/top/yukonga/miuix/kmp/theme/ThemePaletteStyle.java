package top.yukonga.miuix.kmp.theme;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Ltop/yukonga/miuix/kmp/theme/ThemePaletteStyle;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "TonalSpot", "Neutral", "Vibrant", "Expressive", "Rainbow", "FruitSalad", "Monochrome", "Fidelity", "Content", "miuix"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ThemePaletteStyle {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ ThemePaletteStyle[] $VALUES;
    public static final ThemePaletteStyle TonalSpot = new ThemePaletteStyle("TonalSpot", 0);
    public static final ThemePaletteStyle Neutral = new ThemePaletteStyle("Neutral", 1);
    public static final ThemePaletteStyle Vibrant = new ThemePaletteStyle("Vibrant", 2);
    public static final ThemePaletteStyle Expressive = new ThemePaletteStyle("Expressive", 3);
    public static final ThemePaletteStyle Rainbow = new ThemePaletteStyle("Rainbow", 4);
    public static final ThemePaletteStyle FruitSalad = new ThemePaletteStyle("FruitSalad", 5);
    public static final ThemePaletteStyle Monochrome = new ThemePaletteStyle("Monochrome", 6);
    public static final ThemePaletteStyle Fidelity = new ThemePaletteStyle("Fidelity", 7);
    public static final ThemePaletteStyle Content = new ThemePaletteStyle("Content", 8);

    private static final /* synthetic */ ThemePaletteStyle[] $values() {
        return new ThemePaletteStyle[]{TonalSpot, Neutral, Vibrant, Expressive, Rainbow, FruitSalad, Monochrome, Fidelity, Content};
    }

    static {
        ThemePaletteStyle[] themePaletteStyleArr$values = $values();
        $VALUES = themePaletteStyleArr$values;
        $ENTRIES = AbstractC4363.m8876(themePaletteStyleArr$values);
    }

    private ThemePaletteStyle(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static ThemePaletteStyle valueOf(String str) {
        return (ThemePaletteStyle) Enum.valueOf(ThemePaletteStyle.class, str);
    }

    public static ThemePaletteStyle[] values() {
        return (ThemePaletteStyle[]) $VALUES.clone();
    }
}
