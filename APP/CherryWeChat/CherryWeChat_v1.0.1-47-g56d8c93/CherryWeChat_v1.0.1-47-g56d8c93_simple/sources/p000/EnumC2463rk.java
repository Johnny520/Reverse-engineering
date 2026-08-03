package p000;

/* JADX INFO: renamed from: rk */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2463rk extends Enum implements InterfaceC0415Jl {

    /* JADX INFO: renamed from: b */
    public static final EnumC2463rk f8677b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC2463rk f8678c = null;

    /* JADX INFO: renamed from: d */
    public static final EnumC2463rk f8679d = null;

    /* JADX INFO: renamed from: e */
    public static final EnumC2463rk f8680e = null;

    /* JADX INFO: renamed from: f */
    public static final EnumC2463rk f8681f = null;

    /* JADX INFO: renamed from: g */
    public static final EnumC2463rk f8682g = null;

    /* JADX INFO: renamed from: h */
    public static final EnumC2463rk f8683h = null;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC2463rk[] f8684i = null;

    /* JADX INFO: renamed from: a */
    public final int f8685a;

    static {
        EnumC2463rk r0 = new EnumC2463rk("UNKNOWN_HASH", 0, 0);
        f8677b = r0;
        EnumC2463rk r1 = new EnumC2463rk("SHA1", 1, 1);
        f8678c = r1;
        EnumC2463rk r2 = new EnumC2463rk("SHA384", 2, 2);
        f8679d = r2;
        EnumC2463rk r3 = new EnumC2463rk("SHA256", 3, 3);
        f8680e = r3;
        EnumC2463rk r4 = new EnumC2463rk("SHA512", 4, 4);
        f8681f = r4;
        EnumC2463rk r5 = new EnumC2463rk("SHA224", 5, 5);
        f8682g = r5;
        EnumC2463rk r6 = new EnumC2463rk("UNRECOGNIZED", 6, -1);
        f8683h = r6;
        f8684i = new EnumC2463rk[]{r0, r1, r2, r3, r4, r5, r6};
    }

    EnumC2463rk(String r1, int r2, int r3) {
        this.f8685a = r3;
    }

    public static EnumC2463rk valueOf(String r1) {
        return (EnumC2463rk) Enum.valueOf(EnumC2463rk.class, r1);
    }

    public static EnumC2463rk[] values() {
        return (EnumC2463rk[]) f8684i.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m4953a() {
        if (this == f8683h) goto L7;
        return this.f8685a;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
