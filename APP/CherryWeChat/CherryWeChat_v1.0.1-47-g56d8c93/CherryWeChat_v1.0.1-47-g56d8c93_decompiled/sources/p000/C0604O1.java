package p000;

/* JADX INFO: renamed from: O1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0604O1 extends AbstractC2634vj {
    private static final C0604O1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2744y6 keyValue_ = AbstractC2744y6.f9369b;
    private C0861U1 params_;
    private int version_;

    static {
        C0604O1 c0604o1 = new C0604O1();
        DEFAULT_INSTANCE = c0604o1;
        AbstractC2634vj.m5151t(C0604O1.class, c0604o1);
    }

    /* JADX INFO: renamed from: C */
    public static C0561N1 m1178C() {
        return (C0561N1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: D */
    public static C0604O1 m1179D(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C0604O1) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m1180w(C0604O1 c0604o1) {
        c0604o1.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m1181x(C0604O1 c0604o1, C0861U1 c0861u1) {
        c0604o1.getClass();
        c0861u1.getClass();
        c0604o1.params_ = c0861u1;
    }

    /* JADX INFO: renamed from: y */
    public static void m1182y(C0604O1 c0604o1, C2701x6 c2701x6) {
        c0604o1.getClass();
        c0604o1.keyValue_ = c2701x6;
    }

    /* JADX INFO: renamed from: A */
    public final C0861U1 m1183A() {
        C0861U1 c0861u1 = this.params_;
        return c0861u1 == null ? C0861U1.m1702x() : c0861u1;
    }

    /* JADX INFO: renamed from: B */
    public final int m1184B() {
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
                return new C0604O1();
            case 4:
                return new C0561N1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0604O1.class) {
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
    public final AbstractC2744y6 m1185z() {
        return this.keyValue_;
    }
}
