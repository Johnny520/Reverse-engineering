package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class MutabilityQualifier {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ MutabilityQualifier[] $VALUES;
    public static final MutabilityQualifier READ_ONLY = new MutabilityQualifier("READ_ONLY", 0);
    public static final MutabilityQualifier MUTABLE = new MutabilityQualifier("MUTABLE", 1);

    private static final /* synthetic */ MutabilityQualifier[] $values() {
        return new MutabilityQualifier[]{READ_ONLY, MUTABLE};
    }

    static {
        MutabilityQualifier[] mutabilityQualifierArr$values = $values();
        $VALUES = mutabilityQualifierArr$values;
        $ENTRIES = AbstractC4363.m8876(mutabilityQualifierArr$values);
    }

    private MutabilityQualifier(String str, int i) {
    }

    public static MutabilityQualifier valueOf(String str) {
        return (MutabilityQualifier) Enum.valueOf(MutabilityQualifier.class, str);
    }

    public static MutabilityQualifier[] values() {
        return (MutabilityQualifier[]) $VALUES.clone();
    }
}
