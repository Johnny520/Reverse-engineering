package p000;

/* JADX INFO: renamed from: On */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0632On extends Enum {
    private static final /* synthetic */ EnumC0632On[] $VALUES = null;
    public static final C0546Mn Companion = null;
    public static final EnumC0632On ON_ANY = null;
    public static final EnumC0632On ON_CREATE = null;
    public static final EnumC0632On ON_DESTROY = null;
    public static final EnumC0632On ON_PAUSE = null;
    public static final EnumC0632On ON_RESUME = null;
    public static final EnumC0632On ON_START = null;
    public static final EnumC0632On ON_STOP = null;

    static {
        EnumC0632On r0 = new EnumC0632On("ON_CREATE", 0);
        ON_CREATE = r0;
        EnumC0632On r1 = new EnumC0632On("ON_START", 1);
        ON_START = r1;
        EnumC0632On r2 = new EnumC0632On("ON_RESUME", 2);
        ON_RESUME = r2;
        EnumC0632On r3 = new EnumC0632On("ON_PAUSE", 3);
        ON_PAUSE = r3;
        EnumC0632On r4 = new EnumC0632On("ON_STOP", 4);
        ON_STOP = r4;
        EnumC0632On r5 = new EnumC0632On("ON_DESTROY", 5);
        ON_DESTROY = r5;
        EnumC0632On r6 = new EnumC0632On("ON_ANY", 6);
        ON_ANY = r6;
        $VALUES = new EnumC0632On[]{r0, r1, r2, r3, r4, r5, r6};
        Companion = new C0546Mn();
    }

    public static EnumC0632On valueOf(String r1) {
        return (EnumC0632On) Enum.valueOf(EnumC0632On.class, r1);
    }

    public static EnumC0632On[] values() {
        return (EnumC0632On[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC0675Pn m1254a() {
        switch(AbstractC0589Nn.f1913a[ordinal()]) {
            case 1: goto L13;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
            default: goto L5;
        };
    L5:
        throw new IllegalArgumentException(this + " has no target state");
    L7:
        return EnumC0675Pn.f2147a;
    L9:
        return EnumC0675Pn.f2151e;
    L11:
        return EnumC0675Pn.f2150d;
    L13:
        return EnumC0675Pn.f2149c;
    }
}
