package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeFlexibility {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ JavaTypeFlexibility[] $VALUES;
    public static final JavaTypeFlexibility INFLEXIBLE = new JavaTypeFlexibility("INFLEXIBLE", 0);
    public static final JavaTypeFlexibility FLEXIBLE_UPPER_BOUND = new JavaTypeFlexibility("FLEXIBLE_UPPER_BOUND", 1);
    public static final JavaTypeFlexibility FLEXIBLE_LOWER_BOUND = new JavaTypeFlexibility("FLEXIBLE_LOWER_BOUND", 2);

    private static final /* synthetic */ JavaTypeFlexibility[] $values() {
        return new JavaTypeFlexibility[]{INFLEXIBLE, FLEXIBLE_UPPER_BOUND, FLEXIBLE_LOWER_BOUND};
    }

    static {
        JavaTypeFlexibility[] javaTypeFlexibilityArr$values = $values();
        $VALUES = javaTypeFlexibilityArr$values;
        $ENTRIES = AbstractC4363.m8876(javaTypeFlexibilityArr$values);
    }

    private JavaTypeFlexibility(String str, int i) {
    }

    public static JavaTypeFlexibility valueOf(String str) {
        return (JavaTypeFlexibility) Enum.valueOf(JavaTypeFlexibility.class, str);
    }

    public static JavaTypeFlexibility[] values() {
        return (JavaTypeFlexibility[]) $VALUES.clone();
    }
}
