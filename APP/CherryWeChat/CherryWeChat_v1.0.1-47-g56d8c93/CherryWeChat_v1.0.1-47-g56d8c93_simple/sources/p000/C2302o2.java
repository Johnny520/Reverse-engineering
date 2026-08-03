package p000;

/* JADX INFO: renamed from: o2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2302o2 extends AbstractC2634vj {
    private static final C2302o2 DEFAULT_INSTANCE = null;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2744y6 keyValue_;
    private int version_;

    static {
        C2302o2 r0 = new C2302o2();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C2302o2.class, r0);
    }

    public C2302o2() {
        this.keyValue_ = AbstractC2744y6.f9369b;
    }

    /* JADX INFO: renamed from: A */
    public static C2259n2 m4674A() {
        return (C2259n2) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: B */
    public static C2302o2 m4675B(AbstractC2744y6 r1, C0839Tg r2) {
        return (C2302o2) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, r1, r2);
    }

    /* JADX INFO: renamed from: w */
    public static void m4676w(C2302o2 r1) {
        r1.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m4677x(C2302o2 r0, C2701x6 r1) {
        r0.getClass();
        r0.keyValue_ = r1;
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
        monitor-enter(C2302o2.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C2302o2.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C2302o2 r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C2259n2(DEFAULT_INSTANCE);
    L25:
        return new C2302o2();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC2744y6 m4678y() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: z */
    public final int m4679z() {
        return this.version_;
    }
}
