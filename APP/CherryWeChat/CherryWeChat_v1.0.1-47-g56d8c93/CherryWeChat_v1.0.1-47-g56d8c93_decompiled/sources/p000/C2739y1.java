package p000;

/* JADX INFO: renamed from: y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2739y1 extends AbstractC2634vj {
    private static final C2739y1 DEFAULT_INSTANCE;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        C2739y1 c2739y1 = new C2739y1();
        DEFAULT_INSTANCE = c2739y1;
        AbstractC2634vj.m5151t(C2739y1.class, c2739y1);
    }

    /* JADX INFO: renamed from: w */
    public static void m5300w(C2739y1 c2739y1) {
        c2739y1.tagSize_ = 16;
    }

    /* JADX INFO: renamed from: x */
    public static C2739y1 m5301x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static C2696x1 m5302z() {
        return (C2696x1) DEFAULT_INSTANCE.m5152h();
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new C2739y1();
            case 4:
                return new C2696x1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C2739y1.class) {
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
    public final int m5303y() {
        return this.tagSize_;
    }
}
