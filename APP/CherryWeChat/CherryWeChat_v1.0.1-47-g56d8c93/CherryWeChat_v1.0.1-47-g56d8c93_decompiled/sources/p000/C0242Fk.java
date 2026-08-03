package p000;

/* JADX INFO: renamed from: Fk */
/* JADX INFO: loaded from: classes.dex */
public final class C0242Fk extends AbstractC2634vj {
    private static final C0242Fk DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private C0371Ik params_;
    private int version_;

    static {
        C0242Fk c0242Fk = new C0242Fk();
        DEFAULT_INSTANCE = c0242Fk;
        AbstractC2634vj.m5151t(C0242Fk.class, c0242Fk);
    }

    /* JADX INFO: renamed from: B */
    public static C0199Ek m508B() {
        return (C0199Ek) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: C */
    public static C0242Fk m509C(AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) {
        return (C0242Fk) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, abstractC2744y6, c0839Tg);
    }

    /* JADX INFO: renamed from: w */
    public static void m510w(C0242Fk c0242Fk, C0371Ik c0371Ik) {
        c0242Fk.getClass();
        c0242Fk.params_ = c0371Ik;
    }

    /* JADX INFO: renamed from: x */
    public static void m511x(C0242Fk c0242Fk, int i) {
        c0242Fk.keySize_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static C0242Fk m512y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final C0371Ik m513A() {
        C0371Ik c0371Ik = this.params_;
        return c0371Ik == null ? C0371Ik.m817y() : c0371Ik;
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new C0242Fk();
            case 4:
                return new C0199Ek(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0242Fk.class) {
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
    public final int m514z() {
        return this.keySize_;
    }
}
