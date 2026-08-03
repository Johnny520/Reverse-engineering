package p000;

/* JADX INFO: renamed from: e7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1353e7 extends AbstractC2634vj {
    private static final C1353e7 DEFAULT_INSTANCE = null;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2744y6 keyValue_;
    private int version_;

    static {
        C1353e7 r0 = new C1353e7();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C1353e7.class, r0);
    }

    public C1353e7() {
        this.keyValue_ = AbstractC2744y6.f9369b;
    }

    /* JADX INFO: renamed from: A */
    public static C1310d7 m2623A() {
        return (C1310d7) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: B */
    public static C1353e7 m2624B(AbstractC2744y6 r1, C0839Tg r2) {
        return (C1353e7) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, r1, r2);
    }

    /* JADX INFO: renamed from: w */
    public static void m2625w(C1353e7 r1) {
        r1.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m2626x(C1353e7 r0, C2701x6 r1) {
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
        monitor-enter(C1353e7.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C1353e7.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C1353e7 r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C1310d7(DEFAULT_INSTANCE);
    L25:
        return new C1353e7();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC2744y6 m2627y() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: z */
    public final int m2628z() {
        return this.version_;
    }
}
