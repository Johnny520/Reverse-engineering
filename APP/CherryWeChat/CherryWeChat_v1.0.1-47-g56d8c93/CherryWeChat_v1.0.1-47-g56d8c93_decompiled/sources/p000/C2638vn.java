package p000;

/* JADX INFO: renamed from: vn */
/* JADX INFO: loaded from: classes.dex */
public final class C2638vn extends AbstractC2634vj {
    private static final C2638vn DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER;
    private String keyUri_ = "";

    static {
        C2638vn c2638vn = new C2638vn();
        DEFAULT_INSTANCE = c2638vn;
        AbstractC2634vj.m5151t(C2638vn.class, c2638vn);
    }

    /* JADX INFO: renamed from: w */
    public static C2638vn m5163w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static C2638vn m5164y(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C2638vn) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new C2638vn();
            case 4:
                return new C1441g7(DEFAULT_INSTANCE, 2);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C2638vn.class) {
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
    public final String m5165x() {
        return this.keyUri_;
    }
}
