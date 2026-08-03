package p000;

/* JADX INFO: renamed from: An */
/* JADX INFO: loaded from: classes.dex */
public final class C0030An extends AbstractC2634vj {
    private static final C0030An DEFAULT_INSTANCE = null;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER;
    private C1376en dekTemplate_;
    private String kekUri_;

    static {
        C0030An r0 = new C0030An();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0030An.class, r0);
    }

    public C0030An() {
        this.kekUri_ = "";
    }

    /* JADX INFO: renamed from: A */
    public static C0030An m42A(AbstractC2744y6 r1, C0839Tg r2) {
        return (C0030An) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, r1, r2);
    }

    /* JADX INFO: renamed from: w */
    public static C0030An m43w() {
        return DEFAULT_INSTANCE;
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
        monitor-enter(C0030An.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0030An.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0030An r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C1441g7(DEFAULT_INSTANCE, 3);
    L25:
        return new C0030An();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: x */
    public final C1376en m45x() {
        C1376en r0 = this.dekTemplate_;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return C1376en.m2664z();
    }

    /* JADX INFO: renamed from: y */
    public final String m46y() {
        return this.kekUri_;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m47z() {
        if (this.dekTemplate_ == null) goto L6;
        return true;
    L6:
        return false;
    }
}
