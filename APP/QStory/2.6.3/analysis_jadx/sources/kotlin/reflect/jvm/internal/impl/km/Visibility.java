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
public final class Visibility {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ Visibility[] $VALUES;
    private final C4512 flag;
    public static final Visibility INTERNAL = new Visibility("INTERNAL", 0, 0);
    public static final Visibility PRIVATE = new Visibility("PRIVATE", 1, 1);
    public static final Visibility PROTECTED = new Visibility("PROTECTED", 2, 2);
    public static final Visibility PUBLIC = new Visibility("PUBLIC", 3, 3);
    public static final Visibility PRIVATE_TO_THIS = new Visibility("PRIVATE_TO_THIS", 4, 4);
    public static final Visibility LOCAL = new Visibility("LOCAL", 5, 5);

    private static final /* synthetic */ Visibility[] $values() {
        return new Visibility[]{INTERNAL, PRIVATE, PROTECTED, PUBLIC, PRIVATE_TO_THIS, LOCAL};
    }

    static {
        Visibility[] visibilityArr$values = $values();
        $VALUES = visibilityArr$values;
        $ENTRIES = AbstractC4364.m8866(visibilityArr$values);
    }

    private Visibility(String str, int i, int i2) {
        C6901 c6901 = AbstractC6899.f18381;
        c6901.getClass();
        this.flag = new C4512(c6901, i2);
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static Visibility valueOf(String str) {
        return (Visibility) Enum.valueOf(Visibility.class, str);
    }

    public static Visibility[] values() {
        return (Visibility[]) $VALUES.clone();
    }

    public final C4512 getFlag$kotlin_metadata() {
        return this.flag;
    }
}
