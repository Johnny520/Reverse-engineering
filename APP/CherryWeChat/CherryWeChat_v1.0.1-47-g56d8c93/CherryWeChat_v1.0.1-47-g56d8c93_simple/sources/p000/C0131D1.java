package p000;

/* JADX INFO: renamed from: D1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0131D1 extends AbstractC2634vj {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C0131D1 DEFAULT_INSTANCE = null;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER;
    private C0389J1 aesCtrKeyFormat_;
    private C0242Fk hmacKeyFormat_;

    static {
        C0131D1 r0 = new C0131D1();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0131D1.class, r0);
    }

    /* JADX INFO: renamed from: A */
    public static C0088C1 m224A() {
        return (C0088C1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: B */
    public static C0131D1 m225B(AbstractC2744y6 r1, C0839Tg r2) {
        return (C0131D1) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, r1, r2);
    }

    /* JADX INFO: renamed from: w */
    public static void m226w(C0131D1 r0, C0389J1 r1) {
        r0.getClass();
        r0.aesCtrKeyFormat_ = r1;
    }

    /* JADX INFO: renamed from: x */
    public static void m227x(C0131D1 r0, C0242Fk r1) {
        r0.getClass();
        r0.hmacKeyFormat_ = r1;
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
        monitor-enter(C0131D1.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0131D1.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0131D1 r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C0088C1(DEFAULT_INSTANCE);
    L25:
        return new C0131D1();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: y */
    public final C0389J1 m228y() {
        C0389J1 r0 = this.aesCtrKeyFormat_;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return C0389J1.m825y();
    }

    /* JADX INFO: renamed from: z */
    public final C0242Fk m229z() {
        C0242Fk r0 = this.hmacKeyFormat_;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return C0242Fk.m512y();
    }
}
