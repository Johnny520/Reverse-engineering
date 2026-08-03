package p000;

/* JADX INFO: renamed from: UF */
/* JADX INFO: loaded from: classes.dex */
public final class C0875UF extends AbstractC2634vj {
    private static final C0875UF DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2744y6 keyValue_ = AbstractC2744y6.f9369b;
    private int version_;

    static {
        C0875UF c0875uf = new C0875UF();
        DEFAULT_INSTANCE = c0875uf;
        AbstractC2634vj.m5151t(C0875UF.class, c0875uf);
    }

    /* JADX INFO: renamed from: A */
    public static C0832TF m1711A() {
        return (C0832TF) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: B */
    public static C0875UF m1712B(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C0875UF) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m1713w(C0875UF c0875uf) {
        c0875uf.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m1714x(C0875UF c0875uf, C2701x6 c2701x6) {
        c0875uf.getClass();
        c0875uf.keyValue_ = c2701x6;
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new C0875UF();
            case 4:
                return new C0832TF(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0875UF.class) {
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
    public final AbstractC2744y6 m1715y() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: z */
    public final int m1716z() {
        return this.version_;
    }
}
