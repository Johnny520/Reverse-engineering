package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: On */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0632On {
    private static final /* synthetic */ EnumC0632On[] $VALUES;
    public static final C0546Mn Companion;
    public static final EnumC0632On ON_ANY;
    public static final EnumC0632On ON_CREATE;
    public static final EnumC0632On ON_DESTROY;
    public static final EnumC0632On ON_PAUSE;
    public static final EnumC0632On ON_RESUME;
    public static final EnumC0632On ON_START;
    public static final EnumC0632On ON_STOP;

    static {
        EnumC0632On enumC0632On = new EnumC0632On("ON_CREATE", 0);
        ON_CREATE = enumC0632On;
        EnumC0632On enumC0632On2 = new EnumC0632On("ON_START", 1);
        ON_START = enumC0632On2;
        EnumC0632On enumC0632On3 = new EnumC0632On("ON_RESUME", 2);
        ON_RESUME = enumC0632On3;
        EnumC0632On enumC0632On4 = new EnumC0632On("ON_PAUSE", 3);
        ON_PAUSE = enumC0632On4;
        EnumC0632On enumC0632On5 = new EnumC0632On("ON_STOP", 4);
        ON_STOP = enumC0632On5;
        EnumC0632On enumC0632On6 = new EnumC0632On("ON_DESTROY", 5);
        ON_DESTROY = enumC0632On6;
        EnumC0632On enumC0632On7 = new EnumC0632On("ON_ANY", 6);
        ON_ANY = enumC0632On7;
        $VALUES = new EnumC0632On[]{enumC0632On, enumC0632On2, enumC0632On3, enumC0632On4, enumC0632On5, enumC0632On6, enumC0632On7};
        Companion = new C0546Mn();
    }

    public static EnumC0632On valueOf(String str) {
        return (EnumC0632On) Enum.valueOf(EnumC0632On.class, str);
    }

    public static EnumC0632On[] values() {
        return (EnumC0632On[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC0675Pn m1254a() {
        switch (AbstractC0589Nn.f1913a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0675Pn.f2149c;
            case 3:
            case 4:
                return EnumC0675Pn.f2150d;
            case 5:
                return EnumC0675Pn.f2151e;
            case 6:
                return EnumC0675Pn.f2147a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
