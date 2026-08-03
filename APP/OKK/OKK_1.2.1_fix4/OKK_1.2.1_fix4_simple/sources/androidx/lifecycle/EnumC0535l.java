package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0535l extends Enum {
    private static final /* synthetic */ EnumC0535l[] $VALUES = null;
    public static final C0533j Companion = null;
    public static final EnumC0535l ON_ANY = null;
    public static final EnumC0535l ON_CREATE = null;
    public static final EnumC0535l ON_DESTROY = null;
    public static final EnumC0535l ON_PAUSE = null;
    public static final EnumC0535l ON_RESUME = null;
    public static final EnumC0535l ON_START = null;
    public static final EnumC0535l ON_STOP = null;

    static {
        EnumC0535l r02 = new EnumC0535l("ON_CREATE", 0);
        ON_CREATE = r02;
        EnumC0535l r1 = new EnumC0535l("ON_START", 1);
        ON_START = r1;
        EnumC0535l r2 = new EnumC0535l("ON_RESUME", 2);
        ON_RESUME = r2;
        EnumC0535l r3 = new EnumC0535l("ON_PAUSE", 3);
        ON_PAUSE = r3;
        EnumC0535l r4 = new EnumC0535l("ON_STOP", 4);
        ON_STOP = r4;
        EnumC0535l r5 = new EnumC0535l("ON_DESTROY", 5);
        ON_DESTROY = r5;
        EnumC0535l r6 = new EnumC0535l("ON_ANY", 6);
        ON_ANY = r6;
        $VALUES = new EnumC0535l[]{r02, r1, r2, r3, r4, r5, r6};
        Companion = new C0533j();
    }

    public static EnumC0535l valueOf(String r1) {
        return (EnumC0535l) Enum.valueOf(EnumC0535l.class, r1);
    }

    public static EnumC0535l[] values() {
        return (EnumC0535l[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC0536m m1252a() {
        switch(AbstractC0534k.f1481a[ordinal()]) {
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
        return EnumC0536m.f1482a;
    L9:
        return EnumC0536m.f1486e;
    L11:
        return EnumC0536m.f1485d;
    L13:
        return EnumC0536m.f1484c;
    }
}
