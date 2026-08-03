package p000;

/* JADX INFO: renamed from: B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0045B1 extends AbstractC2634vj {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C0045B1 DEFAULT_INSTANCE = null;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0303H1 aesCtrKey_;
    private C0113Ck hmacKey_;
    private int version_;

    static {
        C0045B1 r0 = new C0045B1();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0045B1.class, r0);
    }

    /* JADX INFO: renamed from: C */
    public static C0002A1 m68C() {
        return (C0002A1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: D */
    public static C0045B1 m69D(AbstractC2744y6 r1, C0839Tg r2) {
        return (C0045B1) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, r1, r2);
    }

    /* JADX INFO: renamed from: w */
    public static void m70w(C0045B1 r1) {
        r1.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m71x(C0045B1 r0, C0303H1 r1) {
        r0.getClass();
        r1.getClass();
        r0.aesCtrKey_ = r1;
    }

    /* JADX INFO: renamed from: y */
    public static void m72y(C0045B1 r0, C0113Ck r1) {
        r0.getClass();
        r1.getClass();
        r0.hmacKey_ = r1;
    }

    /* JADX INFO: renamed from: A */
    public final C0113Ck m73A() {
        C0113Ck r0 = this.hmacKey_;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return C0113Ck.m178z();
    }

    /* JADX INFO: renamed from: B */
    public final int m74B() {
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
        monitor-enter(C0045B1.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0045B1.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0045B1 r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C0002A1(DEFAULT_INSTANCE);
    L25:
        return new C0045B1();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: z */
    public final C0303H1 m75z() {
        C0303H1 r0 = this.aesCtrKey_;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return C0303H1.m650z();
    }
}
