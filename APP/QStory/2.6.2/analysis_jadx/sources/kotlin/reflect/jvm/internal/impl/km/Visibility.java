package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import kotlin.reflect.jvm.internal.impl.km.internal.C4511;
import p070.AbstractC6898;
import p070.C6900;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class Visibility {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ Visibility[] $VALUES;
    private final C4511 flag;
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
        $ENTRIES = AbstractC4363.m8876(visibilityArr$values);
    }

    private Visibility(String str, int i, int i2) {
        C6900 c6900 = AbstractC6898.f18386;
        c6900.getClass();
        this.flag = new C4511(c6900, i2);
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static Visibility valueOf(String str) {
        return (Visibility) Enum.valueOf(Visibility.class, str);
    }

    public static Visibility[] values() {
        return (Visibility[]) $VALUES.clone();
    }

    public final C4511 getFlag$kotlin_metadata() {
        return this.flag;
    }
}
