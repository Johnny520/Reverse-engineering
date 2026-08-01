package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class Modality {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ Modality[] $VALUES;
    public static final C4488 Companion;
    public static final Modality FINAL = new Modality("FINAL", 0);
    public static final Modality SEALED = new Modality("SEALED", 1);
    public static final Modality OPEN = new Modality("OPEN", 2);
    public static final Modality ABSTRACT = new Modality("ABSTRACT", 3);

    private static final /* synthetic */ Modality[] $values() {
        return new Modality[]{FINAL, SEALED, OPEN, ABSTRACT};
    }

    static {
        Modality[] modalityArr$values = $values();
        $VALUES = modalityArr$values;
        $ENTRIES = AbstractC4364.m8866(modalityArr$values);
        Companion = new C4488();
    }

    private Modality(String str, int i) {
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) $VALUES.clone();
    }
}
