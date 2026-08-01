package kotlin.reflect;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"kotlin/reflect/KParameter$Kind", "", "Lkotlin/reflect/KParameter$Kind;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "INSTANCE", "CONTEXT", "EXTENSION_RECEIVER", "VALUE", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class KParameter$Kind {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ KParameter$Kind[] $VALUES;
    public static final KParameter$Kind INSTANCE = new KParameter$Kind("INSTANCE", 0);
    public static final KParameter$Kind CONTEXT = new KParameter$Kind("CONTEXT", 1);
    public static final KParameter$Kind EXTENSION_RECEIVER = new KParameter$Kind("EXTENSION_RECEIVER", 2);
    public static final KParameter$Kind VALUE = new KParameter$Kind("VALUE", 3);

    private static final /* synthetic */ KParameter$Kind[] $values() {
        return new KParameter$Kind[]{INSTANCE, CONTEXT, EXTENSION_RECEIVER, VALUE};
    }

    static {
        KParameter$Kind[] kParameter$KindArr$values = $values();
        $VALUES = kParameter$KindArr$values;
        $ENTRIES = AbstractC4363.m8876(kParameter$KindArr$values);
    }

    private KParameter$Kind(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static KParameter$Kind valueOf(String str) {
        return (KParameter$Kind) Enum.valueOf(KParameter$Kind.class, str);
    }

    public static KParameter$Kind[] values() {
        return (KParameter$Kind[]) $VALUES.clone();
    }
}
