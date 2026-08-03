package p000;

/* JADX INFO: renamed from: An */
/* JADX INFO: loaded from: classes.dex */
public final class C0030An extends AbstractC2634vj {
    private static final C0030An DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER;
    private C1376en dekTemplate_;
    private String kekUri_ = "";

    static {
        C0030An c0030An = new C0030An();
        DEFAULT_INSTANCE = c0030An;
        AbstractC2634vj.m5151t(C0030An.class, c0030An);
    }

    /* JADX INFO: renamed from: A */
    public static C0030An m42A(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C0030An) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static C0030An m43w() {
        return DEFAULT_INSTANCE;
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new C0030An();
            case 4:
                return new C1441g7(DEFAULT_INSTANCE, 3);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0030An.class) {
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
    public final C1376en m45x() {
        C1376en c1376en = this.dekTemplate_;
        return c1376en == null ? C1376en.m2664z() : c1376en;
    }

    /* JADX INFO: renamed from: y */
    public final String m46y() {
        return this.kekUri_;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m47z() {
        return this.dekTemplate_ != null;
    }
}
