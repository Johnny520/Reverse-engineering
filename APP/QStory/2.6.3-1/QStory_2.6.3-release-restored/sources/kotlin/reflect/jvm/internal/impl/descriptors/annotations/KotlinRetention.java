package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinRetention {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ KotlinRetention[] $VALUES;
    public static final KotlinRetention RUNTIME = new KotlinRetention("RUNTIME", 0);
    public static final KotlinRetention BINARY = new KotlinRetention("BINARY", 1);
    public static final KotlinRetention SOURCE = new KotlinRetention("SOURCE", 2);

    private static final /* synthetic */ KotlinRetention[] $values() {
        return new KotlinRetention[]{RUNTIME, BINARY, SOURCE};
    }

    static {
        KotlinRetention[] kotlinRetentionArr$values = $values();
        $VALUES = kotlinRetentionArr$values;
        $ENTRIES = AbstractC5196.m9425(kotlinRetentionArr$values);
    }

    private KotlinRetention(String str, int i) {
    }

    public static KotlinRetention valueOf(String str) {
        return (KotlinRetention) Enum.valueOf(KotlinRetention.class, str);
    }

    public static KotlinRetention[] values() {
        return (KotlinRetention[]) $VALUES.clone();
    }
}
