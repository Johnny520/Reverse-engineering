package top.yukonga.miuix.kmp.utils;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m151d2 = {"Ltop/yukonga/miuix/kmp/utils/Platform;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Android", "IOS", "Desktop", "WasmJs", "MacOS", "Js", "miuix"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class Platform {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ Platform[] $VALUES;
    public static final Platform Android = new Platform("Android", 0);
    public static final Platform IOS = new Platform("IOS", 1);
    public static final Platform Desktop = new Platform("Desktop", 2);
    public static final Platform WasmJs = new Platform("WasmJs", 3);
    public static final Platform MacOS = new Platform("MacOS", 4);

    /* JADX INFO: renamed from: Js */
    public static final Platform f342Js = new Platform("Js", 5);

    private static final /* synthetic */ Platform[] $values() {
        return new Platform[]{Android, IOS, Desktop, WasmJs, MacOS, f342Js};
    }

    static {
        Platform[] platformArr$values = $values();
        $VALUES = platformArr$values;
        $ENTRIES = AbstractC5196.m9425(platformArr$values);
    }

    private Platform(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static Platform valueOf(String str) {
        return (Platform) Enum.valueOf(Platform.class, str);
    }

    public static Platform[] values() {
        return (Platform[]) $VALUES.clone();
    }
}
