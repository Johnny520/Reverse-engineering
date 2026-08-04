package yyds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᛳᛷᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0637 {
    private static final /* synthetic */ EnumC0637[] $VALUES;
    public static final C1461 Companion;
    public static final EnumC0637 ON_ANY;
    public static final EnumC0637 ON_CREATE;
    public static final EnumC0637 ON_DESTROY;
    public static final EnumC0637 ON_PAUSE;
    public static final EnumC0637 ON_RESUME;
    public static final EnumC0637 ON_START;
    public static final EnumC0637 ON_STOP;

    static {
        EnumC0637 enumC0637 = new EnumC0637("ON_CREATE", 0);
        ON_CREATE = enumC0637;
        EnumC0637 enumC06372 = new EnumC0637("ON_START", 1);
        ON_START = enumC06372;
        EnumC0637 enumC06373 = new EnumC0637("ON_RESUME", 2);
        ON_RESUME = enumC06373;
        EnumC0637 enumC06374 = new EnumC0637("ON_PAUSE", 3);
        ON_PAUSE = enumC06374;
        EnumC0637 enumC06375 = new EnumC0637("ON_STOP", 4);
        ON_STOP = enumC06375;
        EnumC0637 enumC06376 = new EnumC0637("ON_DESTROY", 5);
        ON_DESTROY = enumC06376;
        EnumC0637 enumC06377 = new EnumC0637("ON_ANY", 6);
        ON_ANY = enumC06377;
        $VALUES = new EnumC0637[]{enumC0637, enumC06372, enumC06373, enumC06374, enumC06375, enumC06376, enumC06377};
        Companion = new C1461();
    }

    public static EnumC0637 valueOf(String str) {
        return (EnumC0637) Enum.valueOf(EnumC0637.class, str);
    }

    public static EnumC0637[] values() {
        return (EnumC0637[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final EnumC1464 m1528() {
        switch (AbstractC1453.f6936[ordinal()]) {
            case 1:
            case 2:
                return EnumC1464.f6967;
            case 3:
            case 4:
                return EnumC1464.f6970;
            case 5:
                return EnumC1464.f6968;
            case 6:
                return EnumC1464.f6969;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
