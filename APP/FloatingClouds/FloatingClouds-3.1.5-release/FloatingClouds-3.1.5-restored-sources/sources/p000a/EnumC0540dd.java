package p000a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a.dd */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0540dd {

    /* JADX INFO: renamed from: a */
    public static final EnumC0540dd f1944a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0540dd f1945b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0540dd f1946c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0540dd f1947d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC0540dd[] f1948e;

    static {
        EnumC0540dd enumC0540dd = new EnumC0540dd("SUCCESS", 0);
        f1944a = enumC0540dd;
        EnumC0540dd enumC0540dd2 = new EnumC0540dd("PENDING", 1);
        f1945b = enumC0540dd2;
        EnumC0540dd enumC0540dd3 = new EnumC0540dd("NOT_FOUND", 2);
        f1946c = enumC0540dd3;
        EnumC0540dd enumC0540dd4 = new EnumC0540dd("REFLECT_FAILED", 3);
        f1947d = enumC0540dd4;
        f1948e = new EnumC0540dd[]{enumC0540dd, enumC0540dd2, enumC0540dd3, enumC0540dd4, new EnumC0540dd("FALLBACK", 4)};
    }

    public EnumC0540dd() {
        throw null;
    }

    public static EnumC0540dd valueOf(String str) {
        return (EnumC0540dd) Enum.valueOf(EnumC0540dd.class, str);
    }

    public static EnumC0540dd[] values() {
        return (EnumC0540dd[]) f1948e.clone();
    }
}
