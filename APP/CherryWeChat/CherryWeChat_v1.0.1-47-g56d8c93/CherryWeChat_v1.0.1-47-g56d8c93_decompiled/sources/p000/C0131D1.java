package p000;

/* JADX INFO: renamed from: D1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0131D1 extends AbstractC2634vj {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C0131D1 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER;
    private C0389J1 aesCtrKeyFormat_;
    private C0242Fk hmacKeyFormat_;

    static {
        C0131D1 c0131d1 = new C0131D1();
        DEFAULT_INSTANCE = c0131d1;
        AbstractC2634vj.m5151t(C0131D1.class, c0131d1);
    }

    /* JADX INFO: renamed from: A */
    public static C0088C1 m224A() {
        return (C0088C1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: B */
    public static C0131D1 m225B(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C0131D1) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m226w(C0131D1 c0131d1, C0389J1 c0389j1) {
        c0131d1.getClass();
        c0131d1.aesCtrKeyFormat_ = c0389j1;
    }

    /* JADX INFO: renamed from: x */
    public static void m227x(C0131D1 c0131d1, C0242Fk c0242Fk) {
        c0131d1.getClass();
        c0131d1.hmacKeyFormat_ = c0242Fk;
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new C0131D1();
            case 4:
                return new C0088C1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0131D1.class) {
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
    public final C0389J1 m228y() {
        C0389J1 c0389j1 = this.aesCtrKeyFormat_;
        return c0389j1 == null ? C0389J1.m825y() : c0389j1;
    }

    /* JADX INFO: renamed from: z */
    public final C0242Fk m229z() {
        C0242Fk c0242Fk = this.hmacKeyFormat_;
        return c0242Fk == null ? C0242Fk.m512y() : c0242Fk;
    }
}
