package p000;

/* JADX INFO: renamed from: Ck */
/* JADX INFO: loaded from: classes.dex */
public final class C0113Ck extends AbstractC2634vj {
    private static final C0113Ck DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2744y6 keyValue_ = AbstractC2744y6.f9369b;
    private C0371Ik params_;
    private int version_;

    static {
        C0113Ck c0113Ck = new C0113Ck();
        DEFAULT_INSTANCE = c0113Ck;
        AbstractC2634vj.m5151t(C0113Ck.class, c0113Ck);
    }

    /* JADX INFO: renamed from: D */
    public static C0070Bk m173D() {
        return (C0070Bk) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: E */
    public static C0113Ck m174E(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C0113Ck) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m175w(C0113Ck c0113Ck) {
        c0113Ck.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m176x(C0113Ck c0113Ck, C0371Ik c0371Ik) {
        c0113Ck.getClass();
        c0371Ik.getClass();
        c0113Ck.params_ = c0371Ik;
    }

    /* JADX INFO: renamed from: y */
    public static void m177y(C0113Ck c0113Ck, C2701x6 c2701x6) {
        c0113Ck.getClass();
        c0113Ck.keyValue_ = c2701x6;
    }

    /* JADX INFO: renamed from: z */
    public static C0113Ck m178z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final AbstractC2744y6 m179A() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: B */
    public final C0371Ik m180B() {
        C0371Ik c0371Ik = this.params_;
        return c0371Ik == null ? C0371Ik.m817y() : c0371Ik;
    }

    /* JADX INFO: renamed from: C */
    public final int m181C() {
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new C0113Ck();
            case 4:
                return new C0070Bk(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0113Ck.class) {
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
