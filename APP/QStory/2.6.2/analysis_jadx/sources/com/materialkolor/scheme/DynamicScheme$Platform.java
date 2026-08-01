package com.materialkolor.scheme;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;
import p265.C8260;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/materialkolor/scheme/DynamicScheme$Platform", "", "Lcom/materialkolor/scheme/DynamicScheme$Platform;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Companion", "飘花落叶言楪哲兰苏世子/飘花落叶言子楪世苏兰哲", "PHONE", "WATCH", "material-color-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DynamicScheme$Platform {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ DynamicScheme$Platform[] $VALUES;
    public static final C8260 Companion;
    private static final DynamicScheme$Platform Default;
    public static final DynamicScheme$Platform PHONE;
    public static final DynamicScheme$Platform WATCH;

    private static final /* synthetic */ DynamicScheme$Platform[] $values() {
        return new DynamicScheme$Platform[]{PHONE, WATCH};
    }

    static {
        DynamicScheme$Platform dynamicScheme$Platform = new DynamicScheme$Platform("PHONE", 0);
        PHONE = dynamicScheme$Platform;
        WATCH = new DynamicScheme$Platform("WATCH", 1);
        DynamicScheme$Platform[] dynamicScheme$PlatformArr$values = $values();
        $VALUES = dynamicScheme$PlatformArr$values;
        $ENTRIES = AbstractC4363.m8876(dynamicScheme$PlatformArr$values);
        Companion = new C8260();
        Default = dynamicScheme$Platform;
    }

    private DynamicScheme$Platform(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static DynamicScheme$Platform valueOf(String str) {
        return (DynamicScheme$Platform) Enum.valueOf(DynamicScheme$Platform.class, str);
    }

    public static DynamicScheme$Platform[] values() {
        return (DynamicScheme$Platform[]) $VALUES.clone();
    }
}
