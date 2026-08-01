package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityQualifier {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ NullabilityQualifier[] $VALUES;
    public static final NullabilityQualifier FORCE_FLEXIBILITY = new NullabilityQualifier("FORCE_FLEXIBILITY", 0);
    public static final NullabilityQualifier NULLABLE = new NullabilityQualifier("NULLABLE", 1);
    public static final NullabilityQualifier NOT_NULL = new NullabilityQualifier("NOT_NULL", 2);

    private static final /* synthetic */ NullabilityQualifier[] $values() {
        return new NullabilityQualifier[]{FORCE_FLEXIBILITY, NULLABLE, NOT_NULL};
    }

    static {
        NullabilityQualifier[] nullabilityQualifierArr$values = $values();
        $VALUES = nullabilityQualifierArr$values;
        $ENTRIES = AbstractC4364.m8866(nullabilityQualifierArr$values);
    }

    private NullabilityQualifier(String str, int i) {
    }

    public static NullabilityQualifier valueOf(String str) {
        return (NullabilityQualifier) Enum.valueOf(NullabilityQualifier.class, str);
    }

    public static NullabilityQualifier[] values() {
        return (NullabilityQualifier[]) $VALUES.clone();
    }
}
