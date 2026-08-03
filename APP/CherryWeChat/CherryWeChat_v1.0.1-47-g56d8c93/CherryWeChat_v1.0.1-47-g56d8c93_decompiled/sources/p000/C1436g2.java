package p000;

/* JADX INFO: renamed from: g2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1436g2 extends AbstractC2634vj {
    private static final C1436g2 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2744y6 keyValue_ = AbstractC2744y6.f9369b;
    private int version_;

    static {
        C1436g2 c1436g2 = new C1436g2();
        DEFAULT_INSTANCE = c1436g2;
        AbstractC2634vj.m5151t(C1436g2.class, c1436g2);
    }

    /* JADX INFO: renamed from: A */
    public static C1392f2 m2745A() {
        return (C1392f2) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: B */
    public static C1436g2 m2746B(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C1436g2) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m2747w(C1436g2 c1436g2) {
        c1436g2.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m2748x(C1436g2 c1436g2, C2701x6 c2701x6) {
        c1436g2.getClass();
        c1436g2.keyValue_ = c2701x6;
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
                return new C1436g2();
            case 4:
                return new C1392f2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C1436g2.class) {
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
    public final AbstractC2744y6 m2749y() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: z */
    public final int m2750z() {
        return this.version_;
    }
}
