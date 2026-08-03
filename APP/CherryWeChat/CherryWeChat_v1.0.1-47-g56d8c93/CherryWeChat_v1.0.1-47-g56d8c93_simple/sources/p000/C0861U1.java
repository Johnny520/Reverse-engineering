package p000;

/* JADX INFO: renamed from: U1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0861U1 extends AbstractC2634vj {
    private static final C0861U1 DEFAULT_INSTANCE = null;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER;
    private int ivSize_;

    static {
        C0861U1 r0 = new C0861U1();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0861U1.class, r0);
    }

    /* JADX INFO: renamed from: w */
    public static void m1701w(C0861U1 r1) {
        r1.ivSize_ = 16;
    }

    /* JADX INFO: renamed from: x */
    public static C0861U1 m1702x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static C0818T1 m1703z() {
        return (C0818T1) DEFAULT_INSTANCE.m5152h();
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
        monitor-enter(C0861U1.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0861U1.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0861U1 r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C0818T1(DEFAULT_INSTANCE);
    L25:
        return new C0861U1();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: y */
    public final int m1704y() {
        return this.ivSize_;
    }
}
