package p000;

/* JADX INFO: renamed from: J1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0389J1 extends AbstractC2634vj {
    private static final C0389J1 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER;
    private int keySize_;
    private C0475L1 params_;

    static {
        C0389J1 c0389j1 = new C0389J1();
        DEFAULT_INSTANCE = c0389j1;
        AbstractC2634vj.m5151t(C0389J1.class, c0389j1);
    }

    /* JADX INFO: renamed from: B */
    public static C0346I1 m822B() {
        return (C0346I1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m823w(C0389J1 c0389j1, C0475L1 c0475l1) {
        c0389j1.getClass();
        c0389j1.params_ = c0475l1;
    }

    /* JADX INFO: renamed from: x */
    public static void m824x(C0389J1 c0389j1, int i) {
        c0389j1.keySize_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static C0389J1 m825y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final C0475L1 m826A() {
        C0475L1 c0475l1 = this.params_;
        return c0475l1 == null ? C0475L1.m929x() : c0475l1;
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new C0389J1();
            case 4:
                return new C0346I1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0389J1.class) {
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
    public final int m827z() {
        return this.keySize_;
    }
}
