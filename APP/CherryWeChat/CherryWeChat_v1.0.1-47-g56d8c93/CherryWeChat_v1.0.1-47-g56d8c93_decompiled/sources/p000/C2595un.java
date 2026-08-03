package p000;

/* JADX INFO: renamed from: un */
/* JADX INFO: loaded from: classes.dex */
public final class C2595un extends AbstractC2634vj {
    private static final C2595un DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C2638vn params_;
    private int version_;

    static {
        C2595un c2595un = new C2595un();
        DEFAULT_INSTANCE = c2595un;
        AbstractC2634vj.m5151t(C2595un.class, c2595un);
    }

    /* JADX INFO: renamed from: A */
    public static C2552tn m5102A() {
        return (C2552tn) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: B */
    public static C2595un m5103B(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C2595un) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m5104w(C2595un c2595un) {
        c2595un.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m5105x(C2595un c2595un, C2638vn c2638vn) {
        c2595un.getClass();
        c2638vn.getClass();
        c2595un.params_ = c2638vn;
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
                return new C2595un();
            case 4:
                return new C2552tn(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C2595un.class) {
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
    public final C2638vn m5106y() {
        C2638vn c2638vn = this.params_;
        return c2638vn == null ? C2638vn.m5163w() : c2638vn;
    }

    /* JADX INFO: renamed from: z */
    public final int m5107z() {
        return this.version_;
    }
}
