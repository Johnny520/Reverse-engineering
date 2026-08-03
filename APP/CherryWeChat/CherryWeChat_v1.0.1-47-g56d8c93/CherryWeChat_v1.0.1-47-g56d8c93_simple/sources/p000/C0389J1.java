package p000;

/* JADX INFO: renamed from: J1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0389J1 extends AbstractC2634vj {
    private static final C0389J1 DEFAULT_INSTANCE = null;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER;
    private int keySize_;
    private C0475L1 params_;

    static {
        C0389J1 r0 = new C0389J1();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0389J1.class, r0);
    }

    /* JADX INFO: renamed from: B */
    public static C0346I1 m822B() {
        return (C0346I1) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m823w(C0389J1 r0, C0475L1 r1) {
        r0.getClass();
        r0.params_ = r1;
    }

    /* JADX INFO: renamed from: x */
    public static void m824x(C0389J1 r0, int r1) {
        r0.keySize_ = r1;
    }

    /* JADX INFO: renamed from: y */
    public static C0389J1 m825y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final C0475L1 m826A() {
        C0475L1 r0 = this.params_;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return C0475L1.m929x();
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
        monitor-enter(C0389J1.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0389J1.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0389J1 r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C0346I1(DEFAULT_INSTANCE);
    L25:
        return new C0389J1();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: z */
    public final int m827z() {
        return this.keySize_;
    }
}
