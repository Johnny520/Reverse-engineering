package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import kotlin.reflect.jvm.internal.impl.km.internal.C4511;
import p070.AbstractC6898;
import p070.C6900;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class Modality {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ Modality[] $VALUES;
    private final C4511 flag;
    public static final Modality FINAL = new Modality("FINAL", 0, 0);
    public static final Modality OPEN = new Modality("OPEN", 1, 1);
    public static final Modality ABSTRACT = new Modality("ABSTRACT", 2, 2);
    public static final Modality SEALED = new Modality("SEALED", 3, 3);

    private static final /* synthetic */ Modality[] $values() {
        return new Modality[]{FINAL, OPEN, ABSTRACT, SEALED};
    }

    static {
        Modality[] modalityArr$values = $values();
        $VALUES = modalityArr$values;
        $ENTRIES = AbstractC4363.m8876(modalityArr$values);
    }

    private Modality(String str, int i, int i2) {
        C6900 c6900 = AbstractC6898.f18385;
        c6900.getClass();
        this.flag = new C4511(c6900, i2);
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) $VALUES.clone();
    }

    public final C4511 getFlag$kotlin_metadata() {
        return this.flag;
    }
}
