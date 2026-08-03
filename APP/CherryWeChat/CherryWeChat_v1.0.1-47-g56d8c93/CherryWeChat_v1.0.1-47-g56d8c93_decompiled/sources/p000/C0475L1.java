package p000;

/* JADX INFO: renamed from: L1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0475L1 extends AbstractC2634vj {
    private static final C0475L1 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER;
    private int ivSize_;

    static {
        C0475L1 c0475l1 = new C0475L1();
        DEFAULT_INSTANCE = c0475l1;
        AbstractC2634vj.m5151t(C0475L1.class, c0475l1);
    }

    /* JADX INFO: renamed from: w */
    public static void m928w(C0475L1 c0475l1) {
        c0475l1.ivSize_ = 16;
    }

    /* JADX INFO: renamed from: x */
    public static C0475L1 m929x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static C0432K1 m930z() {
        return (C0432K1) DEFAULT_INSTANCE.m5152h();
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new C0475L1();
            case 4:
                return new C0432K1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0475L1.class) {
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
    public final int m931y() {
        return this.ivSize_;
    }
}
