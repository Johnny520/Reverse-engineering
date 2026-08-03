package p000;

/* JADX INFO: renamed from: B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0045B1 extends AbstractC2634vj {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C0045B1 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0303H1 aesCtrKey_;
    private C0113Ck hmacKey_;
    private int version_;

    static {
        C0045B1 c0045b1 = new C0045B1();
        DEFAULT_INSTANCE = c0045b1;
        AbstractC2634vj.m5151t(C0045B1.class, c0045b1);
    }

    /* JADX INFO: renamed from: C */
    public static C0002A1 m68C() {
        return (C0002A1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: D */
    public static C0045B1 m69D(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C0045B1) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m70w(C0045B1 c0045b1) {
        c0045b1.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m71x(C0045B1 c0045b1, C0303H1 c0303h1) {
        c0045b1.getClass();
        c0303h1.getClass();
        c0045b1.aesCtrKey_ = c0303h1;
    }

    /* JADX INFO: renamed from: y */
    public static void m72y(C0045B1 c0045b1, C0113Ck c0113Ck) {
        c0045b1.getClass();
        c0113Ck.getClass();
        c0045b1.hmacKey_ = c0113Ck;
    }

    /* JADX INFO: renamed from: A */
    public final C0113Ck m73A() {
        C0113Ck c0113Ck = this.hmacKey_;
        return c0113Ck == null ? C0113Ck.m178z() : c0113Ck;
    }

    /* JADX INFO: renamed from: B */
    public final int m74B() {
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new C0045B1();
            case 4:
                return new C0002A1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0045B1.class) {
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
    public final C0303H1 m75z() {
        C0303H1 c0303h1 = this.aesCtrKey_;
        return c0303h1 == null ? C0303H1.m650z() : c0303h1;
    }
}
