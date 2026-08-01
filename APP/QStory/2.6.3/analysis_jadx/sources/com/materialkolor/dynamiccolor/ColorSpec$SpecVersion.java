package com.materialkolor.dynamiccolor;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/materialkolor/dynamiccolor/ColorSpec$SpecVersion", "", "Lcom/materialkolor/dynamiccolor/ColorSpec$SpecVersion;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Companion", "com/materialkolor/dynamiccolor/飘花落叶言子楪世苏哲兰", "SPEC_2021", "SPEC_2025", "material-color-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ColorSpec$SpecVersion {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ ColorSpec$SpecVersion[] $VALUES;
    public static final C3802 Companion;
    private static final ColorSpec$SpecVersion Default;
    public static final ColorSpec$SpecVersion SPEC_2021;
    public static final ColorSpec$SpecVersion SPEC_2025;

    private static final /* synthetic */ ColorSpec$SpecVersion[] $values() {
        return new ColorSpec$SpecVersion[]{SPEC_2021, SPEC_2025};
    }

    static {
        ColorSpec$SpecVersion colorSpec$SpecVersion = new ColorSpec$SpecVersion("SPEC_2021", 0);
        SPEC_2021 = colorSpec$SpecVersion;
        SPEC_2025 = new ColorSpec$SpecVersion("SPEC_2025", 1);
        ColorSpec$SpecVersion[] colorSpec$SpecVersionArr$values = $values();
        $VALUES = colorSpec$SpecVersionArr$values;
        $ENTRIES = AbstractC4364.m8866(colorSpec$SpecVersionArr$values);
        Companion = new C3802();
        Default = colorSpec$SpecVersion;
    }

    private ColorSpec$SpecVersion(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static ColorSpec$SpecVersion valueOf(String str) {
        return (ColorSpec$SpecVersion) Enum.valueOf(ColorSpec$SpecVersion.class, str);
    }

    public static ColorSpec$SpecVersion[] values() {
        return (ColorSpec$SpecVersion[]) $VALUES.clone();
    }
}
