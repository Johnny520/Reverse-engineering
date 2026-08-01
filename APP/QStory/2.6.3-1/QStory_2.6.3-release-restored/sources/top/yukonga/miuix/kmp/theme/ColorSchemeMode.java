package top.yukonga.miuix.kmp.theme;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m151d2 = {"Ltop/yukonga/miuix/kmp/theme/ColorSchemeMode;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "System", "Light", "Dark", "MonetSystem", "MonetLight", "MonetDark", "miuix"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class ColorSchemeMode {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ ColorSchemeMode[] $VALUES;
    public static final ColorSchemeMode System = new ColorSchemeMode("System", 0);
    public static final ColorSchemeMode Light = new ColorSchemeMode("Light", 1);
    public static final ColorSchemeMode Dark = new ColorSchemeMode("Dark", 2);
    public static final ColorSchemeMode MonetSystem = new ColorSchemeMode("MonetSystem", 3);
    public static final ColorSchemeMode MonetLight = new ColorSchemeMode("MonetLight", 4);
    public static final ColorSchemeMode MonetDark = new ColorSchemeMode("MonetDark", 5);

    private static final /* synthetic */ ColorSchemeMode[] $values() {
        return new ColorSchemeMode[]{System, Light, Dark, MonetSystem, MonetLight, MonetDark};
    }

    static {
        ColorSchemeMode[] colorSchemeModeArr$values = $values();
        $VALUES = colorSchemeModeArr$values;
        $ENTRIES = AbstractC5196.m9425(colorSchemeModeArr$values);
    }

    private ColorSchemeMode(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static ColorSchemeMode valueOf(String str) {
        return (ColorSchemeMode) Enum.valueOf(ColorSchemeMode.class, str);
    }

    public static ColorSchemeMode[] values() {
        return (ColorSchemeMode[]) $VALUES.clone();
    }
}
