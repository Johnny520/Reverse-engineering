package p041H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H0.u */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0621u {

    /* JADX INFO: renamed from: d */
    public static final EnumC0621u f1982d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0621u f1983e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0621u f1984f;

    /* JADX INFO: renamed from: g */
    public static final EnumC0621u f1985g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC0621u[] f1986h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0621u enumC0621u = new EnumC0621u("LookaheadMeasurement", 0);
        f1982d = enumC0621u;
        EnumC0621u enumC0621u2 = new EnumC0621u("LookaheadPlacement", 1);
        f1983e = enumC0621u2;
        EnumC0621u enumC0621u3 = new EnumC0621u("Measurement", 2);
        f1984f = enumC0621u3;
        EnumC0621u enumC0621u4 = new EnumC0621u("Placement", 3);
        f1985g = enumC0621u4;
        f1986h = new EnumC0621u[]{enumC0621u, enumC0621u2, enumC0621u3, enumC0621u4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0621u valueOf(String str) {
        return (EnumC0621u) Enum.valueOf(EnumC0621u.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0621u[] values() {
        return (EnumC0621u[]) f1986h.clone();
    }
}
