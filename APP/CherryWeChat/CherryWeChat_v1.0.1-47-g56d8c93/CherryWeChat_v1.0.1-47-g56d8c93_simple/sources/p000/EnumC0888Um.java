package p000;

/* JADX INFO: renamed from: Um */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0888Um extends Enum implements InterfaceC0415Jl {

    /* JADX INFO: renamed from: b */
    public static final EnumC0888Um f2776b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC0888Um f2777c = null;

    /* JADX INFO: renamed from: d */
    public static final EnumC0888Um f2778d = null;

    /* JADX INFO: renamed from: e */
    public static final EnumC0888Um f2779e = null;

    /* JADX INFO: renamed from: f */
    public static final EnumC0888Um f2780f = null;

    /* JADX INFO: renamed from: g */
    public static final EnumC0888Um f2781g = null;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC0888Um[] f2782h = null;

    /* JADX INFO: renamed from: a */
    public final int f2783a;

    static {
        EnumC0888Um r0 = new EnumC0888Um("UNKNOWN_KEYMATERIAL", 0, 0);
        f2776b = r0;
        EnumC0888Um r1 = new EnumC0888Um("SYMMETRIC", 1, 1);
        f2777c = r1;
        EnumC0888Um r2 = new EnumC0888Um("ASYMMETRIC_PRIVATE", 2, 2);
        f2778d = r2;
        EnumC0888Um r3 = new EnumC0888Um("ASYMMETRIC_PUBLIC", 3, 3);
        f2779e = r3;
        EnumC0888Um r4 = new EnumC0888Um("REMOTE", 4, 4);
        f2780f = r4;
        EnumC0888Um r5 = new EnumC0888Um("UNRECOGNIZED", 5, -1);
        f2781g = r5;
        f2782h = new EnumC0888Um[]{r0, r1, r2, r3, r4, r5};
    }

    EnumC0888Um(String r1, int r2, int r3) {
        this.f2783a = r3;
    }

    public static EnumC0888Um valueOf(String r1) {
        return (EnumC0888Um) Enum.valueOf(EnumC0888Um.class, r1);
    }

    public static EnumC0888Um[] values() {
        return (EnumC0888Um[]) f2782h.clone();
    }
}
