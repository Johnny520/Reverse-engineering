package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0535l {
    private static final /* synthetic */ EnumC0535l[] $VALUES;
    public static final C0533j Companion;
    public static final EnumC0535l ON_ANY;
    public static final EnumC0535l ON_CREATE;
    public static final EnumC0535l ON_DESTROY;
    public static final EnumC0535l ON_PAUSE;
    public static final EnumC0535l ON_RESUME;
    public static final EnumC0535l ON_START;
    public static final EnumC0535l ON_STOP;

    static {
        EnumC0535l enumC0535l = new EnumC0535l("ON_CREATE", 0);
        ON_CREATE = enumC0535l;
        EnumC0535l enumC0535l2 = new EnumC0535l("ON_START", 1);
        ON_START = enumC0535l2;
        EnumC0535l enumC0535l3 = new EnumC0535l("ON_RESUME", 2);
        ON_RESUME = enumC0535l3;
        EnumC0535l enumC0535l4 = new EnumC0535l("ON_PAUSE", 3);
        ON_PAUSE = enumC0535l4;
        EnumC0535l enumC0535l5 = new EnumC0535l("ON_STOP", 4);
        ON_STOP = enumC0535l5;
        EnumC0535l enumC0535l6 = new EnumC0535l("ON_DESTROY", 5);
        ON_DESTROY = enumC0535l6;
        EnumC0535l enumC0535l7 = new EnumC0535l("ON_ANY", 6);
        ON_ANY = enumC0535l7;
        $VALUES = new EnumC0535l[]{enumC0535l, enumC0535l2, enumC0535l3, enumC0535l4, enumC0535l5, enumC0535l6, enumC0535l7};
        Companion = new C0533j();
    }

    public static EnumC0535l valueOf(String str) {
        return (EnumC0535l) Enum.valueOf(EnumC0535l.class, str);
    }

    public static EnumC0535l[] values() {
        return (EnumC0535l[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC0536m m1252a() {
        switch (AbstractC0534k.f1481a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0536m.f1484c;
            case 3:
            case 4:
                return EnumC0536m.f1485d;
            case 5:
                return EnumC0536m.f1486e;
            case 6:
                return EnumC0536m.f1482a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
