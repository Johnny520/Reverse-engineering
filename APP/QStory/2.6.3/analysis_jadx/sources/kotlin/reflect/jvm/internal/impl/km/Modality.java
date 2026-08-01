package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import kotlin.reflect.jvm.internal.impl.km.internal.C4512;
import p070.AbstractC6899;
import p070.C6901;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class Modality {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ Modality[] $VALUES;
    private final C4512 flag;
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
        $ENTRIES = AbstractC4364.m8866(modalityArr$values);
    }

    private Modality(String str, int i, int i2) {
        C6901 c6901 = AbstractC6899.f18380;
        c6901.getClass();
        this.flag = new C4512(c6901, i2);
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) $VALUES.clone();
    }

    public final C4512 getFlag$kotlin_metadata() {
        return this.flag;
    }
}
