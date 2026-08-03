package p000;

/* JADX INFO: renamed from: WF */
/* JADX INFO: loaded from: classes.dex */
public final class C0961WF extends AbstractC2634vj {
    private static final C0961WF DEFAULT_INSTANCE = null;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        C0961WF r0 = new C0961WF();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0961WF.class, r0);
    }

    /* JADX INFO: renamed from: w */
    public static C0961WF m1837w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static C0961WF m1838x(AbstractC2744y6 r1, C0839Tg r2) {
        return (C0961WF) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, r1, r2);
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
        monitor-enter(C0961WF.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0961WF.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0961WF r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C1441g7(DEFAULT_INSTANCE, 5);
    L25:
        return new C0961WF();
    L31:
        return (byte) 1;
    }
}
