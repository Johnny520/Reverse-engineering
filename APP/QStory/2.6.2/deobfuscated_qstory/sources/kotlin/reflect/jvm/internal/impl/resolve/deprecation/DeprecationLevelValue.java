package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class DeprecationLevelValue {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ DeprecationLevelValue[] $VALUES;
    public static final DeprecationLevelValue WARNING = new DeprecationLevelValue("WARNING", 0);
    public static final DeprecationLevelValue ERROR = new DeprecationLevelValue("ERROR", 1);
    public static final DeprecationLevelValue HIDDEN = new DeprecationLevelValue("HIDDEN", 2);

    private static final /* synthetic */ DeprecationLevelValue[] $values() {
        return new DeprecationLevelValue[]{WARNING, ERROR, HIDDEN};
    }

    static {
        DeprecationLevelValue[] deprecationLevelValueArr$values = $values();
        $VALUES = deprecationLevelValueArr$values;
        $ENTRIES = AbstractC4363.m8876(deprecationLevelValueArr$values);
    }

    private DeprecationLevelValue(String str, int i) {
    }

    public static DeprecationLevelValue valueOf(String str) {
        return (DeprecationLevelValue) Enum.valueOf(DeprecationLevelValue.class, str);
    }

    public static DeprecationLevelValue[] values() {
        return (DeprecationLevelValue[]) $VALUES.clone();
    }
}
