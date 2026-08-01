package p172h3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h3.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2241a {

    /* JADX INFO: renamed from: d */
    public static final EnumC2241a f7351d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2241a f7352e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2241a f7353f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC2241a[] f7354g;

    static {
        EnumC2241a enumC2241a = new EnumC2241a("SUSPEND", 0);
        f7351d = enumC2241a;
        EnumC2241a enumC2241a2 = new EnumC2241a("DROP_OLDEST", 1);
        f7352e = enumC2241a2;
        EnumC2241a enumC2241a3 = new EnumC2241a("DROP_LATEST", 2);
        f7353f = enumC2241a3;
        f7354g = new EnumC2241a[]{enumC2241a, enumC2241a2, enumC2241a3};
    }

    public static EnumC2241a valueOf(String str) {
        return (EnumC2241a) Enum.valueOf(EnumC2241a.class, str);
    }

    public static EnumC2241a[] values() {
        return (EnumC2241a[]) f7354g.clone();
    }
}
