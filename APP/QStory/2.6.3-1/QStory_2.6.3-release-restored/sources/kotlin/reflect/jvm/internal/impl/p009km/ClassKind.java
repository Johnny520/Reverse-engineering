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
public final class ClassKind {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ ClassKind[] $VALUES;
    private final C5344 flag;
    public static final ClassKind CLASS = new ClassKind("CLASS", 0, 0);
    public static final ClassKind INTERFACE = new ClassKind("INTERFACE", 1, 1);
    public static final ClassKind ENUM_CLASS = new ClassKind("ENUM_CLASS", 2, 2);
    public static final ClassKind ENUM_ENTRY = new ClassKind("ENUM_ENTRY", 3, 3);
    public static final ClassKind ANNOTATION_CLASS = new ClassKind("ANNOTATION_CLASS", 4, 4);
    public static final ClassKind OBJECT = new ClassKind("OBJECT", 5, 5);
    public static final ClassKind COMPANION_OBJECT = new ClassKind("COMPANION_OBJECT", 6, 6);

    private static final /* synthetic */ ClassKind[] $values() {
        return new ClassKind[]{CLASS, INTERFACE, ENUM_CLASS, ENUM_ENTRY, ANNOTATION_CLASS, OBJECT, COMPANION_OBJECT};
    }

    static {
        ClassKind[] classKindArr$values = $values();
        $VALUES = classKindArr$values;
        $ENTRIES = AbstractC5196.m9425(classKindArr$values);
    }

    private ClassKind(String str, int i, int i2) {
        C7730 c7730 = AbstractC7728.f18724;
        c7730.getClass();
        this.flag = new C5344(c7730, i2);
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) $VALUES.clone();
    }

    public final C5344 getFlag$kotlin_metadata() {
        return this.flag;
    }
}
