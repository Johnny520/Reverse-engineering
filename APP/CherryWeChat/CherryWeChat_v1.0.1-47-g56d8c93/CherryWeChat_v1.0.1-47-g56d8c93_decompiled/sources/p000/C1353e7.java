package p000;

/* JADX INFO: renamed from: e7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1353e7 extends AbstractC2634vj {
    private static final C1353e7 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2744y6 keyValue_ = AbstractC2744y6.f9369b;
    private int version_;

    static {
        C1353e7 c1353e7 = new C1353e7();
        DEFAULT_INSTANCE = c1353e7;
        AbstractC2634vj.m5151t(C1353e7.class, c1353e7);
    }

    /* JADX INFO: renamed from: A */
    public static C1310d7 m2623A() {
        return (C1310d7) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: B */
    public static C1353e7 m2624B(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C1353e7) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m2625w(C1353e7 c1353e7) {
        c1353e7.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m2626x(C1353e7 c1353e7, C2701x6 c2701x6) {
        c1353e7.getClass();
        c1353e7.keyValue_ = c2701x6;
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new C1353e7();
            case 4:
                return new C1310d7(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C1353e7.class) {
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
    public final AbstractC2744y6 m2627y() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: z */
    public final int m2628z() {
        return this.version_;
    }
}
