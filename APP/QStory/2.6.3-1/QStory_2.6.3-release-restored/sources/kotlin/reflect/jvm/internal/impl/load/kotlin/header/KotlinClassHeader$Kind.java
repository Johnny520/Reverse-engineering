package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import p088.C7753;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinClassHeader$Kind {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ KotlinClassHeader$Kind[] $VALUES;
    public static final C7753 Companion;
    private static final Map<Integer, KotlinClassHeader$Kind> entryById;

    /* JADX INFO: renamed from: id */
    private final int f306id;
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
        $ENTRIES = AbstractC5196.m9425(kotlinClassHeader$KindArr$values);
        Companion = new C7753();
        KotlinClassHeader$Kind[] kotlinClassHeader$KindArrValues = values();
        int iM9331 = AbstractC5171.m9331(kotlinClassHeader$KindArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331 < 16 ? 16 : iM9331);
        for (KotlinClassHeader$Kind kotlinClassHeader$Kind : kotlinClassHeader$KindArrValues) {
            linkedHashMap.put(Integer.valueOf(kotlinClassHeader$Kind.f306id), kotlinClassHeader$Kind);
        }
        entryById = linkedHashMap;
    }

    private KotlinClassHeader$Kind(String str, int i, int i2) {
        this.f306id = i2;
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
