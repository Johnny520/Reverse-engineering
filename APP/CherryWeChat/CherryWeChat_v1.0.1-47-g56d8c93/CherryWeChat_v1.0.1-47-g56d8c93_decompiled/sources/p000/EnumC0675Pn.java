package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Pn */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0675Pn {

    /* JADX INFO: renamed from: a */
    public static final EnumC0675Pn f2147a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0675Pn f2148b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0675Pn f2149c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0675Pn f2150d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0675Pn f2151e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0675Pn[] f2152f;

    static {
        EnumC0675Pn enumC0675Pn = new EnumC0675Pn("DESTROYED", 0);
        f2147a = enumC0675Pn;
        EnumC0675Pn enumC0675Pn2 = new EnumC0675Pn("INITIALIZED", 1);
        f2148b = enumC0675Pn2;
        EnumC0675Pn enumC0675Pn3 = new EnumC0675Pn("CREATED", 2);
        f2149c = enumC0675Pn3;
        EnumC0675Pn enumC0675Pn4 = new EnumC0675Pn("STARTED", 3);
        f2150d = enumC0675Pn4;
        EnumC0675Pn enumC0675Pn5 = new EnumC0675Pn("RESUMED", 4);
        f2151e = enumC0675Pn5;
        f2152f = new EnumC0675Pn[]{enumC0675Pn, enumC0675Pn2, enumC0675Pn3, enumC0675Pn4, enumC0675Pn5};
    }

    public static EnumC0675Pn valueOf(String str) {
        return (EnumC0675Pn) Enum.valueOf(EnumC0675Pn.class, str);
    }

    public static EnumC0675Pn[] values() {
        return (EnumC0675Pn[]) f2152f.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1371a(EnumC0675Pn enumC0675Pn) {
        return compareTo(enumC0675Pn) >= 0;
    }
}
