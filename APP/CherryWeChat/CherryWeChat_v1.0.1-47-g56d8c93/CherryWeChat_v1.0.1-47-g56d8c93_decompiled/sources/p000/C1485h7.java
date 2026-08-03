package p000;

/* JADX INFO: renamed from: h7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1485h7 extends AbstractC2634vj {
    private static final C1485h7 DEFAULT_INSTANCE;
    private static volatile InterfaceC0466Kt PARSER;

    static {
        C1485h7 c1485h7 = new C1485h7();
        DEFAULT_INSTANCE = c1485h7;
        AbstractC2634vj.m5151t(C1485h7.class, c1485h7);
    }

    /* JADX INFO: renamed from: w */
    public static C1485h7 m2846w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static C1485h7 m2847x(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C1485h7) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new C1485h7();
            case 4:
                return new C1441g7(DEFAULT_INSTANCE, 0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C1485h7.class) {
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
}
