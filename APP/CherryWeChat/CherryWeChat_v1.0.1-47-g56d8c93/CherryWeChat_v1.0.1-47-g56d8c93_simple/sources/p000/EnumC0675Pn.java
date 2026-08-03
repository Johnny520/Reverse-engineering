package p000;

/* JADX INFO: renamed from: Pn */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0675Pn extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC0675Pn f2147a = null;

    /* JADX INFO: renamed from: b */
    public static final EnumC0675Pn f2148b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC0675Pn f2149c = null;

    /* JADX INFO: renamed from: d */
    public static final EnumC0675Pn f2150d = null;

    /* JADX INFO: renamed from: e */
    public static final EnumC0675Pn f2151e = null;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0675Pn[] f2152f = null;

    static {
        EnumC0675Pn r0 = new EnumC0675Pn("DESTROYED", 0);
        f2147a = r0;
        EnumC0675Pn r1 = new EnumC0675Pn("INITIALIZED", 1);
        f2148b = r1;
        EnumC0675Pn r2 = new EnumC0675Pn("CREATED", 2);
        f2149c = r2;
        EnumC0675Pn r3 = new EnumC0675Pn("STARTED", 3);
        f2150d = r3;
        EnumC0675Pn r4 = new EnumC0675Pn("RESUMED", 4);
        f2151e = r4;
        f2152f = new EnumC0675Pn[]{r0, r1, r2, r3, r4};
    }

    public static EnumC0675Pn valueOf(String r1) {
        return (EnumC0675Pn) Enum.valueOf(EnumC0675Pn.class, r1);
    }

    public static EnumC0675Pn[] values() {
        return (EnumC0675Pn[]) f2152f.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1371a(EnumC0675Pn r1) {
        if (compareTo(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }
}
