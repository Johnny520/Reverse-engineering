package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class KmVersionRequirementLevel {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ KmVersionRequirementLevel[] $VALUES;
    public static final KmVersionRequirementLevel WARNING = new KmVersionRequirementLevel("WARNING", 0);
    public static final KmVersionRequirementLevel ERROR = new KmVersionRequirementLevel("ERROR", 1);
    public static final KmVersionRequirementLevel HIDDEN = new KmVersionRequirementLevel("HIDDEN", 2);

    private static final /* synthetic */ KmVersionRequirementLevel[] $values() {
        return new KmVersionRequirementLevel[]{WARNING, ERROR, HIDDEN};
    }

    static {
        KmVersionRequirementLevel[] kmVersionRequirementLevelArr$values = $values();
        $VALUES = kmVersionRequirementLevelArr$values;
        $ENTRIES = AbstractC4363.m8876(kmVersionRequirementLevelArr$values);
    }

    private KmVersionRequirementLevel(String str, int i) {
    }

    public static KmVersionRequirementLevel valueOf(String str) {
        return (KmVersionRequirementLevel) Enum.valueOf(KmVersionRequirementLevel.class, str);
    }

    public static KmVersionRequirementLevel[] values() {
        return (KmVersionRequirementLevel[]) $VALUES.clone();
    }
}
