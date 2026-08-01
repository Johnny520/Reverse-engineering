package p227r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r.n */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3002n {

    /* JADX INFO: renamed from: d */
    public static final EnumC3002n f9499d;

    /* JADX INFO: renamed from: e */
    public static final EnumC3002n f9500e;

    /* JADX INFO: renamed from: f */
    public static final EnumC3002n f9501f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC3002n[] f9502g;

    static {
        EnumC3002n enumC3002n = new EnumC3002n("Yes", 0);
        f9499d = enumC3002n;
        EnumC3002n enumC3002n2 = new EnumC3002n("No", 1);
        f9500e = enumC3002n2;
        EnumC3002n enumC3002n3 = new EnumC3002n("NotInitialized", 2);
        f9501f = enumC3002n3;
        f9502g = new EnumC3002n[]{enumC3002n, enumC3002n2, enumC3002n3};
    }

    public static EnumC3002n valueOf(String str) {
        return (EnumC3002n) Enum.valueOf(EnumC3002n.class, str);
    }

    public static EnumC3002n[] values() {
        return (EnumC3002n[]) f9502g.clone();
    }
}
