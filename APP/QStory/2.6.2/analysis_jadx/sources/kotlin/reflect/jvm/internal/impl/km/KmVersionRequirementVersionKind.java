package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class KmVersionRequirementVersionKind {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ KmVersionRequirementVersionKind[] $VALUES;
    public static final KmVersionRequirementVersionKind LANGUAGE_VERSION = new KmVersionRequirementVersionKind("LANGUAGE_VERSION", 0);
    public static final KmVersionRequirementVersionKind COMPILER_VERSION = new KmVersionRequirementVersionKind("COMPILER_VERSION", 1);
    public static final KmVersionRequirementVersionKind API_VERSION = new KmVersionRequirementVersionKind("API_VERSION", 2);
    public static final KmVersionRequirementVersionKind UNKNOWN = new KmVersionRequirementVersionKind("UNKNOWN", 3);

    private static final /* synthetic */ KmVersionRequirementVersionKind[] $values() {
        return new KmVersionRequirementVersionKind[]{LANGUAGE_VERSION, COMPILER_VERSION, API_VERSION, UNKNOWN};
    }

    static {
        KmVersionRequirementVersionKind[] kmVersionRequirementVersionKindArr$values = $values();
        $VALUES = kmVersionRequirementVersionKindArr$values;
        $ENTRIES = AbstractC4363.m8876(kmVersionRequirementVersionKindArr$values);
    }

    private KmVersionRequirementVersionKind(String str, int i) {
    }

    public static KmVersionRequirementVersionKind valueOf(String str) {
        return (KmVersionRequirementVersionKind) Enum.valueOf(KmVersionRequirementVersionKind.class, str);
    }

    public static KmVersionRequirementVersionKind[] values() {
        return (KmVersionRequirementVersionKind[]) $VALUES.clone();
    }
}
