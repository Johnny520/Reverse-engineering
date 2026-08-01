package kotlin.reflect.jvm.internal.impl.p009km;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import kotlin.reflect.jvm.internal.impl.p009km.internal.C5344;
import p086.AbstractC7728;
import p086.C7730;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class Modality {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ Modality[] $VALUES;
    private final C5344 flag;
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
        $ENTRIES = AbstractC5196.m9425(modalityArr$values);
    }

    private Modality(String str, int i, int i2) {
        C7730 c7730 = AbstractC7728.f18725;
        c7730.getClass();
        this.flag = new C5344(c7730, i2);
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) $VALUES.clone();
    }

    public final C5344 getFlag$kotlin_metadata() {
        return this.flag;
    }
}
