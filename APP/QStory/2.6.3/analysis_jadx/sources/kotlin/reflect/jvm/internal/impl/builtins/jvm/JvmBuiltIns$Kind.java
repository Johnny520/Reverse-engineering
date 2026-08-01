package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmBuiltIns$Kind {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ JvmBuiltIns$Kind[] $VALUES;
    public static final JvmBuiltIns$Kind FROM_DEPENDENCIES = new JvmBuiltIns$Kind("FROM_DEPENDENCIES", 0);
    public static final JvmBuiltIns$Kind FROM_CLASS_LOADER = new JvmBuiltIns$Kind("FROM_CLASS_LOADER", 1);
    public static final JvmBuiltIns$Kind FALLBACK = new JvmBuiltIns$Kind("FALLBACK", 2);

    private static final /* synthetic */ JvmBuiltIns$Kind[] $values() {
        return new JvmBuiltIns$Kind[]{FROM_DEPENDENCIES, FROM_CLASS_LOADER, FALLBACK};
    }

    static {
        JvmBuiltIns$Kind[] jvmBuiltIns$KindArr$values = $values();
        $VALUES = jvmBuiltIns$KindArr$values;
        $ENTRIES = AbstractC4364.m8866(jvmBuiltIns$KindArr$values);
    }

    private JvmBuiltIns$Kind(String str, int i) {
    }

    public static JvmBuiltIns$Kind valueOf(String str) {
        return (JvmBuiltIns$Kind) Enum.valueOf(JvmBuiltIns$Kind.class, str);
    }

    public static JvmBuiltIns$Kind[] values() {
        return (JvmBuiltIns$Kind[]) $VALUES.clone();
    }
}
