package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeComponentPosition {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ TypeComponentPosition[] $VALUES;
    public static final TypeComponentPosition FLEXIBLE_LOWER = new TypeComponentPosition("FLEXIBLE_LOWER", 0);
    public static final TypeComponentPosition FLEXIBLE_UPPER = new TypeComponentPosition("FLEXIBLE_UPPER", 1);
    public static final TypeComponentPosition INFLEXIBLE = new TypeComponentPosition("INFLEXIBLE", 2);

    private static final /* synthetic */ TypeComponentPosition[] $values() {
        return new TypeComponentPosition[]{FLEXIBLE_LOWER, FLEXIBLE_UPPER, INFLEXIBLE};
    }

    static {
        TypeComponentPosition[] typeComponentPositionArr$values = $values();
        $VALUES = typeComponentPositionArr$values;
        $ENTRIES = AbstractC4364.m8866(typeComponentPositionArr$values);
    }

    private TypeComponentPosition(String str, int i) {
    }

    public static TypeComponentPosition valueOf(String str) {
        return (TypeComponentPosition) Enum.valueOf(TypeComponentPosition.class, str);
    }

    public static TypeComponentPosition[] values() {
        return (TypeComponentPosition[]) $VALUES.clone();
    }
}
