package p000;

/* JADX INFO: renamed from: h7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1485h7 extends AbstractC2634vj {
    private static final C1485h7 DEFAULT_INSTANCE = null;
    private static volatile InterfaceC0466Kt PARSER;

    static {
        C1485h7 r0 = new C1485h7();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C1485h7.class, r0);
    }

    /* JADX INFO: renamed from: w */
    public static C1485h7 m2846w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static C1485h7 m2847x(AbstractC2744y6 r1, C0839Tg r2) {
        return (C1485h7) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, r1, r2);
    }

    @Override // p000.AbstractC2634vj
    /* JADX INFO: renamed from: i */
    public final Object mo44i(int r4) {
        switch(AbstractC0213Ey.m424v(r4)) {
            case 0: goto L30;
            case 1: goto L28;
            case 2: goto L27;
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
        monitor-enter(C1485h7.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C1485h7.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C1441g7(DEFAULT_INSTANCE, 0);
    L25:
        return new C1485h7();
    L27:
        return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0000", null);
    L30:
        return (byte) 1;
    }
}
