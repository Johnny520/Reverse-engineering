package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC4338;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import p072.C6923;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinClassHeader$Kind {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ KotlinClassHeader$Kind[] $VALUES;
    public static final C6923 Companion;
    private static final Map<Integer, KotlinClassHeader$Kind> entryById;
    private final int id;
    public static final KotlinClassHeader$Kind UNKNOWN = new KotlinClassHeader$Kind("UNKNOWN", 0, 0);
    public static final KotlinClassHeader$Kind CLASS = new KotlinClassHeader$Kind("CLASS", 1, 1);
    public static final KotlinClassHeader$Kind FILE_FACADE = new KotlinClassHeader$Kind("FILE_FACADE", 2, 2);
    public static final KotlinClassHeader$Kind SYNTHETIC_CLASS = new KotlinClassHeader$Kind("SYNTHETIC_CLASS", 3, 3);
    public static final KotlinClassHeader$Kind MULTIFILE_CLASS = new KotlinClassHeader$Kind("MULTIFILE_CLASS", 4, 4);
    public static final KotlinClassHeader$Kind MULTIFILE_CLASS_PART = new KotlinClassHeader$Kind("MULTIFILE_CLASS_PART", 5, 5);

    private static final /* synthetic */ KotlinClassHeader$Kind[] $values() {
        return new KotlinClassHeader$Kind[]{UNKNOWN, CLASS, FILE_FACADE, SYNTHETIC_CLASS, MULTIFILE_CLASS, MULTIFILE_CLASS_PART};
    }

    static {
        KotlinClassHeader$Kind[] kotlinClassHeader$KindArr$values = $values();
        $VALUES = kotlinClassHeader$KindArr$values;
        $ENTRIES = AbstractC4363.m8876(kotlinClassHeader$KindArr$values);
        Companion = new C6923();
        KotlinClassHeader$Kind[] kotlinClassHeader$KindArrValues = values();
        int iM8779 = AbstractC4338.m8779(kotlinClassHeader$KindArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779 < 16 ? 16 : iM8779);
        for (KotlinClassHeader$Kind kotlinClassHeader$Kind : kotlinClassHeader$KindArrValues) {
            linkedHashMap.put(Integer.valueOf(kotlinClassHeader$Kind.id), kotlinClassHeader$Kind);
        }
        entryById = linkedHashMap;
    }

    private KotlinClassHeader$Kind(String str, int i, int i2) {
        this.id = i2;
    }

    public static final KotlinClassHeader$Kind getById(int i) {
        Companion.getClass();
        KotlinClassHeader$Kind kotlinClassHeader$Kind = (KotlinClassHeader$Kind) entryById.get(Integer.valueOf(i));
        return kotlinClassHeader$Kind == null ? UNKNOWN : kotlinClassHeader$Kind;
    }

    public static KotlinClassHeader$Kind valueOf(String str) {
        return (KotlinClassHeader$Kind) Enum.valueOf(KotlinClassHeader$Kind.class, str);
    }

    public static KotlinClassHeader$Kind[] values() {
        return (KotlinClassHeader$Kind[]) $VALUES.clone();
    }
}
