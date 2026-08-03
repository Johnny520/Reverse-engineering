package p000;

/* JADX INFO: renamed from: H1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0303H1 extends AbstractC2634vj {
    private static final C0303H1 DEFAULT_INSTANCE = null;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2744y6 keyValue_;
    private C0475L1 params_;
    private int version_;

    static {
        C0303H1 r0 = new C0303H1();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0303H1.class, r0);
    }

    public C0303H1() {
        this.keyValue_ = AbstractC2744y6.f9369b;
    }

    /* JADX INFO: renamed from: D */
    public static C0260G1 m646D() {
        return (C0260G1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m647w(C0303H1 r1) {
        r1.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m648x(C0303H1 r0, C0475L1 r1) {
        r0.getClass();
        r1.getClass();
        r0.params_ = r1;
    }

    /* JADX INFO: renamed from: y */
    public static void m649y(C0303H1 r0, C2701x6 r1) {
        r0.getClass();
        r0.keyValue_ = r1;
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
        C0475L1 r0 = this.params_;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return C0475L1.m929x();
    }

    /* JADX INFO: renamed from: C */
    public final int m653C() {
        return this.version_;
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
        monitor-enter(C0303H1.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0303H1.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0303H1 r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C0260G1(DEFAULT_INSTANCE);
    L25:
        return new C0303H1();
    L31:
        return (byte) 1;
    }
}
