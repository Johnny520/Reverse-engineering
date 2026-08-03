package p000;

/* JADX INFO: renamed from: b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1200b2 extends AbstractC2634vj {
    private static final C1200b2 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        C1200b2 c1200b2 = new C1200b2();
        DEFAULT_INSTANCE = c1200b2;
        AbstractC2634vj.m5151t(C1200b2.class, c1200b2);
    }

    /* JADX INFO: renamed from: w */
    public static void m2319w(C1200b2 c1200b2, int i) {
        c1200b2.keySize_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static C1120a2 m2320y() {
        return (C1120a2) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: z */
    public static C1200b2 m2321z(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C1200b2) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new C1200b2();
            case 4:
                return new C1120a2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C1200b2.class) {
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

    /* JADX INFO: renamed from: x */
    public final int m2322x() {
        return this.keySize_;
    }
}
