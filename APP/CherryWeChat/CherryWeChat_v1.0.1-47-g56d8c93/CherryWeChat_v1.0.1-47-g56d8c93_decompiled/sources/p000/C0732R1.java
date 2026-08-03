package p000;

/* JADX INFO: renamed from: R1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0732R1 extends AbstractC2634vj {
    private static final C0732R1 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER;
    private int keySize_;
    private C0861U1 params_;

    static {
        C0732R1 c0732r1 = new C0732R1();
        DEFAULT_INSTANCE = c0732r1;
        AbstractC2634vj.m5151t(C0732R1.class, c0732r1);
    }

    /* JADX INFO: renamed from: A */
    public static C0690Q1 m1525A() {
        return (C0690Q1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: B */
    public static C0732R1 m1526B(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C0732R1) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m1527w(C0732R1 c0732r1, C0861U1 c0861u1) {
        c0732r1.getClass();
        c0732r1.params_ = c0861u1;
    }

    /* JADX INFO: renamed from: x */
    public static void m1528x(C0732R1 c0732r1, int i) {
        c0732r1.keySize_ = i;
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
                return new C0732R1();
            case 4:
                return new C0690Q1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0732R1.class) {
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
    public final int m1529y() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: z */
    public final C0861U1 m1530z() {
        C0861U1 c0861u1 = this.params_;
        return c0861u1 == null ? C0861U1.m1702x() : c0861u1;
    }
}
