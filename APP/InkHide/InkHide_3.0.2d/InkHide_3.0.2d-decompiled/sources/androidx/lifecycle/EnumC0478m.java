package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0478m {
    private static final /* synthetic */ EnumC0478m[] $VALUES;
    public static final C0476k Companion;
    public static final EnumC0478m ON_ANY;
    public static final EnumC0478m ON_CREATE;
    public static final EnumC0478m ON_DESTROY;
    public static final EnumC0478m ON_PAUSE;
    public static final EnumC0478m ON_RESUME;
    public static final EnumC0478m ON_START;
    public static final EnumC0478m ON_STOP;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0478m enumC0478m = new EnumC0478m("ON_CREATE", 0);
        ON_CREATE = enumC0478m;
        EnumC0478m enumC0478m2 = new EnumC0478m("ON_START", 1);
        ON_START = enumC0478m2;
        EnumC0478m enumC0478m3 = new EnumC0478m("ON_RESUME", 2);
        ON_RESUME = enumC0478m3;
        EnumC0478m enumC0478m4 = new EnumC0478m("ON_PAUSE", 3);
        ON_PAUSE = enumC0478m4;
        EnumC0478m enumC0478m5 = new EnumC0478m("ON_STOP", 4);
        ON_STOP = enumC0478m5;
        EnumC0478m enumC0478m6 = new EnumC0478m("ON_DESTROY", 5);
        ON_DESTROY = enumC0478m6;
        EnumC0478m enumC0478m7 = new EnumC0478m("ON_ANY", 6);
        ON_ANY = enumC0478m7;
        $VALUES = new EnumC0478m[]{enumC0478m, enumC0478m2, enumC0478m3, enumC0478m4, enumC0478m5, enumC0478m6, enumC0478m7};
        Companion = new C0476k();
    }

    public static EnumC0478m valueOf(String str) {
        return (EnumC0478m) Enum.valueOf(EnumC0478m.class, str);
    }

    public static EnumC0478m[] values() {
        return (EnumC0478m[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final EnumC0479n m925a() {
        switch (AbstractC0477l.f1516a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0479n.f1519c;
            case 3:
            case 4:
                return EnumC0479n.f1520d;
            case 5:
                return EnumC0479n.f1521e;
            case 6:
                return EnumC0479n.f1517a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
