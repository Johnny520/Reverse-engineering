package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class KmVariance {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ KmVariance[] $VALUES;
    public static final KmVariance INVARIANT = new KmVariance("INVARIANT", 0);
    public static final KmVariance IN = new KmVariance("IN", 1);
    public static final KmVariance OUT = new KmVariance("OUT", 2);

    private static final /* synthetic */ KmVariance[] $values() {
        return new KmVariance[]{INVARIANT, IN, OUT};
    }

    static {
        KmVariance[] kmVarianceArr$values = $values();
        $VALUES = kmVarianceArr$values;
        $ENTRIES = AbstractC4363.m8876(kmVarianceArr$values);
    }

    private KmVariance(String str, int i) {
    }

    public static KmVariance valueOf(String str) {
        return (KmVariance) Enum.valueOf(KmVariance.class, str);
    }

    public static KmVariance[] values() {
        return (KmVariance[]) $VALUES.clone();
    }
}
