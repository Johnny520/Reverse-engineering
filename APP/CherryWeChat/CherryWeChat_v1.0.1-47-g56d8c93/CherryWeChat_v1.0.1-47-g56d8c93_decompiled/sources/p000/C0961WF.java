package p000;

/* JADX INFO: renamed from: WF */
/* JADX INFO: loaded from: classes.dex */
public final class C0961WF extends AbstractC2634vj {
    private static final C0961WF DEFAULT_INSTANCE;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        C0961WF c0961wf = new C0961WF();
        DEFAULT_INSTANCE = c0961wf;
        AbstractC2634vj.m5151t(C0961WF.class, c0961wf);
    }

    /* JADX INFO: renamed from: w */
    public static C0961WF m1837w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static C0961WF m1838x(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C0961WF) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 3:
                return new C0961WF();
            case 4:
                return new C1441g7(DEFAULT_INSTANCE, 5);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0961WF.class) {
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
