package p079P2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: P2.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1152a {

    /* JADX INFO: renamed from: d */
    public static final EnumC1152a f3788d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1152a f3789e;

    /* JADX INFO: renamed from: f */
    public static final EnumC1152a f3790f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC1152a[] f3791g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1152a enumC1152a = new EnumC1152a("COROUTINE_SUSPENDED", 0);
        f3788d = enumC1152a;
        EnumC1152a enumC1152a2 = new EnumC1152a("UNDECIDED", 1);
        f3789e = enumC1152a2;
        EnumC1152a enumC1152a3 = new EnumC1152a("RESUMED", 2);
        f3790f = enumC1152a3;
        f3791g = new EnumC1152a[]{enumC1152a, enumC1152a2, enumC1152a3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1152a valueOf(String str) {
        return (EnumC1152a) Enum.valueOf(EnumC1152a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1152a[] values() {
        return (EnumC1152a[]) f3791g.clone();
    }
}
