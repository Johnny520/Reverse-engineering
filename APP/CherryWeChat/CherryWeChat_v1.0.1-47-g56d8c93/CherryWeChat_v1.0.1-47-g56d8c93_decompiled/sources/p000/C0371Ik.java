package p000;

/* JADX INFO: renamed from: Ik */
/* JADX INFO: loaded from: classes.dex */
public final class C0371Ik extends AbstractC2634vj {
    private static final C0371Ik DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        C0371Ik c0371Ik = new C0371Ik();
        DEFAULT_INSTANCE = c0371Ik;
        AbstractC2634vj.m5151t(C0371Ik.class, c0371Ik);
    }

    /* JADX INFO: renamed from: B */
    public static C0328Hk m814B() {
        return (C0328Hk) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m815w(C0371Ik c0371Ik, EnumC2463rk enumC2463rk) {
        c0371Ik.getClass();
        c0371Ik.hash_ = enumC2463rk.m4953a();
    }

    /* JADX INFO: renamed from: x */
    public static void m816x(C0371Ik c0371Ik, int i) {
        c0371Ik.tagSize_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static C0371Ik m817y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final int m818A() {
        return this.tagSize_;
    }

    @Override // p000.AbstractC2634vj
    /* JADX INFO: renamed from: i */
    public final Object mo44i(int i) {
        InterfaceC0466Kt c2591uj;
        switch (AbstractC0213Ey.m424v(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new C0371Ik();
            case 4:
                return new C0328Hk(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0371Ik.class) {
                    try {
                        c2591uj = PARSER;
                        if (c2591uj == null) {
                            c2591uj = new C2591uj();
                            PARSER = c2591uj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c2591uj;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: z */
    public final EnumC2463rk m819z() {
        int i = this.hash_;
        EnumC2463rk enumC2463rk = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : EnumC2463rk.SHA224 : EnumC2463rk.SHA512 : EnumC2463rk.SHA256 : EnumC2463rk.SHA384 : EnumC2463rk.SHA1 : EnumC2463rk.UNKNOWN_HASH;
        return enumC2463rk == null ? EnumC2463rk.UNRECOGNIZED : enumC2463rk;
    }
}
