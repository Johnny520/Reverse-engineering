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
public final class Visibility {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ Visibility[] $VALUES;
    private final C5344 flag;
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
        $ENTRIES = AbstractC5196.m9425(visibilityArr$values);
    }

    private Visibility(String str, int i, int i2) {
        C7730 c7730 = AbstractC7728.f18726;
        c7730.getClass();
        this.flag = new C5344(c7730, i2);
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static Visibility valueOf(String str) {
        return (Visibility) Enum.valueOf(Visibility.class, str);
    }

    public static Visibility[] values() {
        return (Visibility[]) $VALUES.clone();
    }

    public final C5344 getFlag$kotlin_metadata() {
        return this.flag;
    }
}
