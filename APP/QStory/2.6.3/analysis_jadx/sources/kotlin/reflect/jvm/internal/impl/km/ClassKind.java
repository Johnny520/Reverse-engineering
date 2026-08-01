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
public final class ClassKind {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ ClassKind[] $VALUES;
    private final C4512 flag;
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
        $ENTRIES = AbstractC4364.m8866(classKindArr$values);
    }

    private ClassKind(String str, int i, int i2) {
        C6901 c6901 = AbstractC6899.f18379;
        c6901.getClass();
        this.flag = new C4512(c6901, i2);
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) $VALUES.clone();
    }

    public final C4512 getFlag$kotlin_metadata() {
        return this.flag;
    }
}
