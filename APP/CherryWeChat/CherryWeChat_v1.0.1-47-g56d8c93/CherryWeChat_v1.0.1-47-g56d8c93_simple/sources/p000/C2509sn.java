package p000;

/* JADX INFO: renamed from: sn */
/* JADX INFO: loaded from: classes.dex */
public final class C2509sn extends AbstractC2634vj {
    private static final C2509sn DEFAULT_INSTANCE = null;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0458Kl keyInfo_;
    private int primaryKeyId_;

    static {
        C2509sn r0 = new C2509sn();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C2509sn.class, r0);
    }

    public C2509sn() {
        this.keyInfo_ = C0381Iu.f1312d;
    }

    /* JADX INFO: renamed from: w */
    public static void m4990w(C2509sn r0, int r1) {
        r0.primaryKeyId_ = r1;
    }

    /* JADX INFO: renamed from: x */
    public static void m4991x(C2509sn r2, C2466rn r3) {
        r2.getClass();
        InterfaceC0458Kl r0 = r2.keyInfo_;
        if (((AbstractC0172E) r0).f453a == true) goto L9;
        int r1 = r0.size();
        if (r1 != 0) goto L7;
        int r12 = 10;
    L8:
        r2.keyInfo_ = r0.mo716f(r12);
        goto L9
    L7:
        r12 = r1 * 2;
    L9:
        r2.keyInfo_.add(r3);
    }

    /* JADX INFO: renamed from: z */
    public static C2380pn m4992z() {
        return (C2380pn) DEFAULT_INSTANCE.m5152h();
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
        monitor-enter(C2509sn.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C2509sn.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C2509sn r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C2466rn.class});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C2380pn(DEFAULT_INSTANCE);
    L25:
        return new C2509sn();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: y */
    public final C2466rn m4993y() {
        return (C2466rn) this.keyInfo_.get(0);
    }
}
