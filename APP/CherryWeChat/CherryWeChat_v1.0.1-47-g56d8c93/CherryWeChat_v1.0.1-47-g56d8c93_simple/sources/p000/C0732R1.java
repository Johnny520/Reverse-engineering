package p000;

/* JADX INFO: renamed from: R1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0732R1 extends AbstractC2634vj {
    private static final C0732R1 DEFAULT_INSTANCE = null;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER;
    private int keySize_;
    private C0861U1 params_;

    static {
        C0732R1 r0 = new C0732R1();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0732R1.class, r0);
    }

    /* JADX INFO: renamed from: A */
    public static C0690Q1 m1525A() {
        return (C0690Q1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: B */
    public static C0732R1 m1526B(AbstractC2744y6 r1, C0839Tg r2) {
        return (C0732R1) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, r1, r2);
    }

    /* JADX INFO: renamed from: w */
    public static void m1527w(C0732R1 r0, C0861U1 r1) {
        r0.getClass();
        r0.params_ = r1;
    }

    /* JADX INFO: renamed from: x */
    public static void m1528x(C0732R1 r0, int r1) {
        r0.keySize_ = r1;
    }

    @Override // p000.AbstractC2634vj
    /* JADX INFO: renamed from: i */
    public final Object mo44i(int r4) {
        switch(AbstractC0213Ey.m424v(r4)) {
            case 0: goto L31;
            case 1: goto L28;
            case 2: goto L26;
            case 3: goto L25;
            case 4: goto L23;
            case 5: goto L21;
            case 6: goto L6;
            default: goto L5;
        };
    L6:
        InterfaceC0466Kt r42 = PARSER;
        if (r42 == null) goto L9;
        return r42;
    L9:
        monitor-enter(C0732R1.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0732R1.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0732R1 r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C0690Q1(DEFAULT_INSTANCE);
    L25:
        return new C0732R1();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: y */
    public final int m1529y() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: z */
    public final C0861U1 m1530z() {
        C0861U1 r0 = this.params_;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return C0861U1.m1702x();
    }
}
