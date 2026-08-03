package p000;

/* JADX INFO: renamed from: rn */
/* JADX INFO: loaded from: classes.dex */
public final class C2466rn extends AbstractC2634vj {
    private static final C2466rn DEFAULT_INSTANCE = null;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_;

    static {
        C2466rn r0 = new C2466rn();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C2466rn.class, r0);
    }

    public C2466rn() {
        this.typeUrl_ = "";
    }

    /* JADX INFO: renamed from: B */
    public static C2423qn m4954B() {
        return (C2423qn) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m4955w(C2466rn r0, String r1) {
        r0.getClass();
        r1.getClass();
        r0.typeUrl_ = r1;
    }

    /* JADX INFO: renamed from: x */
    public static void m4956x(C2466rn r0, EnumC2773yt r1) {
        r0.getClass();
        r0.outputPrefixType_ = r1.m5345b();
    }

    /* JADX INFO: renamed from: y */
    public static void m4957y(C2466rn r0, EnumC1271cn r1) {
        r0.getClass();
        r0.status_ = r1.m2409a();
    }

    /* JADX INFO: renamed from: z */
    public static void m4958z(C2466rn r0, int r1) {
        r0.keyId_ = r1;
    }

    /* JADX INFO: renamed from: A */
    public final int m4959A() {
        return this.keyId_;
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
        monitor-enter(C2466rn.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C2466rn.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C2466rn r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C2423qn(DEFAULT_INSTANCE);
    L25:
        return new C2466rn();
    L31:
        return (byte) 1;
    }
}
