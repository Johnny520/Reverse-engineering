package p000;

/* JADX INFO: renamed from: zn */
/* JADX INFO: loaded from: classes.dex */
public final class C2810zn extends AbstractC2634vj {
    private static final C2810zn DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0030An params_;
    private int version_;

    static {
        C2810zn c2810zn = new C2810zn();
        DEFAULT_INSTANCE = c2810zn;
        AbstractC2634vj.m5151t(C2810zn.class, c2810zn);
    }

    /* JADX INFO: renamed from: A */
    public static C2767yn m5433A() {
        return (C2767yn) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: B */
    public static C2810zn m5434B(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C2810zn) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m5435w(C2810zn c2810zn) {
        c2810zn.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m5436x(C2810zn c2810zn, C0030An c0030An) {
        c2810zn.getClass();
        c0030An.getClass();
        c2810zn.params_ = c0030An;
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new C2810zn();
            case 4:
                return new C2767yn(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C2810zn.class) {
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

    /* JADX INFO: renamed from: y */
    public final C0030An m5437y() {
        C0030An c0030An = this.params_;
        return c0030An == null ? C0030An.m43w() : c0030An;
    }

    /* JADX INFO: renamed from: z */
    public final int m5438z() {
        return this.version_;
    }
}
