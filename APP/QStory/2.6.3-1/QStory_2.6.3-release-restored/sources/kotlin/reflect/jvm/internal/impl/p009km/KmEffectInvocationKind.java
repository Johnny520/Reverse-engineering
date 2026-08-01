package kotlin.reflect.jvm.internal.impl.p009km;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class KmEffectInvocationKind {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ KmEffectInvocationKind[] $VALUES;
    public static final KmEffectInvocationKind AT_MOST_ONCE = new KmEffectInvocationKind("AT_MOST_ONCE", 0);
    public static final KmEffectInvocationKind EXACTLY_ONCE = new KmEffectInvocationKind("EXACTLY_ONCE", 1);
    public static final KmEffectInvocationKind AT_LEAST_ONCE = new KmEffectInvocationKind("AT_LEAST_ONCE", 2);

    private static final /* synthetic */ KmEffectInvocationKind[] $values() {
        return new KmEffectInvocationKind[]{AT_MOST_ONCE, EXACTLY_ONCE, AT_LEAST_ONCE};
    }

    static {
        KmEffectInvocationKind[] kmEffectInvocationKindArr$values = $values();
        $VALUES = kmEffectInvocationKindArr$values;
        $ENTRIES = AbstractC5196.m9425(kmEffectInvocationKindArr$values);
    }

    private KmEffectInvocationKind(String str, int i) {
    }

    public static KmEffectInvocationKind valueOf(String str) {
        return (KmEffectInvocationKind) Enum.valueOf(KmEffectInvocationKind.class, str);
    }

    public static KmEffectInvocationKind[] values() {
        return (KmEffectInvocationKind[]) $VALUES.clone();
    }
}
