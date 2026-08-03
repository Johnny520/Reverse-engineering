package p000;

/* JADX INFO: renamed from: vn */
/* JADX INFO: loaded from: classes.dex */
public final class C2638vn extends AbstractC2634vj {
    private static final C2638vn DEFAULT_INSTANCE = null;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER;
    private String keyUri_;

    static {
        C2638vn r0 = new C2638vn();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C2638vn.class, r0);
    }

    public C2638vn() {
        this.keyUri_ = "";
    }

    /* JADX INFO: renamed from: w */
    public static C2638vn m5163w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static C2638vn m5164y(AbstractC2744y6 r1, C0839Tg r2) {
        return (C2638vn) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, r1, r2);
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
        monitor-enter(C2638vn.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C2638vn.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C2638vn r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C1441g7(DEFAULT_INSTANCE, 2);
    L25:
        return new C2638vn();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: x */
    public final String m5165x() {
        return this.keyUri_;
    }
}
