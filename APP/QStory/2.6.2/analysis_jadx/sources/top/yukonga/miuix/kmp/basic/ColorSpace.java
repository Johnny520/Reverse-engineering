package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ltop/yukonga/miuix/kmp/basic/ColorSpace;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "HSV", "OKHSV", "OKLAB", "OKLCH", "miuix"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ColorSpace {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ ColorSpace[] $VALUES;
    public static final ColorSpace HSV = new ColorSpace("HSV", 0);
    public static final ColorSpace OKHSV = new ColorSpace("OKHSV", 1);
    public static final ColorSpace OKLAB = new ColorSpace("OKLAB", 2);
    public static final ColorSpace OKLCH = new ColorSpace("OKLCH", 3);

    private static final /* synthetic */ ColorSpace[] $values() {
        return new ColorSpace[]{HSV, OKHSV, OKLAB, OKLCH};
    }

    static {
        ColorSpace[] colorSpaceArr$values = $values();
        $VALUES = colorSpaceArr$values;
        $ENTRIES = AbstractC4363.m8876(colorSpaceArr$values);
    }

    private ColorSpace(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static ColorSpace valueOf(String str) {
        return (ColorSpace) Enum.valueOf(ColorSpace.class, str);
    }

    public static ColorSpace[] values() {
        return (ColorSpace[]) $VALUES.clone();
    }
}
