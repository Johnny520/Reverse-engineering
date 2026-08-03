package p000;

/* JADX INFO: renamed from: H1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0303H1 extends AbstractC2634vj {
    private static final C0303H1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2744y6 keyValue_ = AbstractC2744y6.f9369b;
    private C0475L1 params_;
    private int version_;

    static {
        C0303H1 c0303h1 = new C0303H1();
        DEFAULT_INSTANCE = c0303h1;
        AbstractC2634vj.m5151t(C0303H1.class, c0303h1);
    }

    /* JADX INFO: renamed from: D */
    public static C0260G1 m646D() {
        return (C0260G1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m647w(C0303H1 c0303h1) {
        c0303h1.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m648x(C0303H1 c0303h1, C0475L1 c0475l1) {
        c0303h1.getClass();
        c0475l1.getClass();
        c0303h1.params_ = c0475l1;
    }

    /* JADX INFO: renamed from: y */
    public static void m649y(C0303H1 c0303h1, C2701x6 c2701x6) {
        c0303h1.getClass();
        c0303h1.keyValue_ = c2701x6;
    }

    /* JADX INFO: renamed from: z */
    public static C0303H1 m650z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final AbstractC2744y6 m651A() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: B */
    public final C0475L1 m652B() {
        C0475L1 c0475l1 = this.params_;
        return c0475l1 == null ? C0475L1.m929x() : c0475l1;
    }

    /* JADX INFO: renamed from: C */
    public final int m653C() {
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
                return new C0303H1();
            case 4:
                return new C0260G1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0303H1.class) {
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
