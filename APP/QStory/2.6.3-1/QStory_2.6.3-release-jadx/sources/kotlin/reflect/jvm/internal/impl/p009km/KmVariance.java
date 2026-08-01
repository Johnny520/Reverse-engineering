package kotlin.reflect.jvm.internal.impl.p009km;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class KmVariance {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ KmVariance[] $VALUES;
    public static final KmVariance INVARIANT = new KmVariance("INVARIANT", 0);

    /* JADX INFO: renamed from: IN */
    public static final KmVariance f305IN = new KmVariance("IN", 1);
    public static final KmVariance OUT = new KmVariance("OUT", 2);

    private static final /* synthetic */ KmVariance[] $values() {
        return new KmVariance[]{INVARIANT, f305IN, OUT};
    }

    static {
        KmVariance[] kmVarianceArr$values = $values();
        $VALUES = kmVarianceArr$values;
        $ENTRIES = AbstractC5196.m9425(kmVarianceArr$values);
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
