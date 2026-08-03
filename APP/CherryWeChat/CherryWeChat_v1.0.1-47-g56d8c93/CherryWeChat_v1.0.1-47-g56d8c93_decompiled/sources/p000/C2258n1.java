package p000;

/* JADX INFO: renamed from: n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2258n1 extends AbstractC2634vj {
    private static final C2258n1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2744y6 keyValue_ = AbstractC2744y6.f9369b;
    private C2739y1 params_;
    private int version_;

    static {
        C2258n1 c2258n1 = new C2258n1();
        DEFAULT_INSTANCE = c2258n1;
        AbstractC2634vj.m5151t(C2258n1.class, c2258n1);
    }

    /* JADX INFO: renamed from: C */
    public static C2215m1 m4591C() {
        return (C2215m1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: D */
    public static C2258n1 m4592D(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C2258n1) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m4593w(C2258n1 c2258n1) {
        c2258n1.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m4594x(C2258n1 c2258n1, C2701x6 c2701x6) {
        c2258n1.getClass();
        c2258n1.keyValue_ = c2701x6;
    }

    /* JADX INFO: renamed from: y */
    public static void m4595y(C2258n1 c2258n1, C2739y1 c2739y1) {
        c2258n1.getClass();
        c2739y1.getClass();
        c2258n1.params_ = c2739y1;
    }

    /* JADX INFO: renamed from: A */
    public final C2739y1 m4596A() {
        C2739y1 c2739y1 = this.params_;
        return c2739y1 == null ? C2739y1.m5301x() : c2739y1;
    }

    /* JADX INFO: renamed from: B */
    public final int m4597B() {
        return this.version_;
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C2258n1();
            case 4:
                return new C2215m1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C2258n1.class) {
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
    public final AbstractC2744y6 m4598z() {
        return this.keyValue_;
    }
}
