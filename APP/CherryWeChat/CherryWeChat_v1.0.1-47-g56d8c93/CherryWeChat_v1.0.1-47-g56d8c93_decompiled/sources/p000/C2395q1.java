package p000;

/* JADX INFO: renamed from: q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2395q1 extends AbstractC2634vj {
    private static final C2395q1 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER;
    private int keySize_;
    private C2739y1 params_;

    static {
        C2395q1 c2395q1 = new C2395q1();
        DEFAULT_INSTANCE = c2395q1;
        AbstractC2634vj.m5151t(C2395q1.class, c2395q1);
    }

    /* JADX INFO: renamed from: A */
    public static C2344p1 m4823A() {
        return (C2344p1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: B */
    public static C2395q1 m4824B(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C2395q1) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m4825w(C2395q1 c2395q1) {
        c2395q1.keySize_ = 32;
    }

    /* JADX INFO: renamed from: x */
    public static void m4826x(C2395q1 c2395q1, C2739y1 c2739y1) {
        c2395q1.getClass();
        c2395q1.params_ = c2739y1;
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new C2395q1();
            case 4:
                return new C2344p1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C2395q1.class) {
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
    public final int m4827y() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: z */
    public final C2739y1 m4828z() {
        C2739y1 c2739y1 = this.params_;
        return c2739y1 == null ? C2739y1.m5301x() : c2739y1;
    }
}
